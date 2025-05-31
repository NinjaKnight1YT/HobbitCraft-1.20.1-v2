package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import com.kyle.hobbitcraft.item.custom.ModArmorItem;
import com.kyle.hobbitcraft.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HobbitCraft.MOD_ID);

    // PROJECTE


    // BASE


    public static final RegistryObject<Item> INERT_PHILOSOPHERS_STONE = ITEMS.register("inert_philosophers_stone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_TOME = ITEMS.register("inert_tome",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_TRANSMUTATION_TABLE = ITEMS.register("inert_transmutation_table",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_TRANSMUTATION_TABLET = ITEMS.register("inert_transmutation_tablet",
            () -> new Item(new Item.Properties()));


    // DREADED


    public static final RegistryObject<Item> INERT_DREADED_PHILOSOPHERS_STONE = ITEMS.register("inert_dreaded_philosophers_stone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_DREADED_TOME = ITEMS.register("inert_dreaded_tome",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_DREADED_TRANSMUTATION_TABLE = ITEMS.register("inert_dreaded_transmutation_table",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_DREADED_TRANSMUTATION_TABLET = ITEMS.register("inert_dreaded_transmutation_tablet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_STAR_EIN = ITEMS.register("dreaded_star_ein",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_STAR_ZWEI = ITEMS.register("dreaded_star_zwei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_STAR_DREI = ITEMS.register("dreaded_star_drei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_STAR_VIER = ITEMS.register("dreaded_star_vier",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_STAR_SPHERE = ITEMS.register("dreaded_star_sphere",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_STAR_OMEGA = ITEMS.register("dreaded_star_omega",
            () -> new Item(new Item.Properties()));


    // HOBBITCRAFTIUM


    public static final RegistryObject<Item> INERT_HOBBITCRAFTIUM_PHILOSOPHERS_STONE = ITEMS.register("inert_hobbitcraftium_philosophers_stone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_HOBBITCRAFTIUM_TOME = ITEMS.register("inert_hobbitcraftium_tome",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_HOBBITCRAFTIUM_TRANSMUTATION_TABLE = ITEMS.register("inert_hobbitcraftium_transmutation_table",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_HOBBITCRAFTIUM_TRANSMUTATION_TABLET = ITEMS.register("inert_hobbitcraftium_transmutation_tablet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_STAR_EIN = ITEMS.register("hobbitcraftium_star_ein",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_STAR_ZWEI = ITEMS.register("hobbitcraftium_star_zwei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_STAR_DREI = ITEMS.register("hobbitcraftium_star_drei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_STAR_VIER = ITEMS.register("hobbitcraftium_star_vier",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_STAR_SPHERE = ITEMS.register("hobbitcraftium_star_sphere",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_STAR_OMEGA = ITEMS.register("hobbitcraftium_star_omega",
            () -> new Item(new Item.Properties()));


    // KYLE


    public static final RegistryObject<Item> INERT_KYLE_PHILOSOPHERS_STONE = ITEMS.register("inert_kyle_philosophers_stone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_KYLE_TOME = ITEMS.register("inert_kyle_tome",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_KYLE_TRANSMUTATION_TABLE = ITEMS.register("inert_kyle_transmutation_table",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_KYLE_TRANSMUTATION_TABLET = ITEMS.register("inert_kyle_transmutation_tablet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_STAR_EIN = ITEMS.register("kyle_star_ein",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_STAR_ZWEI = ITEMS.register("kyle_star_zwei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_STAR_DREI = ITEMS.register("kyle_star_drei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_STAR_VIER = ITEMS.register("kyle_star_vier",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_STAR_SPHERE = ITEMS.register("kyle_star_sphere",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_STAR_OMEGA = ITEMS.register("kyle_star_omega",
            () -> new Item(new Item.Properties()));


    // VINO


    public static final RegistryObject<Item> INERT_VINO_PHILOSOPHERS_STONE = ITEMS.register("inert_vino_philosophers_stone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_VINO_TOME = ITEMS.register("inert_vino_tome",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_VINO_TRANSMUTATION_TABLE = ITEMS.register("inert_vino_transmutation_table",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_VINO_TRANSMUTATION_TABLET = ITEMS.register("inert_vino_transmutation_tablet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_STAR_EIN = ITEMS.register("vino_star_ein",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_STAR_ZWEI = ITEMS.register("vino_star_zwei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_STAR_DREI = ITEMS.register("vino_star_drei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_STAR_VIER = ITEMS.register("vino_star_vier",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_STAR_SPHERE = ITEMS.register("vino_star_sphere",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_STAR_OMEGA = ITEMS.register("vino_star_omega",
            () -> new Item(new Item.Properties()));


    // WIBKITIUM


    public static final RegistryObject<Item> INERT_WIBKITIUM_PHILOSOPHERS_STONE = ITEMS.register("inert_wibkitium_philosophers_stone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_WIBKITIUM_TOME = ITEMS.register("inert_wibkitium_tome",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_WIBKITIUM_TRANSMUTATION_TABLE = ITEMS.register("inert_wibkitium_transmutation_table",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_WIBKITIUM_TRANSMUTATION_TABLET = ITEMS.register("inert_wibkitium_transmutation_tablet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_STAR_EIN = ITEMS.register("wibkitium_star_ein",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_STAR_ZWEI = ITEMS.register("wibkitium_star_zwei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_STAR_DREI = ITEMS.register("wibkitium_star_drei",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_STAR_VIER = ITEMS.register("wibkitium_star_vier",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_STAR_SPHERE = ITEMS.register("wibkitium_star_sphere",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_STAR_OMEGA = ITEMS.register("wibkitium_star_omega",
            () -> new Item(new Item.Properties()));


    // MEKANISM


    // DREADED


    public static final RegistryObject<Item> DREADED_ALLOY = ITEMS.register("dreaded_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_CONTROL_CIRCUIT = ITEMS.register("dreaded_control_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENRICHED_DREAD = ITEMS.register("enriched_dread",
            () -> new Item(new Item.Properties()));


    // HOBBITCRAFTIUM


    public static final RegistryObject<Item> HOBBITCRAFTIUM_ALLOY = ITEMS.register("hobbitcraftium_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_CONTROL_CIRCUIT = ITEMS.register("hobbitcraftium_control_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENRICHED_HOBBITCRAFTIUM = ITEMS.register("enriched_hobbitcraftium",
            () -> new Item(new Item.Properties()));


    // KYLE


    public static final RegistryObject<Item> KYLE_ALLOY = ITEMS.register("kyle_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_CONTROL_CIRCUIT = ITEMS.register("kyle_control_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENRICHED_KYLE = ITEMS.register("enriched_kyle",
            () -> new Item(new Item.Properties()));


    // VINO


    public static final RegistryObject<Item> VINO_ALLOY = ITEMS.register("vino_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_CONTROL_CIRCUIT = ITEMS.register("vino_control_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENRICHED_VINO = ITEMS.register("enriched_vino",
            () -> new Item(new Item.Properties()));


    // WIBKITIUM


    public static final RegistryObject<Item> WIBKITIUM_ALLOY = ITEMS.register("wibkitium_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_CONTROL_CIRCUIT = ITEMS.register("wibkitium_control_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENRICHED_WIBKITIUM = ITEMS.register("enriched_wibkitium",
            () -> new Item(new Item.Properties()));


    // AE2


    // DREADED


    public static final RegistryObject<Item> DREADED_PRESS = ITEMS.register("dreaded_press",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_CIRCUIT = ITEMS.register("dreaded_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRINTED_DREAD = ITEMS.register("printed_dread",
            () -> new Item(new Item.Properties()));


    // HOBBITCRAFTIUM


    public static final RegistryObject<Item> HOBBITCRAFTIUM_PRESS = ITEMS.register("hobbitcraftium_press",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_CIRCUIT = ITEMS.register("hobbitcraftium_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRINTED_HOBBITCRAFTIUM = ITEMS.register("printed_hobbitcraftium",
            () -> new Item(new Item.Properties()));



    // KYLE


    public static final RegistryObject<Item> KYLE_PRESS = ITEMS.register("kyle_press",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_CIRCUIT = ITEMS.register("kyle_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRINTED_KYLE = ITEMS.register("printed_kyle",
            () -> new Item(new Item.Properties()));


    // VINO


    public static final RegistryObject<Item> VINO_PRESS = ITEMS.register("vino_press",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_CIRCUIT = ITEMS.register("vino_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRINTED_VINO = ITEMS.register("printed_vino",
            () -> new Item(new Item.Properties()));


    // WIBKITIUM


    public static final RegistryObject<Item> WIBKITIUM_PRESS = ITEMS.register("wibkitium_press",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_CIRCUIT = ITEMS.register("wibkitium_circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRINTED_WIBKITIUM = ITEMS.register("printed_wibkitium",
            () -> new Item(new Item.Properties()));


    // VANILLA AND CREATE


    // DREADED ITEMS


    public static final RegistryObject<Item> DREADED_DUST = ITEMS.register("dreaded_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINY_DREADED_DUST = ITEMS.register("tiny_dreaded_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_DREAD = ITEMS.register("raw_dread",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_DREAD = ITEMS.register("crushed_raw_dread",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_INGOT = ITEMS.register("dreaded_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_NUGGET = ITEMS.register("dreaded_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_SWORD = ITEMS.register("dreaded_sword",
            () -> new SwordItem(ModToolTiers.DREADED, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> DREADED_AXE = ITEMS.register("dreaded_axe",
            () -> new AxeItem(ModToolTiers.DREADED, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> DREADED_PICKAXE = ITEMS.register("dreaded_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DREADED, 4,2, new Item.Properties()));
    public static final RegistryObject<Item> DREADED_SHOVEL = ITEMS.register("dreaded_shovel",
            () -> new ShovelItem(ModToolTiers.DREADED, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> DREADED_HOE = ITEMS.register("dreaded_hoe",
        () -> new HoeItem(ModToolTiers.DREADED, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> DREADED_HELMET = ITEMS.register("dreaded_helmet",
            () -> new ModArmorItem(ModArmorMaterials.DREADED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DREADED_CHESTPLATE = ITEMS.register("dreaded_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.DREADED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DREADED_TROUSERS = ITEMS.register("dreaded_trousers",
            () -> new ModArmorItem(ModArmorMaterials.DREADED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DREADED_BOOTS = ITEMS.register("dreaded_boots",
            () -> new ModArmorItem(ModArmorMaterials.DREADED, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> DREADED_DISC = ITEMS.register("dreaded_disc",
            () -> new RecordItem(15, ModSounds.DREADED_DISC, new Item.Properties().stacksTo(1), 4800));


    // HOBBITCRAFTIUM ITEMS


    public static final RegistryObject<Item> HOBBITCRAFTIUM_DUST = ITEMS.register("hobbitcraftium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINY_HOBBITCRAFTIUM_DUST = ITEMS.register("tiny_hobbitcraftium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_INGOT = ITEMS.register("hobbitcraftium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_NUGGET = ITEMS.register("hobbitcraftium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_SWORD = ITEMS.register("hobbitcraftium_sword",
            () -> new SwordItem(ModToolTiers.HOBBITCRAFTIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_AXE = ITEMS.register("hobbitcraftium_axe",
            () -> new AxeItem(ModToolTiers.HOBBITCRAFTIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_PICKAXE = ITEMS.register("hobbitcraftium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HOBBITCRAFTIUM, 4,2, new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_SHOVEL = ITEMS.register("hobbitcraftium_shovel",
            () -> new ShovelItem(ModToolTiers.HOBBITCRAFTIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_HOE = ITEMS.register("hobbitcraftium_hoe",
            () -> new HoeItem(ModToolTiers.HOBBITCRAFTIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_HELMET = ITEMS.register("hobbitcraftium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.HOBBITCRAFTIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_CHESTPLATE = ITEMS.register("hobbitcraftium_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.HOBBITCRAFTIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_TROUSERS = ITEMS.register("hobbitcraftium_trousers",
            () -> new ModArmorItem(ModArmorMaterials.HOBBITCRAFTIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HOBBITCRAFTIUM_BOOTS = ITEMS.register("hobbitcraftium_boots",
            () -> new ModArmorItem(ModArmorMaterials.HOBBITCRAFTIUM, ArmorItem.Type.BOOTS, new Item.Properties()));


    // KYLE ITEMS


    public static final RegistryObject<Item> KYLE_DUST = ITEMS.register("kyle_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINY_KYLE_DUST = ITEMS.register("tiny_kyle_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_KYLE = ITEMS.register("raw_kyle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_KYLE = ITEMS.register("crushed_raw_kyle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_INGOT = ITEMS.register("kyle_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_NUGGET = ITEMS.register("kyle_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_SWORD = ITEMS.register("kyle_sword",
            () -> new SwordItem(ModToolTiers.KYLE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_AXE = ITEMS.register("kyle_axe",
            () -> new AxeItem(ModToolTiers.KYLE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_PICKAXE = ITEMS.register("kyle_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KYLE, 4,2, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_SHOVEL = ITEMS.register("kyle_shovel",
            () -> new ShovelItem(ModToolTiers.KYLE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_HOE = ITEMS.register("kyle_hoe",
            () -> new HoeItem(ModToolTiers.KYLE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_HELMET = ITEMS.register("kyle_helmet",
            () -> new ModArmorItem(ModArmorMaterials.KYLE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_CHESTPLATE = ITEMS.register("kyle_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.KYLE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_TROUSERS = ITEMS.register("kyle_trousers",
            () -> new ModArmorItem(ModArmorMaterials.KYLE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_BOOTS = ITEMS.register("kyle_boots",
            () -> new ModArmorItem(ModArmorMaterials.KYLE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_DISC = ITEMS.register("kyle_disc",
            () -> new RecordItem(15, ModSounds.KYLE_DISC, new Item.Properties().stacksTo(1),  6000));


    // VINO ITEMS


    public static final RegistryObject<Item> VINO_DUST = ITEMS.register("vino_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINY_VINO_DUST = ITEMS.register("tiny_vino_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_VINO = ITEMS.register("raw_vino",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_VINO = ITEMS.register("crushed_raw_vino",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_INGOT = ITEMS.register("vino_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_NUGGET = ITEMS.register("vino_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VINO_SWORD = ITEMS.register("vino_sword",
            () -> new SwordItem(ModToolTiers.VINO, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> VINO_AXE = ITEMS.register("vino_axe",
            () -> new AxeItem(ModToolTiers.VINO, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> VINO_PICKAXE = ITEMS.register("vino_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VINO, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> VINO_SHOVEL = ITEMS.register("vino_shovel",
            () -> new ShovelItem(ModToolTiers.VINO, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> VINO_HOE = ITEMS.register("vino_hoe",
            () -> new HoeItem(ModToolTiers.VINO, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> VINO_HELMET = ITEMS.register("vino_helmet",
            () -> new ModArmorItem(ModArmorMaterials.VINO, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> VINO_CHESTPLATE = ITEMS.register("vino_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.VINO, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> VINO_TROUSERS = ITEMS.register("vino_trousers",
            () -> new ModArmorItem(ModArmorMaterials.VINO, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> VINO_BOOTS = ITEMS.register("vino_boots",
            () -> new ModArmorItem(ModArmorMaterials.VINO, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> VINO_DISC = ITEMS.register("vino_disc",
            () -> new RecordItem(15, ModSounds.VINO_DISC, new Item.Properties().stacksTo(1),  6000));


    // WIBKITIUM ITEMS


    public static final RegistryObject<Item> WIBKITIUM_DUST = ITEMS.register("wibkitium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINY_WIBKITIUM_DUST = ITEMS.register("tiny_wibkitium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_WIBKITIUM = ITEMS.register("raw_wibkitium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_WIBKITIUM = ITEMS.register("crushed_raw_wibkitium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_INGOT = ITEMS.register("wibkitium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_NUGGET = ITEMS.register("wibkitium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_SWORD = ITEMS.register("wibkitium_sword",
            () -> new SwordItem(ModToolTiers.WIBKITIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_AXE = ITEMS.register("wibkitium_axe",
            () -> new AxeItem(ModToolTiers.WIBKITIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_PICKAXE = ITEMS.register("wibkitium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WIBKITIUM, 4,2, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_SHOVEL = ITEMS.register("wibkitium_shovel",
            () -> new ShovelItem(ModToolTiers.WIBKITIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_HOE = ITEMS.register("wibkitium_hoe",
            () -> new HoeItem(ModToolTiers.WIBKITIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_HELMET = ITEMS.register("wibkitium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.WIBKITIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_CHESTPLATE = ITEMS.register("wibkitium_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.WIBKITIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_TROUSERS = ITEMS.register("wibkitium_trousers",
            () -> new ModArmorItem(ModArmorMaterials.WIBKITIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_BOOTS = ITEMS.register("wibkitium_boots",
            () -> new ModArmorItem(ModArmorMaterials.WIBKITIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_DISC = ITEMS.register("wibkitium_disc",
            () -> new RecordItem(15, ModSounds.WIBKITIUM_DISC, new Item.Properties().stacksTo(1),  3000));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
