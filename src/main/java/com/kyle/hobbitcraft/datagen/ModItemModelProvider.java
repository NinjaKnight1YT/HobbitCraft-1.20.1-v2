package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HobbitCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // DREADED ITEMS

        simpleItem(ModItems.RAW_DREAD);
        simpleItem(ModItems.CRUSHED_RAW_DREAD);
        simpleItem(ModItems.DREADED_INGOT);
        simpleItem(ModItems.DREADED_NUGGET);
        handheldItem(ModItems.DREADED_SWORD);
        handheldItem(ModItems.DREADED_AXE);
        handheldItem(ModItems.DREADED_PICKAXE);
        handheldItem(ModItems.DREADED_SHOVEL);
        handheldItem(ModItems.DREADED_HOE);

        // KYLE ITEMS

        simpleItem(ModItems.RAW_KYLE);
        simpleItem(ModItems.CRUSHED_RAW_KYLE);
        simpleItem(ModItems.KYLE_INGOT);
        simpleItem(ModItems.KYLE_NUGGET);
        handheldItem(ModItems.KYLE_SWORD);
        handheldItem(ModItems.KYLE_AXE);
        handheldItem(ModItems.KYLE_PICKAXE);
        handheldItem(ModItems.KYLE_SHOVEL);
        handheldItem(ModItems.KYLE_HOE);

        // WIBKITIUM ITEMS

        simpleItem(ModItems.RAW_WIBKITIUM);
        simpleItem(ModItems.CRUSHED_RAW_WIBKITIUM);
        simpleItem(ModItems.WIBKITIUM_INGOT);
        simpleItem(ModItems.WIBKITIUM_NUGGET);
        handheldItem(ModItems.WIBKITIUM_SWORD);
        handheldItem(ModItems.WIBKITIUM_AXE);
        handheldItem(ModItems.WIBKITIUM_PICKAXE);
        handheldItem(ModItems.WIBKITIUM_SHOVEL);
        handheldItem(ModItems.WIBKITIUM_HOE);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
