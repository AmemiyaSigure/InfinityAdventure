package cx.rain.mc.infadv.data.provider.language;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.data.LanguageProvider;

public abstract class ProviderLanguages extends LanguageProvider {
    public ProviderLanguages(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    protected void addItemGroup(ItemGroup group, String name) {
        add("itemGroup." + group.getPath(), name);
    }
}
