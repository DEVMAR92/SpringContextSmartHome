package data;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class WeatherStation {

    private double temp;
    private String cloudy;


    public double getTemp() {
        return temp;
    }

    public String getCloudy() {
        return cloudy;
    }

    public WeatherStation() {

        System.out.println("Pobieram dane pogodowe");

        Random random = new Random();

        this.temp = random.nextInt(61) - 25;

        int i = random.nextInt(3);

        switch (i){
            case 0:
                cloudy = Cloudiness.SLONECZNIE.getCloudyName();
                break;
            case 1:
                cloudy = Cloudiness.UMIARKOWANE.getCloudyName();
                break;
            case 2:
                cloudy = Cloudiness.POCHMURNO.getCloudyName();
                break;
            case 3:
                cloudy = Cloudiness.OPADY.getCloudyName();
                break;
        }



    }
}
