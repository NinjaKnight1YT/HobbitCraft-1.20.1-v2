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
        simpleItem(ModItems.DREADED_INGOT);
        simpleItem(ModItems.DREADED_SWORD);
        simpleItem(ModItems.KYLE_INGOT);
        simpleItem(ModItems.KYLE_SWORD);
        simpleItem(ModItems.WIBKITIUM_INGOT);
        simpleItem(ModItems.WIBKITIUM_SWORD);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HobbitCraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
