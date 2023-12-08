package LAB5_2;

import java.util.Scanner;

public class Osoba {

    //Dane składowe.
    private String imie;
    private String nazwisko;
    private  int wiek;

    //Gettery i settery
    public String getImie()
    {
        return imie;
    }
    public  String getNazwisko()
    {
        return nazwisko;
    }
    public int getWiek()
    {
        return wiek;
    }

    public void setImie(String imie){
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public void setWiek(int wiek){
        this.wiek = wiek;
    }
    //Metoda służąca do wyświetlania danych osoby
    public void wyswietlInfo(){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
    }
    //Metoda służąca do wprowadzania danych Osoby
    public void wprowadzDane(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    //Inna metoda wprowadzająca dane.
    public void wprowadzDaneScanner()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        this.imie = scanner.nextLine();
        System.out.println("Wprowadź nazwisko:");
        this.nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        this.wiek = scanner.nextInt();
    }

    public static void main(String[] args){

        //Utworzenie obiektu klasy Osoba
        Osoba o1 = new Osoba();
        Osoba o2 = new Osoba();
        //Użycie metody wprowadzDane do wprowadzania danych.
        o1.wprowadzDane("Jan","Kowalski",23);
        o2.wprowadzDane("Borys", "Klimczak", 43);
        //Użycie metody wyświetlającej dane oiektu.
        o1.wyswietlInfo();
        System.out.println();
        o2.wyswietlInfo();
        System.out.println();
        //Uzyskanie danych za pomocą getterów.
        System.out.println(o1.getImie() + " " +o1.getNazwisko() + " - "+ o1.getWiek() );
        //Zmiana danych za pomocą setterów
        o1.setImie("Józef");
        o1.setNazwisko("Kaczkowski");
        //Sprawdzenie zmienionych danych dla obiektu o1.
        System.out.println(o1.getImie() + " " +o1.getNazwisko() + " - "+ o1.getWiek() );
        //Przetestowanie metody wprowadzDaneScanner().
        System.out.println("\nINNA METODA WPROWADZANIA DANYCH");
        System.out.println("--------------------------------");
        Osoba o3 = new Osoba();
        o3.wprowadzDaneScanner();
        //Wyświetlenie danych obiektu o3.
        o3.wyswietlInfo();





    }

}
