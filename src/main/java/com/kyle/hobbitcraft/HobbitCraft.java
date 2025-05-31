package com.kyle.hobbitcraft;

import com.kyle.hobbitcraft.block.ModBlocks;
import com.kyle.hobbitcraft.block.entity.ModBlockEntities;
import com.kyle.hobbitcraft.item.ModCreativeModeTabs;
import com.kyle.hobbitcraft.item.ModGasTypes;
import com.kyle.hobbitcraft.item.ModInfuseTypes;
import com.kyle.hobbitcraft.item.ModItems;
import com.kyle.hobbitcraft.screen.*;
import com.kyle.hobbitcraft.sound.ModSounds;
import committee.nova.mods.avaritia.init.registry.ModEntities;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HobbitCraft.MOD_ID)
public class HobbitCraft
{
    public static final String MOD_ID = "hobbitcraft";

    public static ResourceLocation rl(String path) {
        return new ResourceLocation(HobbitCraft.MOD_ID, path);
    }


    public HobbitCraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModGasTypes.register(modEventBus);

        ModInfuseTypes.register(modEventBus);

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);

        ModMenuTypes.register(modEventBus);

        ModSounds.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.DREADED_COLLECTOR_MENU.get(), DreadedCollectorScreen::new);
            MenuScreens.register(ModMenuTypes.HOBBITCRAFTIUM_COLLECTOR_MENU.get(), HobbitCraftiumCollectorScreen::new);
            MenuScreens.register(ModMenuTypes.KYLE_COLLECTOR_MENU.get(), KyleCollectorScreen::new);
            MenuScreens.register(ModMenuTypes.VINO_COLLECTOR_MENU.get(), VinoCollectorScreen::new);
            MenuScreens.register(ModMenuTypes.WIBKITIUM_COLLECTOR_MENU.get(), WibkitiumCollectorScreen::new);
        }
    }

}
