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

        simpleItem(ModItems.RAW_DREAD);
        simpleItem(ModItems.DREADED_INGOT);
        simpleItem(ModItems.DREADED_SWORD);
        simpleItem(ModItems.DREADED_AXE);
        simpleItem(ModItems.DREADED_PICKAXE);
        simpleItem(ModItems.DREADED_SHOVEL);
        simpleItem(ModItems.DREADED_HOE);

        // KYLE ITEMS

        simpleItem(ModItems.RAW_KYLE);
        simpleItem(ModItems.KYLE_INGOT);
        simpleItem(ModItems.KYLE_SWORD);
        simpleItem(ModItems.KYLE_AXE);
        simpleItem(ModItems.KYLE_PICKAXE);
        simpleItem(ModItems.KYLE_SHOVEL);
        simpleItem(ModItems.KYLE_HOE);

        // WIBKITIUM ITEMS

        simpleItem(ModItems.RAW_WIBKITIUM);
        simpleItem(ModItems.WIBKITIUM_INGOT);
        simpleItem(ModItems.WIBKITIUM_SWORD);
        simpleItem(ModItems.WIBKITIUM_AXE);
        simpleItem(ModItems.WIBKITIUM_PICKAXE);
        simpleItem(ModItems.WIBKITIUM_SHOVEL);
        simpleItem(ModItems.WIBKITIUM_HOE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
