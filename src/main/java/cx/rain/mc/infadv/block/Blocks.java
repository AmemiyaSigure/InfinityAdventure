package cx.rain.mc.infadv.block;

import cx.rain.mc.infadv.InfinityAdventure;
import cx.rain.mc.infadv.block.base.OreBlockBase;
import cx.rain.mc.infadv.enumerate.OreType;
import net.minecraft.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InfinityAdventure.MODID);

    public Blocks(IEventBus bus) {
        BLOCKS.register(bus);
    }

    // Blocks below here.
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new OreBlockBase(OreType.Silver, 2, 3.0f, 3.0f));
    public static final RegistryObject<Block> MITHRIL_ORE = BLOCKS.register("mithril_ore", () -> new OreBlockBase(OreType.Mithril, 3, 3.0f, 5.0f));
    public static final RegistryObject<Block> ADAMANTINE_ORE = BLOCKS.register("adamantine_ore", () -> new OreBlockBase(OreType.Adamantine, 3, 3.0f, 6.0f));
    public static final RegistryObject<Block> AQUAMARINE_ORE = BLOCKS.register("aquamarine_ore", () -> new OreBlockBase(OreType.Aquamarine, 1, 3.0f, 2.0f));
}
