package com.kyle.hobbitcraft.item;

import com.kyle.hobbitcraft.HobbitCraft;
import mekanism.api.chemical.infuse.InfuseType;
import mekanism.common.registration.impl.InfuseTypeDeferredRegister;
import mekanism.common.registration.impl.InfuseTypeRegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModInfuseTypes {

    private ModInfuseTypes() {

    }

    public static final InfuseTypeDeferredRegister INFUSE_TYPES = new InfuseTypeDeferredRegister(HobbitCraft.MOD_ID);

    public static final InfuseTypeRegistryObject<InfuseType> DREAD = INFUSE_TYPES.register("dread", 0x8454F5);
    public static final InfuseTypeRegistryObject<InfuseType> HOBBITCRAFTIUM = INFUSE_TYPES.register("hobbitcraftium", HobbitCraft.rl("item/infuse_type/hobbitcraftium"), 0x123456);
    public static final InfuseTypeRegistryObject<InfuseType> KYLE = INFUSE_TYPES.register("kyle", 0x008FFF);
    public static final InfuseTypeRegistryObject<InfuseType> VINO = INFUSE_TYPES.register("vino", 0x7B0323);
    public static final InfuseTypeRegistryObject<InfuseType> WIBKITIUM = INFUSE_TYPES.register("wibkitium", 0xA1FFC1);

    public static void register(IEventBus eventBus) {
        INFUSE_TYPES.register(eventBus);
    }
}
