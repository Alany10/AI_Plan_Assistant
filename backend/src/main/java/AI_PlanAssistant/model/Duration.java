package AI_PlanAssistant.model;

public enum Duration {
    LESS_THAN_30("< 30 min"),
    BETWEEN_30_AND_60("30–60 min"),
    MORE_THAN_60("> 60 min");

    private final String displayName;

    Duration(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Duration fromDisplayName(String name) {
        for (Duration d : Duration.values()) {
            if (d.displayName.equalsIgnoreCase(name)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Okänd varaktighet: " + name);
    }
}

