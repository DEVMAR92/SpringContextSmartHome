package data;

import org.springframework.stereotype.Component;

@Component
public class SmartHome {

    SpeakerController speakerController;
    RollerBlindController rollerBlindController;
    StoveController stoveController;

    public SmartHome(SpeakerController speakerController, RollerBlindController rollerBlindController, StoveController stoveController) {
        this.speakerController = speakerController;
        this.rollerBlindController = rollerBlindController;
        this.stoveController = stoveController;

    }
}
