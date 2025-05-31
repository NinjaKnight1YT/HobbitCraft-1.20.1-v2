package com.kyle.hobbitcraft.screen;

import com.kyle.hobbitcraft.HobbitCraft;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, HobbitCraft.MOD_ID);

    public static final RegistryObject<MenuType<DreadedCollectorMenu>> DREADED_COLLECTOR_MENU =
            registerMenuType("dreaded_collector_menu", DreadedCollectorMenu::new);
    public static final RegistryObject<MenuType<HobbitCraftiumCollectorMenu>> HOBBITCRAFTIUM_COLLECTOR_MENU =
            registerMenuType("hobbitcraftium_collector_menu", HobbitCraftiumCollectorMenu::new);
    public static final RegistryObject<MenuType<KyleCollectorMenu>> KYLE_COLLECTOR_MENU =
            registerMenuType("kyle_collector_menu", KyleCollectorMenu::new);
    public static final RegistryObject<MenuType<VinoCollectorMenu>> VINO_COLLECTOR_MENU =
            registerMenuType("vino_collector_menu", VinoCollectorMenu::new);
    public static final RegistryObject<MenuType<WibkitiumCollectorMenu>> WIBKITIUM_COLLECTOR_MENU =
            registerMenuType("wibkitium_collector_menu", WibkitiumCollectorMenu::new);


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
