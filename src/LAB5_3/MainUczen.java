package LAB5_3;

import javax.sound.midi.Soundbank;

public class MainUczen {

    public static void main(String[] args){

        System.out.println("BAZA UCZNIÓW");
        System.out.println("-------------");

        //Utworzenie obiektów klasy uczeń;
        Uczen u1 = new Uczen("Jan","Kowalski");

        //Dodanie oceny
        u1.dodajOcene(4.5);
        u1.dodajOcene(3.5);
        u1.dodajOcene(4.0);

        System.out.println();
        u1.wyswietlInfoUczen();
        System.out.println();
        u1.dodajOcene(5.5);
        u1.dodajOcene(5.5);
        u1.dodajOcene(5.5);
        System.out.println();
        u1.wyswietlInfoUczen();
        System.out.println();
        //Wyświetlenie wszystkich ocen obiektu u1
        System.out.println("Oceny u1: " + u1.getOceny());
    }
}
