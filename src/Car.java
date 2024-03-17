public class Car {
    private   String name;
    private   int year;
    private   String fuel;
    private   String color;

    Car(String name  , int year, String fuel, String color) {
        this.name = name;
        this.year = year;
        this.fuel = fuel;
        this.color = color;
    }

    public String InfoCar() {
        return   " Nazwa Samochodu to " + this.name
                + "rok produkcji " + this.year
                + " rodzaj paliwa to " + this.fuel +
                " kolor samochodu to " + this.color ;
    }
}
