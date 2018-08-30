package data;

import org.springframework.stereotype.Component;

public enum Cloudiness {
    SLONECZNIE("Słonecznie"),
    UMIARKOWANE("Zachmurzenie umiarkowane"),
    POCHMURNO("Zachmurzenie wysokie"),
    OPADY("Deszczowo");

    private final String cloudyName;

    public String getCloudyName() {
        return cloudyName;
    }

    Cloudiness(String cloudyName) {
        this.cloudyName = cloudyName;
    }

    public void printDayName() {
        System.out.println(this.cloudyName);
    }
}
