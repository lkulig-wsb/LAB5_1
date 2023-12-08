package LAB5_5;
public class FMain {
    public static void main(String[] args){
        //Testowanie obiektów klas. Wyświetlanie ich danych. Implementacja metod.
        Figura f1 = new Figura("Trapez","Zielony");
        //System.out.println(f1.getNazwa()+" "+f1.getKolor());
        f1.wyswietlInfo();
        System.out.println();
        Kwadrat k1 = new Kwadrat("Kwadrat1","Czerwony", 5.0);
        k1.wyswietlInfo();
        System.out.println();
        Koło ko1 = new Koło("Koło1","Niebieski",7.0);
        ko1.wyswietlInfo();

        //Test implementacji metod obliczania pola i obwodu dannej figury
        System.out.println("--------------------------------------------");
        Figura f2 = new Figura("Figura","biała");
        f2.obliczPole();
        System.out.println("Obwód figura: " + f2.obliczObwod());
        System.out.println("Pole figura: " + f2.obliczPole());
        System.out.println();
        Kwadrat k2 = new Kwadrat("Kwadrat2","Różowy", 12.5);
        System.out.println("Obwód Kwadrat2: " + k2.obliczObwod());
        System.out.println("Pole Kwadrat2: " + k2.obliczPole());
        System.out.println();
        Koło ko2 = new Koło("Koło2","Pomarańczowe", 3.0);
        System.out.println("Obwód Koło2: " + ko2.obliczObwod());
        System.out.println("Pole Koło2: " + ko2.obliczPole());
    }
}
