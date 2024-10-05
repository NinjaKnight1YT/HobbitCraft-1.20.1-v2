package com.kyle.hobbitcraft.datagen;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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

        simpleDreadedItem(ModItems.RAW_DREAD);
        simpleDreadedItem(ModItems.CRUSHED_RAW_DREAD);
        simpleDreadedItem(ModItems.DREADED_INGOT);
        simpleDreadedItem(ModItems.DREADED_NUGGET);
        simpleDreadedItem(ModItems.DREADED_STAR_EIN);
        simpleDreadedItem(ModItems.DREADED_STAR_ZWEI);
        simpleDreadedItem(ModItems.DREADED_STAR_DREI);
        simpleDreadedItem(ModItems.DREADED_STAR_VIER);
        simpleDreadedItem(ModItems.DREADED_STAR_SPHERE);
        simpleDreadedItem(ModItems.DREADED_STAR_OMEGA);
        handheldDreadedItem(ModItems.DREADED_SWORD);
        handheldDreadedItem(ModItems.DREADED_AXE);
        handheldDreadedItem(ModItems.DREADED_PICKAXE);
        handheldDreadedItem(ModItems.DREADED_SHOVEL);
        handheldDreadedItem(ModItems.DREADED_HOE);

        // KYLE ITEMS

        simpleKyleItem(ModItems.RAW_KYLE);
        simpleKyleItem(ModItems.CRUSHED_RAW_KYLE);
        simpleKyleItem(ModItems.KYLE_INGOT);
        simpleKyleItem(ModItems.KYLE_NUGGET);
        simpleKyleItem(ModItems.KYLE_STAR_EIN);
        simpleKyleItem(ModItems.KYLE_STAR_ZWEI);
        simpleKyleItem(ModItems.KYLE_STAR_DREI);
        simpleKyleItem(ModItems.KYLE_STAR_VIER);
        simpleKyleItem(ModItems.KYLE_STAR_SPHERE);
        simpleKyleItem(ModItems.KYLE_STAR_OMEGA);
        handheldKyleItem(ModItems.KYLE_SWORD);
        handheldKyleItem(ModItems.KYLE_AXE);
        handheldKyleItem(ModItems.KYLE_PICKAXE);
        handheldKyleItem(ModItems.KYLE_SHOVEL);
        handheldKyleItem(ModItems.KYLE_HOE);

        // VINO ITEMS

        simpleVinoItem(ModItems.RAW_VINO);
        simpleVinoItem(ModItems.CRUSHED_RAW_VINO);
        simpleVinoItem(ModItems.VINO_INGOT);
        simpleVinoItem(ModItems.VINO_NUGGET);
        simpleVinoItem(ModItems.VINO_STAR_EIN);
        simpleVinoItem(ModItems.VINO_STAR_ZWEI);
        simpleVinoItem(ModItems.VINO_STAR_DREI);
        simpleVinoItem(ModItems.VINO_STAR_VIER);
        simpleVinoItem(ModItems.VINO_STAR_SPHERE);
        simpleVinoItem(ModItems.VINO_STAR_OMEGA);
        handheldVinoItem(ModItems.VINO_SWORD);
        handheldVinoItem(ModItems.VINO_AXE);
        handheldVinoItem(ModItems.VINO_PICKAXE);
        handheldVinoItem(ModItems.VINO_SHOVEL);
        handheldVinoItem(ModItems.VINO_HOE);

        // WIBKITIUM ITEMS

        simpleWibkitiumItem(ModItems.RAW_WIBKITIUM);
        simpleWibkitiumItem(ModItems.CRUSHED_RAW_WIBKITIUM);
        simpleWibkitiumItem(ModItems.WIBKITIUM_INGOT);
        simpleWibkitiumItem(ModItems.WIBKITIUM_NUGGET);
        simpleWibkitiumItem(ModItems.WIBKITIUM_STAR_EIN);
        simpleWibkitiumItem(ModItems.WIBKITIUM_STAR_ZWEI);
        simpleWibkitiumItem(ModItems.WIBKITIUM_STAR_DREI);
        simpleWibkitiumItem(ModItems.WIBKITIUM_STAR_VIER);
        simpleWibkitiumItem(ModItems.WIBKITIUM_STAR_SPHERE);
        simpleWibkitiumItem(ModItems.WIBKITIUM_STAR_OMEGA);
        handheldWibkitiumItem(ModItems.WIBKITIUM_SWORD);
        handheldWibkitiumItem(ModItems.WIBKITIUM_AXE);
        handheldWibkitiumItem(ModItems.WIBKITIUM_PICKAXE);
        handheldWibkitiumItem(ModItems.WIBKITIUM_SHOVEL);
        handheldWibkitiumItem(ModItems.WIBKITIUM_HOE);
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

    private ItemModelBuilder handheldDreadedItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/dreaded/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleDreadedItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/dreaded/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldKyleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/kyle/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleKyleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/kyle/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldVinoItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/vino/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleVinoItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/vino/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldWibkitiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/wibkitium/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleWibkitiumItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/wibkitium/" + item.getId().getPath()));
    }
}
