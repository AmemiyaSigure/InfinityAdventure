package cx.rain.mc.infadv.block;

import cx.rain.mc.infadv.InfinityAdventure;
import net.minecraft.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InfinityAdventure.MODID);

    public Blocks(IEventBus bus) {
        BLOCKS.register(bus);
    }

    // Blocks below here.

}
