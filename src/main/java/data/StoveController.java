package data;

import org.springframework.stereotype.Component;

@Component
public class StoveController {

    WeatherStation weatherStation;

    public StoveController(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        if (this.weatherStation.getTemp() < 15) {
            System.out.println("Jezs zimno. Uruchamiam piec.");
        } else {
            System.out.println("Jest ciepło. Nie uruchamiam pieca.");
        }
    }
}
