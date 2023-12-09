package LAB5_5;

public class Figura {
    //Dane składowe.
    private String nazwa;
    private String kolor;
    //Konstruktor klasy Figura.
    public Figura(String nazwa, String kolor)
    {
        this.nazwa = nazwa;
        this.kolor = kolor;
    }
    //Gettery i settery
    public String getNazwa()
    {
        return nazwa;
    }
    public String getKolor()
    {
        return kolor;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    //Metoda wyświetlająca info figury.

    //Metoda wyświetlająca info Figury.
    public void wyswietlInfo(){
        System.out.println("Figura: " + nazwa);
        System.out.println("Kolor: " + kolor);

    }
    //Metoda obliczająca pole. Ogólna, implementacja będzie uzależniona od konkretenj figury.
    public double obliczPole()
    {
        return 0.0;
    }
    //Metoda obliczająca obwód. Ogólna, implementacja będzie uzależniona od konkretenj figury.
    public double obliczObwod()
    {
        return 0.0;
    }
}
