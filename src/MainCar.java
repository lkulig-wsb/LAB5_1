//Klasa bazowa.
class Vehicle{
//Dane skladowe klasy Vehicle.
private String color;
private int speed;
private String size;
private String engine;

//Konstruktor klasy Vehicle.
    public Vehicle(String color, int speed, String size, String engine)
    {
        this.color = color;
        this.speed = speed;
        this.size = size;
        this.engine = engine;
    }
    //Metoda wyświetlająca dane o pojeździe.
    public void dispVehicle(){
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Size: " + size);
        System.out.println("Engine: " + engine);
    }

}
//Klasa pochodna, dziedzicząca po klasie Vehicle.
class Car extends Vehicle{

    //Dane składowe klasy Car.
    private String model;
    private int seats;

    //Konstruktor klasy Car, który wywołuje konstruktor klasy bazowej (Vehicle).
    //Wywołanie konstruktora klasy bazowej za pomocą słowa kluczowego super.
    public Car(String color, int speed, String size, String engine, String model, int seats){

        super(color,speed, size, engine);
        this.model = model;
        this.seats = seats;

    }
    //Metoda wyświetlająca informacje o Samochodzie.
    public void dispCar(){
        super.dispVehicle(); //wywołanie metody z klasy bazowej (Vehicle).
        System.out.println("Model: " + model);
        System.out.println("Seats: " +seats);
    }
}



public class MainCar {

    public static void main(String[] args){

        System.out.println("VEHICLE: ");
        System.out.println("----------");
        //Utworzenie obiektu klasy Vehicle.
    Vehicle v1 = new Vehicle("Red",240,"Large","Petrol");
    //Wywołanie metody wyświetlającej dane pojazdu.
    v1.dispVehicle();
        System.out.println("\nCAR:");
        System.out.println("------");
        //Utworzenie obiektu klasy Car.
    Car c1 = new Car("Blue", 320,"Medium", "Diesel","Golf 5",5);
    //Wywołanie metody wyświetlającej dane Samochodu.
    c1.dispCar();

    }




}
