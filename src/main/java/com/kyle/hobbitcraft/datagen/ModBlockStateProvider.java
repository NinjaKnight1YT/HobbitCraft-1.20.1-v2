package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HobbitCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // DREADED BLOCKS

        simpleDreadedBlock(ModBlocks.RAW_DREAD_BLOCK);
        simpleDreadedBlock(ModBlocks.DREADED_BLOCK);
        simpleDreadedBlock(ModBlocks.DREADED_ORE);
        simpleDreadedBlock(ModBlocks.DREADED_DEEPSLATE_ORE);
        simpleDreadedBlock(ModBlocks.DREADED_NETHER_ORE);
        simpleDreadedBlock(ModBlocks.DREADED_END_ORE);

        // HOBBITCRAFTIUM BLOCK

        simpleHobbitCraftiumBlock(ModBlocks.HOBBITCRAFTIUM_BLOCK);

        // KYLE BLOCKS

        simpleKyleBlock(ModBlocks.RAW_KYLE_BLOCK);
        simpleKyleBlock(ModBlocks.KYLE_BLOCK);
        simpleKyleBlock(ModBlocks.KYLE_ORE);
        simpleKyleBlock(ModBlocks.KYLE_DEEPSLATE_ORE);
        simpleKyleBlock(ModBlocks.KYLE_NETHER_ORE);
        simpleKyleBlock(ModBlocks.KYLE_END_ORE);

        // VINO BLOCKS

        simpleVinoBlock(ModBlocks.RAW_VINO_BLOCK);
        simpleVinoBlock(ModBlocks.VINO_BLOCK);
        simpleVinoBlock(ModBlocks.VINO_ORE);
        simpleVinoBlock(ModBlocks.VINO_DEEPSLATE_ORE);
        simpleVinoBlock(ModBlocks.VINO_NETHER_ORE);
        simpleVinoBlock(ModBlocks.VINO_END_ORE);

        // WIBKITIUM BLOCKS

        simpleWibkitiumBlock(ModBlocks.RAW_WIBKITIUM_BLOCK);
        simpleWibkitiumBlock(ModBlocks.WIBKITIUM_BLOCK);
        simpleWibkitiumBlock(ModBlocks.WIBKITIUM_ORE);
        simpleWibkitiumBlock(ModBlocks.WIBKITIUM_DEEPSLATE_ORE);
        simpleWibkitiumBlock(ModBlocks.WIBKITIUM_NETHER_ORE);
        simpleWibkitiumBlock(ModBlocks.WIBKITIUM_END_ORE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }


    private void simpleDreadedCollector(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();

        simpleBlockWithItem(blockRegistryObject.get(), models().orientable(
                blockName,
                modLoc("block/dreaded/dreaded_block"),
                modLoc("block/collector/dreaded_collector_front"),
                modLoc("block/dreaded/dreaded_block")
        ));
    }

    private void simpleHobbitCraftiumCollector(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();

        simpleBlockWithItem(blockRegistryObject.get(), models().orientable(
                blockName,
                modLoc("block/hobbitcraftium/hobbitcraftium_block"),
                modLoc("block/collector/hobbitcraftium_collector_front"),
                modLoc("block/hobbitcraftium/hobbitcraftium_block")
        ));
    }

    private void simpleKyleCollector(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();

        simpleBlockWithItem(blockRegistryObject.get(), models().orientable(
                blockName,
                modLoc("block/kyle/kyle_block"),
                modLoc("block/collector/kyle_collector_front"),
                modLoc("block/kyle/kyle_block")
        ));
    }

    private void simpleVinoCollector(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();

        simpleBlockWithItem(blockRegistryObject.get(), models().orientable(
                blockName,
                modLoc("block/vino/vino_block"),
                modLoc("block/collector/vino_collector_front"),
                modLoc("block/vino/vino_block")
        ));
    }

    private void simpleWibkitiumCollector(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();

        simpleBlockWithItem(blockRegistryObject.get(), models().orientable(
                blockName,
                modLoc("block/wibkitium/wibkitium_block"),
                modLoc("block/collector/wibkitium_collector_front"),
                modLoc("block/wibkitium/wibkitium_block")
        ));
    }

    private void simpleDreadedBlock(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeAll(
                blockName,
                modLoc("block/dreaded/" + blockName)
        ));
    }
    private void simpleHobbitCraftiumBlock(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeAll(
                blockName,
                modLoc("block/hobbitcraftium/" + blockName)
        ));
    }
    private void simpleKyleBlock(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeAll(
                blockName,
                modLoc("block/kyle/" + blockName)
        ));
    }
    private void simpleVinoBlock(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeAll(
                blockName,
                modLoc("block/vino/" + blockName)
        ));
    }
    private void simpleWibkitiumBlock(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeAll(
                blockName,
                modLoc("block/wibkitium/" + blockName)
        ));
    }
}

