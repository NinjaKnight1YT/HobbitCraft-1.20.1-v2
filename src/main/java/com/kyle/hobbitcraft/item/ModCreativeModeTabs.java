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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOBBITCRAFTIUM_CIRCUIT.get()))
                    .title(Component.translatable("creativetab.hobbitcraft"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // PLUSHIES(NOT IN TEMP)

                        output.accept(ModBlocks.SWELL_PLUSHIE.get());
                        output.accept(ModBlocks.KYLE_PLUSHIE.get());
                        output.accept(ModBlocks.YUKI_PLUSHIE.get());
                        output.accept(ModBlocks.WIBKIT_PLUSHIE.get());

                        // COLLECTORS(NOT IN TEMP)

                        output.accept(ModBlocks.DREADED_COLLECTOR.get());
                        output.accept(ModBlocks.HOBBITCRAFTIUM_COLLECTOR.get());
                        output.accept(ModBlocks.KYLE_COLLECTOR.get());
                        output.accept(ModBlocks.VINO_COLLECTOR.get());
                        output.accept(ModBlocks.WIBKITIUM_COLLECTOR.get());

                        // DREADED
                        
                        // BLOCKS
                        
                        output.accept(ModBlocks.DREADED_ORE.get());
                        output.accept(ModBlocks.DREADED_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.DREADED_NETHER_ORE.get());
                        output.accept(ModBlocks.DREADED_END_ORE.get());
                        output.accept(ModBlocks.RAW_DREAD_BLOCK.get());
                        output.accept(ModBlocks.DREADED_BLOCK.get());
                        
                        //ITEMS

                        output.accept(ModItems.DREADED_DISC.get());
                        output.accept(ModItems.DREADED_DUST.get());
                        output.accept(ModItems.TINY_DREADED_DUST.get());
                        output.accept(ModItems.RAW_DREAD.get());
                        output.accept(ModItems.CRUSHED_RAW_DREAD.get());
                        output.accept(ModItems.DREADED_INGOT.get());
                        output.accept(ModItems.DREADED_NUGGET.get());
                        output.accept(ModItems.DREADED_SWORD.get());
                        output.accept(ModItems.DREADED_AXE.get());
                        output.accept(ModItems.DREADED_PICKAXE.get());
                        output.accept(ModItems.DREADED_SHOVEL.get());
                        output.accept(ModItems.DREADED_HOE.get());
                        output.accept(ModItems.DREADED_HELMET.get());
                        output.accept(ModItems.DREADED_CHESTPLATE.get());
                        output.accept(ModItems.DREADED_TROUSERS.get());
                        output.accept(ModItems.DREADED_BOOTS.get());

                        // HOBBITCRAFTIUM

                        // BLOCK

                        output.accept(ModBlocks.HOBBITCRAFTIUM_BLOCK.get());

                        // ITEMS

                        output.accept(ModItems.HOBBITCRAFTIUM_DUST.get());
                        output.accept(ModItems.TINY_HOBBITCRAFTIUM_DUST.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_INGOT.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_NUGGET.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_SWORD.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_AXE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_PICKAXE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_SHOVEL.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_HOE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_HELMET.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_CHESTPLATE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_TROUSERS.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_BOOTS.get());

                        // KYLE

                        // BLOCKS

                        output.accept(ModBlocks.KYLE_ORE.get());
                        output.accept(ModBlocks.KYLE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.KYLE_NETHER_ORE.get());
                        output.accept(ModBlocks.KYLE_END_ORE.get());
                        output.accept(ModBlocks.RAW_KYLE_BLOCK.get());
                        output.accept(ModBlocks.KYLE_BLOCK.get());
                        
                        // ITEMS

                        output.accept(ModItems.KYLE_DISC.get());
                        output.accept(ModItems.KYLE_DUST.get());
                        output.accept(ModItems.TINY_KYLE_DUST.get());
                        output.accept(ModItems.RAW_KYLE.get());
                        output.accept(ModItems.CRUSHED_RAW_KYLE.get());
                        output.accept(ModItems.KYLE_INGOT.get());
                        output.accept(ModItems.KYLE_NUGGET.get());
                        output.accept(ModItems.KYLE_SWORD.get());
                        output.accept(ModItems.KYLE_AXE.get());
                        output.accept(ModItems.KYLE_PICKAXE.get());
                        output.accept(ModItems.KYLE_SHOVEL.get());
                        output.accept(ModItems.KYLE_HOE.get());
                        output.accept(ModItems.KYLE_HELMET.get());
                        output.accept(ModItems.KYLE_CHESTPLATE.get());
                        output.accept(ModItems.KYLE_TROUSERS.get());
                        output.accept(ModItems.KYLE_BOOTS.get());

                        // VINO

                        // BLOCKS

                        output.accept(ModBlocks.VINO_ORE.get());
                        output.accept(ModBlocks.VINO_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.VINO_NETHER_ORE.get());
                        output.accept(ModBlocks.VINO_END_ORE.get());
                        output.accept(ModBlocks.RAW_VINO_BLOCK.get());
                        output.accept(ModBlocks.VINO_BLOCK.get());

                        // ITEMS

                        output.accept(ModItems.VINO_DISC.get());
                        output.accept(ModItems.VINO_DUST.get());
                        output.accept(ModItems.TINY_VINO_DUST.get());
                        output.accept(ModItems.RAW_VINO.get());
                        output.accept(ModItems.CRUSHED_RAW_VINO.get());
                        output.accept(ModItems.VINO_INGOT.get());
                        output.accept(ModItems.VINO_NUGGET.get());
                        output.accept(ModItems.VINO_SWORD.get());
                        output.accept(ModItems.VINO_AXE.get());
                        output.accept(ModItems.VINO_PICKAXE.get());
                        output.accept(ModItems.VINO_SHOVEL.get());
                        output.accept(ModItems.VINO_HOE.get());
                        output.accept(ModItems.VINO_HELMET.get());
                        output.accept(ModItems.VINO_CHESTPLATE.get());
                        output.accept(ModItems.VINO_TROUSERS.get());
                        output.accept(ModItems.VINO_BOOTS.get());

                        // WIBKITIUM

                        // BLOCKS

                        output.accept(ModBlocks.WIBKITIUM_ORE.get());
                        output.accept(ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.WIBKITIUM_NETHER_ORE.get());
                        output.accept(ModBlocks.WIBKITIUM_END_ORE.get());
                        output.accept(ModBlocks.RAW_WIBKITIUM_BLOCK.get());
                        output.accept(ModBlocks.WIBKITIUM_BLOCK.get());
                        
                        // ITEMS

                        output.accept(ModItems.WIBKITIUM_DISC.get());
                        output.accept(ModItems.WIBKITIUM_DUST.get());
                        output.accept(ModItems.TINY_WIBKITIUM_DUST.get());
                        output.accept(ModItems.RAW_WIBKITIUM.get());
                        output.accept(ModItems.CRUSHED_RAW_WIBKITIUM.get());
                        output.accept(ModItems.WIBKITIUM_INGOT.get());
                        output.accept(ModItems.WIBKITIUM_NUGGET.get());
                        output.accept(ModItems.WIBKITIUM_SWORD.get());
                        output.accept(ModItems.WIBKITIUM_AXE.get());
                        output.accept(ModItems.WIBKITIUM_PICKAXE.get());
                        output.accept(ModItems.WIBKITIUM_SHOVEL.get());
                        output.accept(ModItems.WIBKITIUM_HOE.get());
                        output.accept(ModItems.WIBKITIUM_HELMET.get());
                        output.accept(ModItems.WIBKITIUM_CHESTPLATE.get());
                        output.accept(ModItems.WIBKITIUM_TROUSERS.get());
                        output.accept(ModItems.WIBKITIUM_BOOTS.get());

                        // PROJECTE

                        // BASE

                        output.accept(ModItems.INERT_TOME.get());
                        output.accept(ModItems.INERT_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_TRANSMUTATION_TABLET.get());

                        // DREADED

                        output.accept(ModItems.INERT_DREADED_TOME.get());
                        output.accept(ModItems.INERT_DREADED_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_DREADED_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_DREADED_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.DREADED_STAR_EIN.get());
                        output.accept(ModItems.DREADED_STAR_ZWEI.get());
                        output.accept(ModItems.DREADED_STAR_DREI.get());
                        output.accept(ModItems.DREADED_STAR_VIER.get());
                        output.accept(ModItems.DREADED_STAR_SPHERE.get());
                        output.accept(ModItems.DREADED_STAR_OMEGA.get());

                        // HOBBITCRAFTIUM

                        output.accept(ModItems.INERT_HOBBITCRAFTIUM_TOME.get());
                        output.accept(ModItems.INERT_HOBBITCRAFTIUM_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_HOBBITCRAFTIUM_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_HOBBITCRAFTIUM_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_EIN.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_ZWEI.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_DREI.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_VIER.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_SPHERE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_OMEGA.get());

                        // KYLE

                        output.accept(ModItems.INERT_KYLE_TOME.get());
                        output.accept(ModItems.INERT_KYLE_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_KYLE_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_KYLE_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.KYLE_STAR_EIN.get());
                        output.accept(ModItems.KYLE_STAR_ZWEI.get());
                        output.accept(ModItems.KYLE_STAR_DREI.get());
                        output.accept(ModItems.KYLE_STAR_VIER.get());
                        output.accept(ModItems.KYLE_STAR_SPHERE.get());
                        output.accept(ModItems.KYLE_STAR_OMEGA.get());

                        // VINO

                        output.accept(ModItems.INERT_VINO_TOME.get());
                        output.accept(ModItems.INERT_VINO_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_VINO_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_VINO_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.VINO_STAR_EIN.get());
                        output.accept(ModItems.VINO_STAR_ZWEI.get());
                        output.accept(ModItems.VINO_STAR_DREI.get());
                        output.accept(ModItems.VINO_STAR_VIER.get());
                        output.accept(ModItems.VINO_STAR_SPHERE.get());
                        output.accept(ModItems.VINO_STAR_OMEGA.get());

                        // WIBKITIUM

                        output.accept(ModItems.INERT_WIBKITIUM_TOME.get());
                        output.accept(ModItems.INERT_WIBKITIUM_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_WIBKITIUM_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_WIBKITIUM_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.WIBKITIUM_STAR_EIN.get());
                        output.accept(ModItems.WIBKITIUM_STAR_ZWEI.get());
                        output.accept(ModItems.WIBKITIUM_STAR_DREI.get());
                        output.accept(ModItems.WIBKITIUM_STAR_VIER.get());
                        output.accept(ModItems.WIBKITIUM_STAR_SPHERE.get());
                        output.accept(ModItems.WIBKITIUM_STAR_OMEGA.get());

                        // MEKANISM

                        // DREADED

                        output.accept(ModItems.DREADED_ALLOY.get());
                        output.accept(ModItems.DREADED_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_DREAD.get());

                        // HOBBITCRAFTIUM

                        output.accept(ModItems.HOBBITCRAFTIUM_ALLOY.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_HOBBITCRAFTIUM.get());

                        // KYLE

                        output.accept(ModItems.KYLE_ALLOY.get());
                        output.accept(ModItems.KYLE_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_KYLE.get());

                        // VINO

                        output.accept(ModItems.VINO_ALLOY.get());
                        output.accept(ModItems.VINO_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_VINO.get());

                        // WIBKITIUM

                        output.accept(ModItems.WIBKITIUM_ALLOY.get());
                        output.accept(ModItems.WIBKITIUM_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_WIBKITIUM.get());

                        // AE2

                        // DREADED

                        output.accept(ModItems.DREADED_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_DREAD.get());
                        output.accept(ModItems.DREADED_PRESS.get());

                        // HOBBITCRAFTIUM

                        output.accept(ModItems.HOBBITCRAFTIUM_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_HOBBITCRAFTIUM.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_PRESS.get());

                        // KYLE

                        output.accept(ModItems.KYLE_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_KYLE.get());
                        output.accept(ModItems.KYLE_PRESS.get());

                        // VINO

                        output.accept(ModItems.VINO_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_VINO.get());
                        output.accept(ModItems.VINO_PRESS.get());

                        // WIBKITIUM

                        output.accept(ModItems.WIBKITIUM_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_WIBKITIUM.get());
                        output.accept(ModItems.WIBKITIUM_PRESS.get());

                        // MISCELLANEOUS

                        // BLOCKS

                        output.accept(ModBlocks.METRO.get());

                    })
                    .build());

    // TEMP

    public static final RegistryObject<CreativeModeTab> DREADED_TAB = CREATIVE_MODE_TABS.register("dreaded",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DREADED_CIRCUIT.get()))
                    .title(Component.translatable("creativetab.dreaded"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DREADED_ORE.get());
                        output.accept(ModBlocks.DREADED_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.DREADED_NETHER_ORE.get());
                        output.accept(ModBlocks.DREADED_END_ORE.get());
                        output.accept(ModBlocks.RAW_DREAD_BLOCK.get());
                        output.accept(ModBlocks.DREADED_BLOCK.get());
                        output.accept(ModItems.DREADED_DISC.get());
                        output.accept(ModItems.DREADED_DUST.get());
                        output.accept(ModItems.TINY_DREADED_DUST.get());
                        output.accept(ModItems.RAW_DREAD.get());
                        output.accept(ModItems.CRUSHED_RAW_DREAD.get());
                        output.accept(ModItems.DREADED_INGOT.get());
                        output.accept(ModItems.DREADED_NUGGET.get());
                        output.accept(ModItems.DREADED_SWORD.get());
                        output.accept(ModItems.DREADED_AXE.get());
                        output.accept(ModItems.DREADED_PICKAXE.get());
                        output.accept(ModItems.DREADED_SHOVEL.get());
                        output.accept(ModItems.DREADED_HOE.get());
                        output.accept(ModItems.DREADED_HELMET.get());
                        output.accept(ModItems.DREADED_CHESTPLATE.get());
                        output.accept(ModItems.DREADED_TROUSERS.get());
                        output.accept(ModItems.DREADED_BOOTS.get());
                        output.accept(ModItems.INERT_DREADED_TOME.get());
                        output.accept(ModItems.INERT_DREADED_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_DREADED_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_DREADED_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.DREADED_STAR_EIN.get());
                        output.accept(ModItems.DREADED_STAR_ZWEI.get());
                        output.accept(ModItems.DREADED_STAR_DREI.get());
                        output.accept(ModItems.DREADED_STAR_VIER.get());
                        output.accept(ModItems.DREADED_STAR_SPHERE.get());
                        output.accept(ModItems.DREADED_STAR_OMEGA.get());
                        output.accept(ModItems.DREADED_ALLOY.get());
                        output.accept(ModItems.DREADED_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_DREAD.get());
                        output.accept(ModItems.DREADED_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_DREAD.get());
                        output.accept(ModItems.DREADED_PRESS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> HOBBITCRAFTIUM_TAB = CREATIVE_MODE_TABS.register("hobbitcraftium",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOBBITCRAFTIUM_CONTROL_CIRCUIT.get()))
                    .title(Component.translatable("creativetab.hobbitcraftium"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HOBBITCRAFTIUM_BLOCK.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_DUST.get());
                        output.accept(ModItems.TINY_HOBBITCRAFTIUM_DUST.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_INGOT.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_NUGGET.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_SWORD.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_AXE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_PICKAXE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_SHOVEL.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_HOE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_HELMET.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_CHESTPLATE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_TROUSERS.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_BOOTS.get());
                        output.accept(ModItems.INERT_HOBBITCRAFTIUM_TOME.get());
                        output.accept(ModItems.INERT_HOBBITCRAFTIUM_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_HOBBITCRAFTIUM_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_HOBBITCRAFTIUM_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_EIN.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_ZWEI.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_DREI.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_VIER.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_SPHERE.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_STAR_OMEGA.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_ALLOY.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_HOBBITCRAFTIUM.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_HOBBITCRAFTIUM.get());
                        output.accept(ModItems.HOBBITCRAFTIUM_PRESS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> KYLE_TAB = CREATIVE_MODE_TABS.register("kyle",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KYLE_CIRCUIT.get()))
                    .title(Component.translatable("creativetab.kyle"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.KYLE_ORE.get());
                        output.accept(ModBlocks.KYLE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.KYLE_NETHER_ORE.get());
                        output.accept(ModBlocks.KYLE_END_ORE.get());
                        output.accept(ModBlocks.RAW_KYLE_BLOCK.get());
                        output.accept(ModBlocks.KYLE_BLOCK.get());
                        output.accept(ModItems.KYLE_DISC.get());
                        output.accept(ModItems.KYLE_DUST.get());
                        output.accept(ModItems.TINY_KYLE_DUST.get());
                        output.accept(ModItems.RAW_KYLE.get());
                        output.accept(ModItems.CRUSHED_RAW_KYLE.get());
                        output.accept(ModItems.KYLE_INGOT.get());
                        output.accept(ModItems.KYLE_NUGGET.get());
                        output.accept(ModItems.KYLE_SWORD.get());
                        output.accept(ModItems.KYLE_AXE.get());
                        output.accept(ModItems.KYLE_PICKAXE.get());
                        output.accept(ModItems.KYLE_SHOVEL.get());
                        output.accept(ModItems.KYLE_HOE.get());
                        output.accept(ModItems.KYLE_HELMET.get());
                        output.accept(ModItems.KYLE_CHESTPLATE.get());
                        output.accept(ModItems.KYLE_TROUSERS.get());
                        output.accept(ModItems.KYLE_BOOTS.get());
                        output.accept(ModItems.INERT_KYLE_TOME.get());
                        output.accept(ModItems.INERT_KYLE_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_KYLE_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_KYLE_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.KYLE_STAR_EIN.get());
                        output.accept(ModItems.KYLE_STAR_ZWEI.get());
                        output.accept(ModItems.KYLE_STAR_DREI.get());
                        output.accept(ModItems.KYLE_STAR_VIER.get());
                        output.accept(ModItems.KYLE_STAR_SPHERE.get());
                        output.accept(ModItems.KYLE_STAR_OMEGA.get());
                        output.accept(ModItems.KYLE_ALLOY.get());
                        output.accept(ModItems.KYLE_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_KYLE.get());
                        output.accept(ModItems.KYLE_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_KYLE.get());
                        output.accept(ModItems.KYLE_PRESS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> VINO_TAB = CREATIVE_MODE_TABS.register("vino",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VINO_CIRCUIT.get()))
                    .title(Component.translatable("creativetab.vino"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.VINO_ORE.get());
                        output.accept(ModBlocks.VINO_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.VINO_NETHER_ORE.get());
                        output.accept(ModBlocks.VINO_END_ORE.get());
                        output.accept(ModBlocks.RAW_VINO_BLOCK.get());
                        output.accept(ModBlocks.VINO_BLOCK.get());
                        output.accept(ModItems.VINO_DISC.get());
                        output.accept(ModItems.VINO_DUST.get());
                        output.accept(ModItems.TINY_VINO_DUST.get());
                        output.accept(ModItems.RAW_VINO.get());
                        output.accept(ModItems.CRUSHED_RAW_VINO.get());
                        output.accept(ModItems.VINO_INGOT.get());
                        output.accept(ModItems.VINO_NUGGET.get());
                        output.accept(ModItems.VINO_SWORD.get());
                        output.accept(ModItems.VINO_AXE.get());
                        output.accept(ModItems.VINO_PICKAXE.get());
                        output.accept(ModItems.VINO_SHOVEL.get());
                        output.accept(ModItems.VINO_HOE.get());
                        output.accept(ModItems.VINO_HELMET.get());
                        output.accept(ModItems.VINO_CHESTPLATE.get());
                        output.accept(ModItems.VINO_TROUSERS.get());
                        output.accept(ModItems.VINO_BOOTS.get());
                        output.accept(ModItems.INERT_VINO_TOME.get());
                        output.accept(ModItems.INERT_VINO_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_VINO_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_VINO_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.VINO_STAR_EIN.get());
                        output.accept(ModItems.VINO_STAR_ZWEI.get());
                        output.accept(ModItems.VINO_STAR_DREI.get());
                        output.accept(ModItems.VINO_STAR_VIER.get());
                        output.accept(ModItems.VINO_STAR_SPHERE.get());
                        output.accept(ModItems.VINO_STAR_OMEGA.get());
                        output.accept(ModItems.VINO_ALLOY.get());
                        output.accept(ModItems.VINO_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_VINO.get());
                        output.accept(ModItems.VINO_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_VINO.get());
                        output.accept(ModItems.VINO_PRESS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> WIBKITIUM_TAB = CREATIVE_MODE_TABS.register("wibkitium",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WIBKITIUM_CIRCUIT.get()))
                    .title(Component.translatable("creativetab.wibkitium"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.WIBKITIUM_ORE.get());
                        output.accept(ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.WIBKITIUM_NETHER_ORE.get());
                        output.accept(ModBlocks.WIBKITIUM_END_ORE.get());
                        output.accept(ModBlocks.RAW_WIBKITIUM_BLOCK.get());
                        output.accept(ModBlocks.WIBKITIUM_BLOCK.get());
                        output.accept(ModItems.WIBKITIUM_DISC.get());
                        output.accept(ModItems.WIBKITIUM_DUST.get());
                        output.accept(ModItems.TINY_WIBKITIUM_DUST.get());
                        output.accept(ModItems.RAW_WIBKITIUM.get());
                        output.accept(ModItems.CRUSHED_RAW_WIBKITIUM.get());
                        output.accept(ModItems.WIBKITIUM_INGOT.get());
                        output.accept(ModItems.WIBKITIUM_NUGGET.get());
                        output.accept(ModItems.WIBKITIUM_SWORD.get());
                        output.accept(ModItems.WIBKITIUM_AXE.get());
                        output.accept(ModItems.WIBKITIUM_PICKAXE.get());
                        output.accept(ModItems.WIBKITIUM_SHOVEL.get());
                        output.accept(ModItems.WIBKITIUM_HOE.get());
                        output.accept(ModItems.WIBKITIUM_HELMET.get());
                        output.accept(ModItems.WIBKITIUM_CHESTPLATE.get());
                        output.accept(ModItems.WIBKITIUM_TROUSERS.get());
                        output.accept(ModItems.WIBKITIUM_BOOTS.get());
                        output.accept(ModItems.INERT_WIBKITIUM_TOME.get());
                        output.accept(ModItems.INERT_WIBKITIUM_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_WIBKITIUM_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_WIBKITIUM_TRANSMUTATION_TABLET.get());
                        output.accept(ModItems.WIBKITIUM_STAR_EIN.get());
                        output.accept(ModItems.WIBKITIUM_STAR_ZWEI.get());
                        output.accept(ModItems.WIBKITIUM_STAR_DREI.get());
                        output.accept(ModItems.WIBKITIUM_STAR_VIER.get());
                        output.accept(ModItems.WIBKITIUM_STAR_SPHERE.get());
                        output.accept(ModItems.WIBKITIUM_STAR_OMEGA.get());
                        output.accept(ModItems.WIBKITIUM_ALLOY.get());
                        output.accept(ModItems.WIBKITIUM_CONTROL_CIRCUIT.get());
                        output.accept(ModItems.ENRICHED_WIBKITIUM.get());
                        output.accept(ModItems.WIBKITIUM_CIRCUIT.get());
                        output.accept(ModItems.PRINTED_WIBKITIUM.get());
                        output.accept(ModItems.WIBKITIUM_PRESS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MISCELLANEOUS_TAB = CREATIVE_MODE_TABS.register("miscellaneous",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.METRO.get()))
                    .title(Component.translatable("creativetab.miscellaneous"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.METRO.get());
                        output.accept(ModItems.INERT_TOME.get());
                        output.accept(ModItems.INERT_PHILOSOPHERS_STONE.get());
                        output.accept(ModItems.INERT_TRANSMUTATION_TABLE.get());
                        output.accept(ModItems.INERT_TRANSMUTATION_TABLET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
