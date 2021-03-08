package cx.rain.mc.infadv.utility.enums;

import java.util.EnumSet;
import java.util.Set;

public enum ItemFeature {
    IS_SACRED(1),
    ANTI_CORRUPTION(1 << 1),
    ;

    private final long value;

    private ItemFeature(long flagValue) {
        value = flagValue;
    }

    public long getValue() {
        return value;
    }

    public Set<ItemFeature> fromLong(long valueIn) {
        EnumSet<ItemFeature> flags = EnumSet.noneOf(ItemFeature.class);
        for (ItemFeature flag : ItemFeature.values()) {
            if ((flag.value & valueIn) == valueIn) {
                flags.add(flag);
            }
        }
        return flags;
    }

    public long toLong(Set<ItemFeature> flags) {
        long value = 0;
        for (ItemFeature flag : flags) {
            value |= flag.value;
        }
        return value;
    }
}
