//Klasa bazowa reprezentująca ogólną postać w grze
class Postac1{
    //Dane składowe klasy Postac1.
    private String imie;
    private int poziom;
    private int punktyZycia;
    //Konstruktor klasy Postac1.
    public Postac1(String imie, int poziom, int punktyZycia){
        this.imie = imie;
        this.poziom = poziom;
        this.punktyZycia = punktyZycia;
    }
    //Metoda klasy Postac1.
    public void atak(){
        System.out.println("Postać atakuje!");
    }
    //Kolejna metoda klasy Postac1.
    public void otrzymajObrazenia(int obrazenia){
        punktyZycia-=obrazenia;
        System.out.println("Postać otrzymuje obrażenia!");
        System.out.println("Pozostało " + punktyZycia + " punktów życia!");
    }
}
//Klasa dziedzicząca po klasie Postać
class Bohater extends Postac1{
    //Dane składowe klasy Bohater.
    private String umiejetnosc;

    //Konstruktor klasy Bohater.
    public Bohater(String imie,int poziom, int punktyZycia, String umiejetnosc){
        super(imie, poziom, punktyZycia);//Wywołanie konstruktora z klasy nadrzędnej (Postac).
        this.umiejetnosc = umiejetnosc;
    }
    //Metoda dla klasy Bohater
    public void uzyjUmiejetnosci(){
        System.out.println("Bohter używa " + umiejetnosc);
    }
}

public class ExampleDziedziczeniaRPG {

    public static void main(String[] args){
        //Utworzenie obiektu klasy Bohater
        Bohater b1 = new Bohater("Bilbo", 12, 25,"Niewidzialność");
        //Wywołanie metody dziedziczonej po klasie postać
        b1.atak();
        //Wywołanie metody specyficznej dla klasy postać
        b1.uzyjUmiejetnosci();
        //Wywołanie metody dziedziczonej po klasie Postać
        b1.otrzymajObrazenia(4);
    }
}
