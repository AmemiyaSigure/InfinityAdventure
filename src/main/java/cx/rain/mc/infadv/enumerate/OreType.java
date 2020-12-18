package cx.rain.mc.infadv.enumerate;

public enum OreType {
    Silver("silver"),
    Mithril("mithril"),
    Adamantine("adamantine"),
    Aquamarine("aquamarine");


    private String name;

    private OreType(String nameIn) {
        name = nameIn;
    }

    public String getName() {
        return name;
    }
}
