package cx.rain.mc.infadv;

import cx.rain.mc.infadv.block.BlockItems;
import cx.rain.mc.infadv.block.Blocks;
import cx.rain.mc.infadv.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(InfinityAdventure.MODID)
public class InfinityAdventure {
    public static final String MODID = "infadv";
    public static final Logger LOGGER = LogManager.getLogger("Infinity Adventure");

    private static InfinityAdventure Instance;

    public InfinityAdventure() {
        Instance = this;

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        new Items(bus);
        new Blocks(bus);
        new BlockItems(bus);
    }

    public static InfinityAdventure getInstance() {
        return Instance;
    }
}
