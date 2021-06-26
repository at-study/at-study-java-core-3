package lections.lesson8.industry.application;

import lections.lesson8.industry.cans.Can;
import lections.lesson8.industry.cars.Fillable;
import lections.lesson8.industry.cars.Mercedes;
import lections.lesson8.industry.stations.Filler;
import lections.lesson8.industry.stations.GasStation;

public class Application {

    public static void main(String[] args) {
        Fillable mercedes = new Mercedes();
        Filler station = new GasStation();
        Can can = new Can();

        station.fill(can, 15);
        can.fill(mercedes, 10);

    }
}
