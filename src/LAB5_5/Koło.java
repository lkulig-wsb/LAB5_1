package LAB5_5;

//Klasa Koło dziedziczy po klasie Figura.
public class Koło extends Figura {
    //Dane składowe.
    private double promien;
    //Konstruktor klasy Koło.
    public Koło(String nazwa, String kolor, double promien){
        super(nazwa, kolor);
        this.promien = promien;
    }
    //Przesłaniamy metodę do wyświetlenia danych koła.
    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Promień: " + promien);
        System.out.println("Pole koła: " + obliczPole());
        System.out.println("Obwód koła: " + obliczObwod());
    }
    //Przesłaniamy metodę do obliczenia pola koła.
    @Override
    public double obliczPole() {
        return Math.PI * promien * promien;
    }
    //Przesłaniamy metodę do obliczenia obwodu koła.
    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}
