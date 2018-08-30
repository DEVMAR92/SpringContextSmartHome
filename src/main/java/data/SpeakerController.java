package data;

import org.springframework.stereotype.Component;

@Component
public class SpeakerController {


    WeatherStation weatherStation;

    public SpeakerController(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        System.out.println("Dzień dobry. Dzisiejsza temperatura " + weatherStation.getTemp() + "\u00B0C i jest "
                + weatherStation.getCloudy() + ". To będzie wspaniały dzień");
    }
}
