package LAB5_5;

public class Kwadrat extends Figura{
    private double bok;

    //Konstruktor.
    public Kwadrat(String nazwa, String kolor, double bok)
    {
        super(nazwa, kolor);
        this.bok=bok;
    }
    //Przesłaniamy metodę do wyświetlenia danych kwadratu.
    @Override
    public void wyswietlInfo(){
        super.wyswietlInfo();
        System.out.println("Bok: " + bok);
        System.out.println("Pole kwadratu: " + obliczPole());
        System.out.println("Obwód kwadratu:  " + obliczObwod());
    }
    //Przesłaniamy metodę do obliczenia pola kwadratu.
    @Override
    public double obliczPole() {
        return bok * bok;
    }
    //Przesłaniamy metodę do obliczenia obwodu kwadratu.
    @Override
    public double obliczObwod() {
        return 4 * bok;
    }
}
