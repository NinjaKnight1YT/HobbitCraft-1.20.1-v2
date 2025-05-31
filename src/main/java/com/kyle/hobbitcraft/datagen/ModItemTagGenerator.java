package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, HobbitCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.DREADED_HELMET.get(),
                        ModItems.DREADED_CHESTPLATE.get(),
                        ModItems.DREADED_TROUSERS.get(),
                        ModItems.DREADED_BOOTS.get(),
                        ModItems.HOBBITCRAFTIUM_HELMET.get(),
                        ModItems.HOBBITCRAFTIUM_CHESTPLATE.get(),
                        ModItems.HOBBITCRAFTIUM_TROUSERS.get(),
                        ModItems.HOBBITCRAFTIUM_BOOTS.get(),
                        ModItems.KYLE_HELMET.get(),
                        ModItems.KYLE_CHESTPLATE.get(),
                        ModItems.KYLE_TROUSERS.get(),
                        ModItems.KYLE_BOOTS.get(),
                        ModItems.VINO_HELMET.get(),
                        ModItems.VINO_CHESTPLATE.get(),
                        ModItems.VINO_TROUSERS.get(),
                        ModItems.VINO_BOOTS.get(),
                        ModItems.WIBKITIUM_HELMET.get(),
                        ModItems.WIBKITIUM_CHESTPLATE.get(),
                        ModItems.WIBKITIUM_TROUSERS.get(),
                        ModItems.WIBKITIUM_BOOTS.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.DREADED_DISC.get(),
                        ModItems.KYLE_DISC.get(),
                        ModItems.VINO_DISC.get(),
                        ModItems.WIBKITIUM_DISC.get());
        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.DREADED_DISC.get(),
                        ModItems.KYLE_DISC.get(),
                        ModItems.VINO_DISC.get(),
                        ModItems.WIBKITIUM_DISC.get());
    }
}
