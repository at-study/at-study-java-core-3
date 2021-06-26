package lections.lesson8.industry.cans;

import lections.lesson8.industry.cars.Fillable;
import lections.lesson8.industry.stations.Filler;

public class Can implements Fillable, Filler {

    private int currentLevelInLitres = 0;
    private int maxLevelInLitres = 20;

    @Override
    public void takeFuel() {
        currentLevelInLitres = maxLevelInLitres;
        System.out.println("Канистра заполнена полностью");
    }

    @Override
    public void takeFuel(int litres) {
        currentLevelInLitres += litres;
        currentLevelInLitres = Math.min(currentLevelInLitres, maxLevelInLitres);
        System.out.println("В канистре " + currentLevelInLitres + " литров.");
    }

    @Override
    public void fill(Fillable fillable) {
        fillable.takeFuel(currentLevelInLitres);
        currentLevelInLitres = 0;
    }

    @Override
    public void fill(Fillable fillable, int litres) {
        int fuel = Math.min(litres, currentLevelInLitres);
        fillable.takeFuel(fuel);
        currentLevelInLitres -= fuel;
    }
}
