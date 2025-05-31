package com.kyle.hobbitcraft.datagen.loot;

import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {


        // PLUSHIES

        this.dropSelf(ModBlocks.SWELL_PLUSHIE.get());
        this.dropSelf(ModBlocks.KYLE_PLUSHIE.get());
        this.dropSelf(ModBlocks.YUKI_PLUSHIE.get());
        this.dropSelf(ModBlocks.WIBKIT_PLUSHIE.get());

        // DREADED BLOCKS

        this.dropSelf(ModBlocks.RAW_DREAD_BLOCK.get());
        this.dropSelf(ModBlocks.DREADED_BLOCK.get());
        this.dropSelf(ModBlocks.DREADED_ORE.get());
        this.dropSelf(ModBlocks.DREADED_DEEPSLATE_ORE.get());
        this.dropSelf(ModBlocks.DREADED_NETHER_ORE.get());
        this.dropSelf(ModBlocks.DREADED_END_ORE.get());

        // HOBBITCRAFTIUM BLOCK

        this.dropSelf(ModBlocks.HOBBITCRAFTIUM_BLOCK.get());

        // KYLE BLOCKS

        this.dropSelf(ModBlocks.RAW_KYLE_BLOCK.get());
        this.dropSelf(ModBlocks.KYLE_BLOCK.get());
        this.dropSelf(ModBlocks.KYLE_ORE.get());
        this.dropSelf(ModBlocks.KYLE_DEEPSLATE_ORE.get());
        this.dropSelf(ModBlocks.KYLE_NETHER_ORE.get());
        this.dropSelf(ModBlocks.KYLE_END_ORE.get());

        // VINO BLOCKS

        this.dropSelf(ModBlocks.RAW_VINO_BLOCK.get());
        this.dropSelf(ModBlocks.VINO_BLOCK.get());
        this.dropSelf(ModBlocks.VINO_ORE.get());
        this.dropSelf(ModBlocks.VINO_DEEPSLATE_ORE.get());
        this.dropSelf(ModBlocks.VINO_NETHER_ORE.get());
        this.dropSelf(ModBlocks.VINO_END_ORE.get());

        // WIBKITIUM BLOCKS

        this.dropSelf(ModBlocks.RAW_WIBKITIUM_BLOCK.get());
        this.dropSelf(ModBlocks.WIBKITIUM_BLOCK.get());
        this.dropSelf(ModBlocks.WIBKITIUM_ORE.get());
        this.dropSelf(ModBlocks.WIBKITIUM_DEEPSLATE_ORE.get());
        this.dropSelf(ModBlocks.WIBKITIUM_NETHER_ORE.get());
        this.dropSelf(ModBlocks.WIBKITIUM_END_ORE.get());

        // MISCELLANEOUS BLOCKS

        this.dropSelf(ModBlocks.METRO.get());

        // COLLECTORS

        this.dropSelf(ModBlocks.DREADED_COLLECTOR.get());
        this.dropSelf(ModBlocks.HOBBITCRAFTIUM_COLLECTOR.get());
        this.dropSelf(ModBlocks.KYLE_COLLECTOR.get());
        this.dropSelf(ModBlocks.VINO_COLLECTOR.get());
        this.dropSelf(ModBlocks.WIBKITIUM_COLLECTOR.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
