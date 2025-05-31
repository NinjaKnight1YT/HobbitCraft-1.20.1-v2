package com.kyle.hobbitcraft.sound;

import com.kyle.hobbitcraft.HobbitCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HobbitCraft.MOD_ID);

    public static final RegistryObject<SoundEvent> DREADED_DISC = registerSoundEvents("dreaded_disc");
    public static final RegistryObject<SoundEvent> KYLE_DISC = registerSoundEvents("kyle_disc");
    public static final RegistryObject<SoundEvent> VINO_DISC = registerSoundEvents("vino_disc");
    public static final RegistryObject<SoundEvent> WIBKITIUM_DISC = registerSoundEvents("wibkitium_disc");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(HobbitCraft.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
