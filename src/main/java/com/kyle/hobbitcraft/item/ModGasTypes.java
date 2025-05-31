package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.GasBuilder;
import mekanism.common.registration.impl.GasDeferredRegister;
import mekanism.common.registration.impl.GasRegistryObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModGasTypes {
    private ModGasTypes() {

    }

    public static final GasDeferredRegister CHEMICALS = new GasDeferredRegister(HobbitCraft.MOD_ID);

    public static final GasRegistryObject<Gas> DREAD = CHEMICALS.register("dread",
            () -> new Gas(GasBuilder.builder().tint(0x8454F5)));
    public static final GasRegistryObject<Gas> HOBBITCRAFTIUM = CHEMICALS.register("hobbitcraftium",
            () -> new Gas(GasBuilder.builder(new ResourceLocation(HobbitCraft.MOD_ID, "item/gases/hobbitcraftium"))));
    public static final GasRegistryObject<Gas> KYLE = CHEMICALS.register("kyle",
            () -> new Gas(GasBuilder.builder().tint(0x008FFF)));
    public static final GasRegistryObject<Gas> VINO = CHEMICALS.register("vino",
            () -> new Gas(GasBuilder.builder().tint(0x7B0323)));
    public static final GasRegistryObject<Gas> WIBKITIUM = CHEMICALS.register("wibkitium",
            () -> new Gas(GasBuilder.builder().tint(0xA1FFC1)));


    public static void register(IEventBus eventBus) {
        CHEMICALS.register(eventBus);
    }
}
