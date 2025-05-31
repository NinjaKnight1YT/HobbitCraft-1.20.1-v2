package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HobbitCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // PROJECTE BASE ITEMS

        projecteItem(ModItems.INERT_TOME);
        projecteItem(ModItems.INERT_PHILOSOPHERS_STONE);
        projecteItem(ModItems.INERT_TRANSMUTATION_TABLE);
        projecteItem(ModItems.INERT_TRANSMUTATION_TABLET);

        // DREADED ITEMS

        simpleDreadedItem(ModItems.DREADED_DISC);
        simpleDreadedItem(ModItems.RAW_DREAD);
        simpleDreadedItem(ModItems.CRUSHED_RAW_DREAD);
        simpleDreadedItem(ModItems.DREADED_INGOT);
        simpleDreadedItem(ModItems.DREADED_NUGGET);
        simpleDreadedItem(ModItems.DREADED_DUST);
        dreadedArmorItem(ModItems.DREADED_HELMET);
        dreadedArmorItem(ModItems.DREADED_CHESTPLATE);
        dreadedArmorItem(ModItems.DREADED_TROUSERS);
        dreadedArmorItem(ModItems.DREADED_BOOTS);
        simpleDreadedItem(ModItems.TINY_DREADED_DUST);
        projecteDreadedItem(ModItems.INERT_DREADED_TOME);
        projecteDreadedItem(ModItems.INERT_DREADED_PHILOSOPHERS_STONE);
        projecteDreadedItem(ModItems.INERT_DREADED_TRANSMUTATION_TABLE);
        projecteDreadedItem(ModItems.INERT_DREADED_TRANSMUTATION_TABLET);
        projecteDreadedItem(ModItems.DREADED_STAR_EIN);
        projecteDreadedItem(ModItems.DREADED_STAR_ZWEI);
        projecteDreadedItem(ModItems.DREADED_STAR_DREI);
        projecteDreadedItem(ModItems.DREADED_STAR_VIER);
        projecteDreadedItem(ModItems.DREADED_STAR_SPHERE);
        projecteDreadedItem(ModItems.DREADED_STAR_OMEGA);
        handheldDreadedItem(ModItems.DREADED_SWORD);
        handheldDreadedItem(ModItems.DREADED_AXE);
        handheldDreadedItem(ModItems.DREADED_PICKAXE);
        handheldDreadedItem(ModItems.DREADED_SHOVEL);
        handheldDreadedItem(ModItems.DREADED_HOE);
        mekanismDreadedItem(ModItems.DREADED_ALLOY);
        mekanismDreadedItem(ModItems.DREADED_CONTROL_CIRCUIT);
        mekanismDreadedItem(ModItems.ENRICHED_DREAD);
        ae2DreadedItem(ModItems.DREADED_CIRCUIT);
        ae2DreadedItem(ModItems.DREADED_PRESS);
        ae2DreadedItem(ModItems.PRINTED_DREAD);


        // HOBBITCRAFTIUM ITEMS

        simpleHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_INGOT);
        simpleHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_NUGGET);
        simpleHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_DUST);
        simpleHobbitcraftiumItem(ModItems.TINY_HOBBITCRAFTIUM_DUST);
        hobbitcraftiumArmorItem(ModItems.HOBBITCRAFTIUM_HELMET);
        hobbitcraftiumArmorItem(ModItems.HOBBITCRAFTIUM_CHESTPLATE);
        hobbitcraftiumArmorItem(ModItems.HOBBITCRAFTIUM_TROUSERS);
        hobbitcraftiumArmorItem(ModItems.HOBBITCRAFTIUM_BOOTS);
        projecteHobbitcraftiumItem(ModItems.INERT_HOBBITCRAFTIUM_TOME);
        projecteHobbitcraftiumItem(ModItems.INERT_HOBBITCRAFTIUM_PHILOSOPHERS_STONE);
        projecteHobbitcraftiumItem(ModItems.INERT_HOBBITCRAFTIUM_TRANSMUTATION_TABLE);
        projecteHobbitcraftiumItem(ModItems.INERT_HOBBITCRAFTIUM_TRANSMUTATION_TABLET);
        projecteHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_STAR_EIN);
        projecteHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_STAR_ZWEI);
        projecteHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_STAR_DREI);
        projecteHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_STAR_VIER);
        projecteHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_STAR_SPHERE);
        projecteHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_STAR_OMEGA);
        handheldHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_SWORD);
        handheldHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_AXE);
        handheldHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_PICKAXE);
        handheldHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_SHOVEL);
        handheldHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_HOE);
        mekanismHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_ALLOY);
        mekanismHobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_CONTROL_CIRCUIT);
        mekanismHobbitcraftiumItem(ModItems.ENRICHED_HOBBITCRAFTIUM);
        ae2HobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_CIRCUIT);
        ae2HobbitcraftiumItem(ModItems.HOBBITCRAFTIUM_PRESS);
        ae2HobbitcraftiumItem(ModItems.PRINTED_HOBBITCRAFTIUM);


        // KYLE ITEMS

        simpleKyleItem(ModItems.KYLE_DISC);
        simpleKyleItem(ModItems.RAW_KYLE);
        simpleKyleItem(ModItems.CRUSHED_RAW_KYLE);
        simpleKyleItem(ModItems.KYLE_INGOT);
        simpleKyleItem(ModItems.KYLE_NUGGET);
        simpleKyleItem(ModItems.KYLE_DUST);
        simpleKyleItem(ModItems.TINY_KYLE_DUST);
        kyleArmorItem(ModItems.KYLE_HELMET);
        kyleArmorItem(ModItems.KYLE_CHESTPLATE);
        kyleArmorItem(ModItems.KYLE_TROUSERS);
        kyleArmorItem(ModItems.KYLE_BOOTS);
        projecteKyleItem(ModItems.INERT_KYLE_TOME);
        projecteKyleItem(ModItems.INERT_KYLE_PHILOSOPHERS_STONE);
        projecteKyleItem(ModItems.INERT_KYLE_TRANSMUTATION_TABLE);
        projecteKyleItem(ModItems.INERT_KYLE_TRANSMUTATION_TABLET);
        projecteKyleItem(ModItems.KYLE_STAR_EIN);
        projecteKyleItem(ModItems.KYLE_STAR_ZWEI);
        projecteKyleItem(ModItems.KYLE_STAR_DREI);
        projecteKyleItem(ModItems.KYLE_STAR_VIER);
        projecteKyleItem(ModItems.KYLE_STAR_SPHERE);
        projecteKyleItem(ModItems.KYLE_STAR_OMEGA);
        handheldKyleItem(ModItems.KYLE_SWORD);
        handheldKyleItem(ModItems.KYLE_AXE);
        handheldKyleItem(ModItems.KYLE_PICKAXE);
        handheldKyleItem(ModItems.KYLE_SHOVEL);
        handheldKyleItem(ModItems.KYLE_HOE);
        mekanismKyleItem(ModItems.KYLE_ALLOY);
        mekanismKyleItem(ModItems.KYLE_CONTROL_CIRCUIT);
        mekanismKyleItem(ModItems.ENRICHED_KYLE);
        ae2KyleItem(ModItems.KYLE_CIRCUIT);
        ae2KyleItem(ModItems.KYLE_PRESS);
        ae2KyleItem(ModItems.PRINTED_KYLE);

        // VINO ITEMS

        simpleVinoItem(ModItems.VINO_DISC);
        simpleVinoItem(ModItems.RAW_VINO);
        simpleVinoItem(ModItems.CRUSHED_RAW_VINO);
        simpleVinoItem(ModItems.VINO_INGOT);
        simpleVinoItem(ModItems.VINO_NUGGET);
        simpleVinoItem(ModItems.VINO_DUST);
        simpleVinoItem(ModItems.TINY_VINO_DUST);
        vinoArmorItem(ModItems.VINO_HELMET);
        vinoArmorItem(ModItems.VINO_CHESTPLATE);
        vinoArmorItem(ModItems.VINO_TROUSERS);
        vinoArmorItem(ModItems.VINO_BOOTS);
        projecteVinoItem(ModItems.INERT_VINO_TOME);
        projecteVinoItem(ModItems.INERT_VINO_PHILOSOPHERS_STONE);
        projecteVinoItem(ModItems.INERT_VINO_TRANSMUTATION_TABLE);
        projecteVinoItem(ModItems.INERT_VINO_TRANSMUTATION_TABLET);
        projecteVinoItem(ModItems.VINO_STAR_EIN);
        projecteVinoItem(ModItems.VINO_STAR_ZWEI);
        projecteVinoItem(ModItems.VINO_STAR_DREI);
        projecteVinoItem(ModItems.VINO_STAR_VIER);
        projecteVinoItem(ModItems.VINO_STAR_SPHERE);
        projecteVinoItem(ModItems.VINO_STAR_OMEGA);
        handheldVinoItem(ModItems.VINO_SWORD);
        handheldVinoItem(ModItems.VINO_AXE);
        handheldVinoItem(ModItems.VINO_PICKAXE);
        handheldVinoItem(ModItems.VINO_SHOVEL);
        handheldVinoItem(ModItems.VINO_HOE);
        mekanismVinoItem(ModItems.VINO_ALLOY);
        mekanismVinoItem(ModItems.VINO_CONTROL_CIRCUIT);
        mekanismVinoItem(ModItems.ENRICHED_VINO);
        ae2VinoItem(ModItems.VINO_CIRCUIT);
        ae2VinoItem(ModItems.VINO_PRESS);
        ae2VinoItem(ModItems.PRINTED_VINO);

        // WIBKITIUM ITEMS

        simpleWibkitiumItem(ModItems.WIBKITIUM_DISC);
        simpleWibkitiumItem(ModItems.RAW_WIBKITIUM);
        simpleWibkitiumItem(ModItems.CRUSHED_RAW_WIBKITIUM);
        simpleWibkitiumItem(ModItems.WIBKITIUM_INGOT);
        simpleWibkitiumItem(ModItems.WIBKITIUM_NUGGET);
        simpleWibkitiumItem(ModItems.WIBKITIUM_DUST);
        simpleWibkitiumItem(ModItems.TINY_WIBKITIUM_DUST);
        wibkitiumArmorItem(ModItems.WIBKITIUM_HELMET);
        wibkitiumArmorItem(ModItems.WIBKITIUM_CHESTPLATE);
        wibkitiumArmorItem(ModItems.WIBKITIUM_TROUSERS);
        wibkitiumArmorItem(ModItems.WIBKITIUM_BOOTS);
        projecteWibkitiumItem(ModItems.INERT_WIBKITIUM_TOME);
        projecteWibkitiumItem(ModItems.INERT_WIBKITIUM_PHILOSOPHERS_STONE);
        projecteWibkitiumItem(ModItems.INERT_WIBKITIUM_TRANSMUTATION_TABLE);
        projecteWibkitiumItem(ModItems.INERT_WIBKITIUM_TRANSMUTATION_TABLET);
        projecteWibkitiumItem(ModItems.WIBKITIUM_STAR_EIN);
        projecteWibkitiumItem(ModItems.WIBKITIUM_STAR_ZWEI);
        projecteWibkitiumItem(ModItems.WIBKITIUM_STAR_DREI);
        projecteWibkitiumItem(ModItems.WIBKITIUM_STAR_VIER);
        projecteWibkitiumItem(ModItems.WIBKITIUM_STAR_SPHERE);
        projecteWibkitiumItem(ModItems.WIBKITIUM_STAR_OMEGA);
        handheldWibkitiumItem(ModItems.WIBKITIUM_SWORD);
        handheldWibkitiumItem(ModItems.WIBKITIUM_AXE);
        handheldWibkitiumItem(ModItems.WIBKITIUM_PICKAXE);
        handheldWibkitiumItem(ModItems.WIBKITIUM_SHOVEL);
        handheldWibkitiumItem(ModItems.WIBKITIUM_HOE);
        mekanismWibkitiumItem(ModItems.WIBKITIUM_ALLOY);
        mekanismWibkitiumItem(ModItems.WIBKITIUM_CONTROL_CIRCUIT);
        mekanismWibkitiumItem(ModItems.ENRICHED_WIBKITIUM);
        ae2WibkitiumItem(ModItems.WIBKITIUM_CIRCUIT);
        ae2WibkitiumItem(ModItems.WIBKITIUM_PRESS);
        ae2WibkitiumItem(ModItems.PRINTED_WIBKITIUM);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder projecteItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/projecte/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldDreadedItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/dreaded/tools/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleDreadedItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/dreaded/resources/" + item.getId().getPath()));
    }

    private ItemModelBuilder projecteDreadedItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/dreaded/projecte/" + item.getId().getPath()));
    }

    private ItemModelBuilder mekanismDreadedItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/dreaded/mekanism/" + item.getId().getPath()));
    }

    private ItemModelBuilder ae2DreadedItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/dreaded/ae2/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldHobbitcraftiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/hobbitcraftium/tools/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleHobbitcraftiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/hobbitcraftium/resources/" + item.getId().getPath()));
    }

    private ItemModelBuilder projecteHobbitcraftiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/hobbitcraftium/projecte/" + item.getId().getPath()));
    }

    private ItemModelBuilder mekanismHobbitcraftiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/hobbitcraftium/mekanism/" + item.getId().getPath()));
    }

    private ItemModelBuilder ae2HobbitcraftiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/hobbitcraftium/ae2/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldKyleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/kyle/tools/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleKyleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/kyle/resources/" + item.getId().getPath()));
    }

    private ItemModelBuilder projecteKyleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/kyle/projecte/" + item.getId().getPath()));
    }

    private ItemModelBuilder mekanismKyleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/kyle/mekanism/" + item.getId().getPath()));
    }

    private ItemModelBuilder ae2KyleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/kyle/ae2/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldVinoItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/vino/tools/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleVinoItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/vino/resources/" + item.getId().getPath()));
    }

    private ItemModelBuilder projecteVinoItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/vino/projecte/" + item.getId().getPath()));
    }

    private ItemModelBuilder mekanismVinoItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/vino/mekanism/" + item.getId().getPath()));
    }

    private ItemModelBuilder ae2VinoItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/vino/ae2/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldWibkitiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/wibkitium/tools/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleWibkitiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/wibkitium/resources/" + item.getId().getPath()));
    }

    private ItemModelBuilder projecteWibkitiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/wibkitium/projecte/" + item.getId().getPath()));
    }

    private ItemModelBuilder mekanismWibkitiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/wibkitium/mekanism/" + item.getId().getPath()));
    }

    private ItemModelBuilder ae2WibkitiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/wibkitium/ae2/" + item.getId().getPath()));
    }
    private void dreadedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = HobbitCraft.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/dreaded/resources/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/dreaded/resources/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
    private void kyleArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = HobbitCraft.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/kyle/resources/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/kyle/resources/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
    private void hobbitcraftiumArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = HobbitCraft.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/hobbitcraftium/resources/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/hobbitcraftium/resources/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
    private void vinoArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = HobbitCraft.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/vino/resources/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/vino/resources/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
    private void wibkitiumArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = HobbitCraft.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/wibkitium/resources/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/wibkitium/resources/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
}
