package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HobbitCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // DREADED BLOCKS

        blockWithItem(ModBlocks.RAW_DREAD_BLOCK);
        blockWithItem(ModBlocks.DREADED_BLOCK);
        blockWithItem(ModBlocks.DREADED_ORE);
        blockWithItem(ModBlocks.DREADED_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.DREADED_NETHER_ORE);
        blockWithItem(ModBlocks.DREADED_END_ORE);

        // KYLE BLOCKS

        blockWithItem(ModBlocks.RAW_KYLE_BLOCK);
        blockWithItem(ModBlocks.KYLE_BLOCK);
        blockWithItem(ModBlocks.KYLE_ORE);
        blockWithItem(ModBlocks.KYLE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.KYLE_NETHER_ORE);
        blockWithItem(ModBlocks.KYLE_END_ORE);

        // WIBKITIUM BLOCKS

        blockWithItem(ModBlocks.RAW_WIBKITIUM_BLOCK);
        blockWithItem(ModBlocks.WIBKITIUM_BLOCK);
        blockWithItem(ModBlocks.WIBKITIUM_ORE);
        blockWithItem(ModBlocks.WIBKITIUM_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.WIBKITIUM_NETHER_ORE);
        blockWithItem(ModBlocks.WIBKITIUM_END_ORE);

        // MISCELLANEOUS BLOCKS
        
        sidedBlock(ModBlocks.METRO);
        
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void sidedBlock(RegistryObject<Block> blockRegistryObject) {
        String blockName = blockRegistryObject.getId().getPath();
        simpleBlockWithItem(blockRegistryObject.get(), models().cube(
                blockName,
                modLoc("block/" + blockName + "_bottom"),   // Bottom texture
                modLoc("block/" + blockName + "_top"),      // Top texture
                modLoc("block/" + blockName + "_north"),    // North side texture
                modLoc("block/" + blockName + "_south"),    // South side texture
                modLoc("block/" + blockName + "_west"),     // West side texture
                modLoc("block/" + blockName + "_east")      // East side texture
        ));
    }


}
