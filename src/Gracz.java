//Klasa reprezentująca postać Gracza
class Postac{
    private int polozenieX;
    private int polozenieY;

    public Postac(int polozenieX, int polozenieY)
    {
        this.polozenieX = polozenieX;
        this.polozenieY = polozenieY;
    }

    public void porusz(int noweX, int noweY)
    {
        this.polozenieX = noweX;
        this.polozenieY = noweY;
        System.out.println("Gracz porusza się na pozycję (" + noweX + ", " + noweY + ")");
    }
}
//Klasa reprezentująca Gracza
public class Gracz {

    private  Postac postac;

    public Gracz(Postac postac)
    {
        this.postac = postac;
    }
    public void poruszGraczem(int noweX, int noweY)
    {
        postac.porusz(noweX, noweY);
    }

    public static void main(String[] args)
    {
        //Utworzenie obiektu planszy, postaci i gracza
        Plansza plansza = new Plansza(10,10);
        Postac postacGracza = new Postac(1,1);
        Gracz gracz = new Gracz(postacGracza);
        //Utworzenie obiektu gry, który zawiera planszę i gracza
        Gra mojaGra = new Gra(plansza,gracz);
        //Rozpoczęcie gry. Wyświetlenie info o planszy i graczu.
        mojaGra.rozpocznijGre();

    }


}
//Klasa reprezentująca planszę gry
class Plansza {

    private  int szerokosc;
    private int wysokosc;

    public Plansza(int szerokosc, int wysokosc)
    {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }
    public void wyswietlInformacje(){
        System.out.println("Plansza do gry o wymiarach " + szerokosc + "x" + wysokosc);
    }

}
//Klasa reprezentująca Grę
class Gra{

    private Plansza plansza;
    private Gracz gracz;

    public Gra(Plansza plansza, Gracz gracz)
    {
        this.plansza = plansza;
        this.gracz = gracz;
    }
    public void rozpocznijGre(){
        plansza.wyswietlInformacje();
        gracz.poruszGraczem(2,3);
    }
}


