package cx.rain.mc.infadv.data.provider.base;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.data.LanguageProvider;

public abstract class ProviderLanguageBase extends LanguageProvider {
    public ProviderLanguageBase(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    protected void addItemGroup(ItemGroup group, String name) {
        add("itemGroup." + group.getPath(), name);
    }
}
