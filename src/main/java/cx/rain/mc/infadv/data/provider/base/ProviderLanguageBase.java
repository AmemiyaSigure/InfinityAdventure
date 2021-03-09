package cx.rain.mc.infadv.data.provider.base;

import cx.rain.mc.infadv.InfinityAdventure;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.function.Supplier;

public abstract class ProviderLanguageBase extends LanguageProvider {
    public ProviderLanguageBase(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    protected void addItemGroup(ItemGroup group, String name) {
        add("itemGroup." + group.getPath(), name);
    }

    protected void addTooltip(Supplier<? extends Item> item, int line, String value) {
        add("tooltip." + InfinityAdventure.MODID + "." + item.get().getRegistryName().getPath() + "." + line, value);
    }
}
