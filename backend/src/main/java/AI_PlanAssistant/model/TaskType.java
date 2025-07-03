package AI_PlanAssistant.model;

public enum TaskType {
    BOKFORING_TRANSAKTIONER("Bokföring & Transaktioner"),
    FAKTURERING_BETALNINGAR("Fakturering & Betalningar"),
    LONEADMINISTRATION("Löneadministration"),
    BOKSLUT_DEKLARATIONER("Bokslut & Deklarationer"),
    KUNDSUPPORT_RADGIVNING("Kundsupport & Rådgivning"),
    BOLAGSBILDNING_AVVECKLING("Bolagsbildning & Avveckling"),
    OVRIGT("Övrigt");

    private final String displayName;

    TaskType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    // Används vid omvandling från sträng till enum
    public static TaskType fromDisplayName(String name) {
        for (TaskType type : TaskType.values()) {
            if (type.displayName.equalsIgnoreCase(name)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Okänd arbetsuppgiftstyp: " + name);
    }
}

