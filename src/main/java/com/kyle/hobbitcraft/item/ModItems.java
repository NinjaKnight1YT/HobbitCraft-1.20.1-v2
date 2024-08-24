package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HobbitCraft.MOD_ID);

    public static final RegistryObject<Item> DREADED_INGOT = ITEMS.register("dreaded_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_SWORD = ITEMS.register("dreaded_sword",
            () -> new SwordItem(ModToolTiers.DREADED, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> KYLE_INGOT = ITEMS.register("kyle_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYLE_SWORD = ITEMS.register("kyle_sword",
            () -> new SwordItem(ModToolTiers.KYLE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_INGOT = ITEMS.register("wibkitium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIBKITIUM_SWORD = ITEMS.register("wibkitium_sword",
            () -> new SwordItem(ModToolTiers.WIBKITIUM, 4, 2, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
