package cx.rain.mc.infadv.block;

import cx.rain.mc.infadv.InfinityAdventure;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockItems {
    public static final DeferredRegister<Item> BLOCK_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityAdventure.MODID);

    public BlockItems(IEventBus bus) {
        BLOCK_ITEMS.register(bus);
    }

    // BlockItems below here.

}
