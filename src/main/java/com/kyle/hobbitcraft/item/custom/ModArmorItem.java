package com.kyle.hobbitcraft.item.custom;

import com.google.common.collect.ImmutableMap;
import com.kyle.hobbitcraft.item.ModArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffectInstance[]> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance[]>())
                    .put(ModArmorMaterials.DREADED, new MobEffectInstance[] {
                            new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2147483647, 1, false, false, false)
                    })
                    .put(ModArmorMaterials.KYLE, new MobEffectInstance[] {
                            new MobEffectInstance(MobEffects.WATER_BREATHING, 2147483647, 1, false, false, false)
                    })
                    .put(ModArmorMaterials.VINO, new MobEffectInstance[] {
                            new MobEffectInstance(MobEffects.HEALTH_BOOST, 2147483647, 1, false, false, false),
                            new MobEffectInstance(MobEffects.REGENERATION, 2147483647, 1, false, false, false)
                    })
                    .put(ModArmorMaterials.WIBKITIUM, new MobEffectInstance[] {
                            new MobEffectInstance(MobEffects.SLOW_FALLING, 2147483647, 1, false, false, false),
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 2147483647, 1, false, false, false)
                    })
                    .put(ModArmorMaterials.HOBBITCRAFTIUM, new MobEffectInstance[] {
                            new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2147483647, 5, false, false, false),
                            new MobEffectInstance(MobEffects.SATURATION, 2147483647, 5, false, false, false),
                            new MobEffectInstance(MobEffects.SLOW_FALLING, 2147483647, 5, false, false, false),
                            new MobEffectInstance(MobEffects.REGENERATION, 2147483647, 5, false, false, false),
                            new MobEffectInstance(MobEffects.ABSORPTION, 2147483647, 5, false, false, false),
                            new MobEffectInstance(MobEffects.WATER_BREATHING, 2147483647, 5, false, false, false),
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2147483647, 5, false, false, false),
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 2147483647, 5, false, false, false),
                            new MobEffectInstance(MobEffects.HEALTH_BOOST, 2147483647, 5, false, false, false),
                            new MobEffectInstance(MobEffects.CONDUIT_POWER, 2147483647, 5, false, false, false)
                    }).build();

    private ArmorMaterial[] lastArmorState = new ArmorMaterial[4];

    public ModArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void onInventoryTick(ItemStack stack, Level world, Player player, int slotIndex, int selectedIndex) {
        if (!world.isClientSide()) {
            // Only manage effects when armor changes
            if (armorChanged(player)) {
                removeIncorrectEffects(player);
                applyCorrectEffects(player);
            }
        }
    }

    private boolean armorChanged(Player player) {
        ArmorMaterial[] currentArmorState = new ArmorMaterial[4];

        // Check all armor slots
        for (int i = 0; i < 4; i++) {
            ItemStack stack = player.getInventory().armor.get(i);
            if (stack.getItem() instanceof ArmorItem) {
                currentArmorState[i] = ((ArmorItem) stack.getItem()).getMaterial();
            } else {
                currentArmorState[i] = null; // Handle empty slots
            }
        }

        // Check if there was any change in armor state
        boolean hasChanged = false;
        for (int i = 0; i < 4; i++) {
            if (currentArmorState[i] != lastArmorState[i]) {
                hasChanged = true;
                break;
            }
        }

        if (hasChanged) {
            System.arraycopy(currentArmorState, 0, lastArmorState, 0, 4);
        }

        return hasChanged;
    }

    private void removeIncorrectEffects(Player player) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance[]> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial armorMaterial = entry.getKey();
            MobEffectInstance[] effects = entry.getValue();

            if (!hasCorrectArmorOn(armorMaterial, player)) {
                for (MobEffectInstance effect : effects) {
                    if (player.hasEffect(effect.getEffect())) {
                        player.removeEffect(effect.getEffect());
                    }
                }
            }
        }
    }

    private void applyCorrectEffects(Player player) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance[]> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial armorMaterial = entry.getKey();
            MobEffectInstance[] effects = entry.getValue();

            if (hasCorrectArmorOn(armorMaterial, player)) {
                for (MobEffectInstance effect : effects) {
                    if (!player.hasEffect(effect.getEffect())) {
                        player.addEffect(new MobEffectInstance(effect));
                    }
                }
            }
        }
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        ArmorItem boots = getArmorItem(player, 0);
        ArmorItem trousers = getArmorItem(player, 1);
        ArmorItem chestplate = getArmorItem(player, 2);
        ArmorItem helmet = getArmorItem(player, 3);

        // Check if all armor pieces are worn and match the expected material
        return boots != null && trousers != null && chestplate != null && helmet != null &&
                boots.getMaterial() == material &&
                trousers.getMaterial() == material &&
                chestplate.getMaterial() == material &&
                helmet.getMaterial() == material;
    }

    private ArmorItem getArmorItem(Player player, int index) {
        ItemStack stack = player.getInventory().armor.get(index);
        // Only return an ArmorItem if it's not an empty slot (AirItem)
        return (stack.getItem() instanceof ArmorItem) ? (ArmorItem) stack.getItem() : null;
    }
}
