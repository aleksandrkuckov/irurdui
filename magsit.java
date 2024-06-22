public enum Category {
    SPORTS("Sports"),
    MUSIC("Music"),
    TECHNOLOGY("Technology");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
