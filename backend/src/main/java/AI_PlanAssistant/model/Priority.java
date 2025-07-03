package AI_PlanAssistant.model;

public enum Priority {
    LAG("Låg"),
    MEDEL("Medel"),
    HOG("Hög");

    private final String displayName;

    Priority(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Priority fromDisplayName(String name) {
        for (Priority p : Priority.values()) {
            if (p.displayName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Okänd prioritet: " + name);
    }
}

