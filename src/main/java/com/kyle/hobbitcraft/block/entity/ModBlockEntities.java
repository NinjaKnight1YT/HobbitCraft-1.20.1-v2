package com.kyle.hobbitcraft.block.entity;

import com.kyle.hobbitcraft.HobbitCraft;
import com.kyle.hobbitcraft.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HobbitCraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<DreadedCollector>> DREADED_COLLECTOR =
            BLOCK_ENTITIES.register("dreaded_collector", () ->
                    BlockEntityType.Builder.of(DreadedCollector::new,
                            ModBlocks.DREADED_COLLECTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<HobbitCraftiumCollector>> HOBBITCRAFTIUM_COLLECTOR =
            BLOCK_ENTITIES.register("hobbitcraftium_collector", () ->
                    BlockEntityType.Builder.of(HobbitCraftiumCollector::new,
                            ModBlocks.HOBBITCRAFTIUM_COLLECTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<KyleCollector>> KYLE_COLLECTOR =
            BLOCK_ENTITIES.register("kyle_collector", () ->
                    BlockEntityType.Builder.of(KyleCollector::new,
                            ModBlocks.KYLE_COLLECTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<VinoCollector>> VINO_COLLECTOR =
            BLOCK_ENTITIES.register("vino_collector", () ->
                    BlockEntityType.Builder.of(VinoCollector::new,
                            ModBlocks.VINO_COLLECTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<WibkitiumCollector>> WIBKITIUM_COLLECTOR =
            BLOCK_ENTITIES.register("wibkitium_collector", () ->
                    BlockEntityType.Builder.of(WibkitiumCollector::new,
                            ModBlocks.WIBKITIUM_COLLECTOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
