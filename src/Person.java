//Klasa Adres
class Adres{

    private String ulica;
    private String miasto;
    private String kraj;

    public Adres(String ulica, String miasto, String kraj)
    {
        this.ulica = ulica;
        this.miasto = miasto;
        this.kraj = kraj;
    }
    public String getAddressInfo(){
        return ulica + " -" + miasto + " - " + kraj;
    }

}

//Klasa Person
public class Person {
    private String imie;
    private  int wiek;
    private  Adres adres;
    public Person(String imie, int wiek, Adres adres)
    {
        this.imie = imie;
        this.wiek= wiek;
        this.adres = adres;
    }
    public String getPersonInfo()
    {
        return "Name: " + imie + ", Age: " + wiek +
                " --> " + "Adres: " + adres.getAddressInfo();
    }

    public static void main (String[] args)
    {

        //Przykład kompozycji -> Person ma Adres
        // Obiekt klasy adres zawarty jest w biekcie klasy Person
        //Jest to relacja typu całość - część
        Adres a1 = new Adres("Fiołkowa","Kraków","Polska");
        Adres a2 = new Adres("Jumanji", "Bylina Dolna", "Kambodża");

        Person p1 = new Person("Old Man", 120,a1);
        Person p2 = new Person("Jancio Wodnik",23, a2);
        System.out.println(p1.getPersonInfo());
        System.out.println(p2.getPersonInfo());
    }

}
