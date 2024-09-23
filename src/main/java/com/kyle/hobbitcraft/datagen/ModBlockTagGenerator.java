package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HobbitCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // add this.tag(ModTags.Blocks.#TAG_NAME).add(ModBlocks.#BLOCK.get());
        // For standard tags add .addTag(Tags.Blocks.#TAG_NAME);
        // Also change ModTags.Blocks to BlockTags and ignore the line above if just doing standard tags
        // For multiple blocks, just add them in a list before closing the ModBlocks parenthesis
        // For Forge tags as opposed to Minecraft tags, it's Tags.Blocks, not BlockTags
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(

                ModBlocks.RAW_DREAD_BLOCK.get(),
                ModBlocks.DREADED_BLOCK.get(),
                ModBlocks.DREADED_ORE.get(),
                ModBlocks.DREADED_DEEPSLATE_ORE.get(),
                ModBlocks.DREADED_NETHER_ORE.get(),
                ModBlocks.DREADED_END_ORE.get(),

                ModBlocks.RAW_KYLE_BLOCK.get(),
                ModBlocks.KYLE_BLOCK.get(),
                ModBlocks.KYLE_ORE.get(),
                ModBlocks.KYLE_DEEPSLATE_ORE.get(),
                ModBlocks.KYLE_NETHER_ORE.get(),
                ModBlocks.KYLE_END_ORE.get(),

                ModBlocks.RAW_VINO_BLOCK.get(),
                ModBlocks.VINO_BLOCK.get(),
                ModBlocks.VINO_ORE.get(),
                ModBlocks.VINO_DEEPSLATE_ORE.get(),
                ModBlocks.VINO_NETHER_ORE.get(),
                ModBlocks.VINO_END_ORE.get(),

                ModBlocks.RAW_WIBKITIUM_BLOCK.get(),
                ModBlocks.WIBKITIUM_BLOCK.get(),
                ModBlocks.WIBKITIUM_ORE.get(),
                ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get(),
                ModBlocks.WIBKITIUM_NETHER_ORE.get(),
                ModBlocks.WIBKITIUM_END_ORE.get(),

                ModBlocks.METRO.get()
        );
    }
}
