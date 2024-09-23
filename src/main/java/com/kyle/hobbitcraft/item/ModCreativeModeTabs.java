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
                        
                        // DREADED
                        
                        // BLOCKS
                        
                        output.accept(ModBlocks.DREADED_ORE.get());
                        output.accept(ModBlocks.DREADED_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.DREADED_NETHER_ORE.get());
                        output.accept(ModBlocks.DREADED_END_ORE.get());
                        output.accept(ModBlocks.RAW_DREAD_BLOCK.get());
                        output.accept(ModBlocks.DREADED_BLOCK.get());
                        
                        //ITEMS
                        
                        output.accept(ModItems.RAW_DREAD.get());
                        output.accept(ModItems.CRUSHED_RAW_DREAD.get());
                        output.accept(ModItems.DREADED_INGOT.get());
                        output.accept(ModItems.DREADED_NUGGET.get());
                        output.accept(ModItems.DREADED_SWORD.get());
                        output.accept(ModItems.DREADED_AXE.get());
                        output.accept(ModItems.DREADED_PICKAXE.get());
                        output.accept(ModItems.DREADED_SHOVEL.get());
                        output.accept(ModItems.DREADED_HOE.get());

                        // KYLE

                        // BLOCKS

                        output.accept(ModBlocks.KYLE_ORE.get());
                        output.accept(ModBlocks.KYLE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.KYLE_NETHER_ORE.get());
                        output.accept(ModBlocks.KYLE_END_ORE.get());
                        output.accept(ModBlocks.RAW_KYLE_BLOCK.get());
                        output.accept(ModBlocks.KYLE_BLOCK.get());
                        
                        // ITEMS

                        output.accept(ModItems.RAW_KYLE.get());
                        output.accept(ModItems.CRUSHED_RAW_KYLE.get());
                        output.accept(ModItems.KYLE_INGOT.get());
                        output.accept(ModItems.KYLE_NUGGET.get());
                        output.accept(ModItems.KYLE_SWORD.get());
                        output.accept(ModItems.KYLE_AXE.get());
                        output.accept(ModItems.KYLE_PICKAXE.get());
                        output.accept(ModItems.KYLE_SHOVEL.get());
                        output.accept(ModItems.KYLE_HOE.get());

                        // VINO

                        // BLOCKS

                        output.accept(ModBlocks.VINO_ORE.get());
                        output.accept(ModBlocks.VINO_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.VINO_NETHER_ORE.get());
                        output.accept(ModBlocks.VINO_END_ORE.get());
                        output.accept(ModBlocks.RAW_VINO_BLOCK.get());
                        output.accept(ModBlocks.VINO_BLOCK.get());

                        // ITEMS

                        output.accept(ModItems.RAW_VINO.get());
                        output.accept(ModItems.CRUSHED_RAW_VINO.get());
                        output.accept(ModItems.VINO_INGOT.get());
                        output.accept(ModItems.VINO_NUGGET.get());
                        output.accept(ModItems.VINO_SWORD.get());
                        output.accept(ModItems.VINO_AXE.get());
                        output.accept(ModItems.VINO_PICKAXE.get());
                        output.accept(ModItems.VINO_SHOVEL.get());
                        output.accept(ModItems.VINO_HOE.get());

                        // WIBKITIUM

                        // BLOCKS

                        output.accept(ModBlocks.WIBKITIUM_ORE.get());
                        output.accept(ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.WIBKITIUM_NETHER_ORE.get());
                        output.accept(ModBlocks.WIBKITIUM_END_ORE.get());
                        output.accept(ModBlocks.RAW_WIBKITIUM_BLOCK.get());
                        output.accept(ModBlocks.WIBKITIUM_BLOCK.get());
                        
                        // ITEMS

                        output.accept(ModItems.RAW_WIBKITIUM.get());
                        output.accept(ModItems.CRUSHED_RAW_WIBKITIUM.get());
                        output.accept(ModItems.WIBKITIUM_INGOT.get());
                        output.accept(ModItems.WIBKITIUM_NUGGET.get());
                        output.accept(ModItems.WIBKITIUM_SWORD.get());
                        output.accept(ModItems.WIBKITIUM_AXE.get());
                        output.accept(ModItems.WIBKITIUM_PICKAXE.get());
                        output.accept(ModItems.WIBKITIUM_SHOVEL.get());
                        output.accept(ModItems.WIBKITIUM_HOE.get());

                        // MISCELLANEOUS

                        // BLOCKS

                        output.accept(ModBlocks.METRO.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
