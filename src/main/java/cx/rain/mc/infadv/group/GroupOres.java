package cx.rain.mc.infadv.group;

import cx.rain.mc.infadv.block.ModBlockItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GroupOres extends ItemGroup {
    public GroupOres() {
        super("infadv_ores");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlockItems.SILVER_ORE.get());
    }
}
