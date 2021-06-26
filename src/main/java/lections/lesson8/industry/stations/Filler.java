package lections.lesson8.industry.stations;

import lections.lesson8.industry.cars.Fillable;

public interface Filler {

    void fill(Fillable fillable);

    void fill(Fillable fillable, int litres);

}
