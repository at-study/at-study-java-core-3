package lections.lesson8.industry.stations;

import lections.lesson8.industry.cars.Fillable;

public class GasStation implements Filler {

    @Override
    public void fill(Fillable fillable) {
        fillable.takeFuel();
    }

    @Override
    public void fill(Fillable fillable, int litres) {
        fillable.takeFuel(litres);
    }
}
