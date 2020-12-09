package cx.rain.mc.infadv;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(InfinityAdventure.MODID)
public class InfinityAdventure {
    public static final String MODID = "infadv";
    public static final Logger LOGGER = LogManager.getLogger("Infinity Adventure");

    private static InfinityAdventure Instance;

    public InfinityAdventure() {
        Instance = this;
    }

    public static InfinityAdventure getInstance() {
        return Instance;
    }
}
