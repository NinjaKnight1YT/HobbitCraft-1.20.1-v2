package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HobbitCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HOBBITCRAFT_TAB = CREATIVE_MODE_TABS.register("hobbitcraft",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.KYLE_BLOCK.get()))
                    .title(Component.translatable("creativetab.hobbitcraft"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DREADED_INGOT.get());
                        output.accept(ModBlocks.DREADED_BLOCK.get());
                        output.accept(ModItems.KYLE_INGOT.get());
                        output.accept(ModBlocks.KYLE_BLOCK.get());
                        output.accept(ModItems.WIBKITIUM_INGOT.get());
                        output.accept(ModBlocks.WIBKITIUM_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
