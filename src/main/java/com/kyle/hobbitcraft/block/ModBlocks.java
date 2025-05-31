package com.kyle.hobbitcraft.block;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.custom.*;
import com.kyle.hobbitcraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HobbitCraft.MOD_ID);


    // DREADED BLOCKS


    public static final RegistryObject<Block> RAW_DREAD_BLOCK = registerBlock("block_of_raw_dread",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> DREADED_BLOCK = registerBlock("dreaded_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> DREADED_ORE = registerBlock("dreaded_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DREADED_DEEPSLATE_ORE = registerBlock("dreaded_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<Block> DREADED_NETHER_ORE = registerBlock("dreaded_nether_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));
    public static final RegistryObject<Block> DREADED_END_ORE = registerBlock("dreaded_end_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));


    // HOBBITCRAFTIUM BLOCK


    public static final RegistryObject<Block> HOBBITCRAFTIUM_BLOCK = registerBlock("hobbitcraftium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));


    // KYLE BLOCKS


    public static final RegistryObject<Block> RAW_KYLE_BLOCK = registerBlock("block_of_raw_kyle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> KYLE_BLOCK = registerBlock("kyle_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> KYLE_ORE = registerBlock("kyle_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> KYLE_DEEPSLATE_ORE = registerBlock("kyle_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<Block> KYLE_NETHER_ORE = registerBlock("kyle_nether_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));
    public static final RegistryObject<Block> KYLE_END_ORE = registerBlock("kyle_end_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));


    // VINO BLOCKS


    public static final RegistryObject<Block> RAW_VINO_BLOCK = registerBlock("block_of_raw_vino",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> VINO_BLOCK = registerBlock("vino_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> VINO_ORE = registerBlock("vino_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> VINO_DEEPSLATE_ORE = registerBlock("vino_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<Block> VINO_NETHER_ORE = registerBlock("vino_nether_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));
    public static final RegistryObject<Block> VINO_END_ORE = registerBlock("vino_end_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));


    // WIBKITIUM BLOCKS


    public static final RegistryObject<Block> RAW_WIBKITIUM_BLOCK = registerBlock("block_of_raw_wibkitium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> WIBKITIUM_BLOCK = registerBlock("wibkitium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> WIBKITIUM_ORE = registerBlock("wibkitium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> WIBKITIUM_DEEPSLATE_ORE = registerBlock("wibkitium_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<Block> WIBKITIUM_NETHER_ORE = registerBlock("wibkitium_nether_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));
    public static final RegistryObject<Block> WIBKITIUM_END_ORE = registerBlock("wibkitium_end_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));

    // MISCELLANEOUS BLOCKS

    public static final RegistryObject<Block> METRO = registerBlock("metro_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).lightLevel(state -> 15)));

    // COLLECTORS

    public static final RegistryObject<Block> DREADED_COLLECTOR = registerBlock("dreaded_collector",
            () -> new DreadedCollector(BlockBehaviour.Properties.copy(ModBlocks.DREADED_BLOCK.get()).noOcclusion()));
    public static final RegistryObject<Block> HOBBITCRAFTIUM_COLLECTOR = registerBlock("hobbitcraftium_collector",
            () -> new HobbitCraftiumCollector(BlockBehaviour.Properties.copy(ModBlocks.HOBBITCRAFTIUM_BLOCK.get()).noOcclusion()));
    public static final RegistryObject<Block> KYLE_COLLECTOR = registerBlock("kyle_collector",
            () -> new KyleCollector(BlockBehaviour.Properties.copy(ModBlocks.KYLE_BLOCK.get()).noOcclusion()));
    public static final RegistryObject<Block> VINO_COLLECTOR = registerBlock("vino_collector",
            () -> new VinoCollector(BlockBehaviour.Properties.copy(ModBlocks.VINO_BLOCK.get()).noOcclusion()));
    public static final RegistryObject<Block> WIBKITIUM_COLLECTOR = registerBlock("wibkitium_collector",
            () -> new WibkitiumCollector(BlockBehaviour.Properties.copy(ModBlocks.WIBKITIUM_BLOCK.get()).noOcclusion()));

    // PLUSHIES

    public static final RegistryObject<Block> SWELL_PLUSHIE = registerBlock("swell_plushie",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> KYLE_PLUSHIE = registerBlock("kyle_plushie",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> YUKI_PLUSHIE = registerBlock("yuki_plushie",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noOcclusion()));
    public static final RegistryObject<Block> WIBKIT_PLUSHIE = registerBlock("wibkit_plushie",
            () -> new Plushie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noOcclusion()));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
