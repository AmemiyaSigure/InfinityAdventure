package cx.rain.mc.infadv.item;

import cx.rain.mc.infadv.InfinityAdventure;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityAdventure.MODID);

    public Items(IEventBus bus) {
        ITEMS.register(bus);
    }

    // Items below here.

}
