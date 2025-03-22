package pironeer;

public enum Appearance {
    HAIR("머리"),
    CLOTHES("옷"),
    SHOES("신발");

    private final String description;

    Appearance(String description) {
        this.description = description;
    }

    public String getDescription() {
        if (this == HAIR) {
            return "머리스타일";
        }
        return description;
    }
    public String getAppearanceType() {
        return description;
    }


    public static Appearance getRandomAppearance() {
        Appearance[] values = Appearance.values();
        return values[new java.util.Random().nextInt(values.length)];
    }
}
