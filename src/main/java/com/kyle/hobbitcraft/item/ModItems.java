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
