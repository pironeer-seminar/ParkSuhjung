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
        return description;
    }
}
