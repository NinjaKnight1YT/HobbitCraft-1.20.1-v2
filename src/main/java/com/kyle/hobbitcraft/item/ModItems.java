package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HobbitCraft.MOD_ID);

    // STARS


    // DREADED


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


    // KYLE


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


    // DREADED ITEMS


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


    // KYLE ITEMS


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


    // VINO ITEMS


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


    // WIBKITIUM ITEMS


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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
