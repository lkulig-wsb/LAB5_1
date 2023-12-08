package LAB5_3;

import java.util.ArrayList;

public class Uczen {

    private String imie;
    private String nazwisko;
    private ArrayList<Double> oceny;

    public Uczen(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>();
    }
    //Metoda dodawania oceny.
    public void dodajOcene(double ocena){
        if(ocena>=1.0 && ocena <=5.5){
            oceny.add(ocena);
            System.out.println("Dodano ocenę " + ocena);
        }else{
            System.out.println("Nieprawidłowy format oceny. Ocena powinna być w zakresie od 1.0 do 5.5!");
        }
    }
    //Metoda do obliczania średniej ocen
    public double obliczSredniaOceny(){
        if(oceny.isEmpty()){
            return 0.0;
        }
        double suma = 0;
        for(double ocena : oceny){
            suma+=ocena;
        }
        return suma/oceny.size();
    }
    //Metoda wyświetlająca info o uczniu
    public void wyswietlInfoUczen(){
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Średnia ocen: " + obliczSredniaOceny());

    }
    //Gettery i Settery
    public String getImie(){
        return imie;
    }
    public  String getNazwisko(){
        return  nazwisko;
    }
    public ArrayList<Double> getOceny(){
        return oceny;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }


}
