package data;

import org.springframework.stereotype.Component;

@Component

public class RollerBlindController {

    WeatherStation weatherStation;

    public RollerBlindController(WeatherStation weatherStation) {

        this.weatherStation = weatherStation;

        if (this.weatherStation.getCloudy().equals(Cloudiness.SLONECZNIE.getCloudyName())) {
            System.out.println("Jest " + Cloudiness.SLONECZNIE.getCloudyName() + ". Zasłaniam rolety");
        } else if (this.weatherStation.getCloudy().equals(Cloudiness.UMIARKOWANE.getCloudyName())) {
            System.out.println("Jest " + Cloudiness.UMIARKOWANE.getCloudyName() + ". Zasłaniam rolety do 1/3");
        } else {
            System.out.println("Jest " + this.weatherStation.getCloudy() + ". Nie zasłaniam rolet");
        }
    }
}
