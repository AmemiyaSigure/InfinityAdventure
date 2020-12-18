package cx.rain.mc.infadv.block.base;

import cx.rain.mc.infadv.enumerate.OreType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class OreBlockBase extends Block {
    private OreType type;

    public OreBlockBase(OreType typeIn, int level, float hardness, float resistance) {
        super(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(level)
                .setRequiresTool()
                .hardnessAndResistance(hardness, resistance));
        type = typeIn;
    }
}
