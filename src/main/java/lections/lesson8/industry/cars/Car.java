package lections.lesson8.industry.cars;

public abstract class Car implements Fillable {

    protected int currentFuelInLitres;
    protected int maxFuelInLitres;

    public Car(int currentFuelInLitres, int maxFuelInLitres) {
        this.currentFuelInLitres = currentFuelInLitres;
        this.maxFuelInLitres = maxFuelInLitres;
    }

    @Override
    public void takeFuel() {
        currentFuelInLitres = maxFuelInLitres;
        System.out.println("Автомобиль полностью заправлен");
    }

    @Override
    public void takeFuel(int litres) {
        currentFuelInLitres += litres;
        if (currentFuelInLitres >= maxFuelInLitres) {
            takeFuel();
        } else {
            System.out.println("В автомобиль заправлено " + litres + " литров топлива. Текущее количество: " + currentFuelInLitres);
        }
    }
}
