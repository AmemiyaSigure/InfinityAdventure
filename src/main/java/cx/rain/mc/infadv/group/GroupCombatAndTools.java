package cx.rain.mc.infadv.group;

import cx.rain.mc.infadv.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GroupCombatAndTools extends ItemGroup {
    public GroupCombatAndTools() {
        super("infadv_combat_and_tools");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.SILVER_SWORD.get());
    }
}
