package LAB5_6;

public class MainPojazd {

    public static void main(String[] args)
    {

        System.out.println("Wyswitlenie obiektów poszczególnych klas.");
        System.out.println("-----------------------------------------");
        //Utworzenie obiektów poszczególnych klas i wyświetlenie ich wartości za pomocą getterów (metod dostępowych).
        Pojazd p1 = new Pojazd("Osobowy",1997);
        System.out.println("Marka: " + p1.getMarka() + ", Rok produkcji: " +  p1.getRokProdukcji());

        Samochod s1 = new Samochod("Ford",2011,5,"Diesel");
        System.out.println("Marka: " + s1.getMarka() + ", Rok produkcji: " +  s1.getRokProdukcji() +
                ", Liczba drzwi: " + s1.getLiczbaDrzwi() + ", Typ silnika: " + s1.getTypSilnika());

        Motocykl m1 = new Motocykl("Harley-Davidson",2023,"Łańcuch",1977.0);
        System.out.println("Marka: " + m1.getMarka() + ", Rok produkcji: " + m1.getRokProdukcji() +
                ", Typ Napędu: " + m1.getTypNapedu() + ", Pojemność silnika: " + m1.getPojemnoscSilnika());

        //Rzutowanie
        System.out.println("\nRzutowanie między obiektami.");
        System.out.println("----------------------------");
        //Rzutowanie samochodu na Pojazd (upcasting)
        Pojazd pojazdZSamochodu = s1;
        //Wyświetlenie info o pojeździe po rzutowaniu.
        System.out.println("Po rzutowaniu samochodu na pojazd:");
        System.out.println("Marka: " + pojazdZSamochodu.getMarka() + ", Rok produkcji: " +
                pojazdZSamochodu.getRokProdukcji());
        //Rzutowanie motocykla na pojazd (upcasting)
        Pojazd pojazdZMotocykla = m1;
        //Wyświetlenie info o pojeździe po rzutowaniu.
        System.out.println("Po rzutowaniu motocykla na pojazd:");
        System.out.println("Marka: " + pojazdZMotocykla.getMarka() + ", Rok produkcji: " +
                pojazdZMotocykla.getRokProdukcji()) ;
        System.out.println("*********************************************");
        //Weryfikacja dostępu do pól i metod charakterystycznych dla motocykla.
        if(pojazdZMotocykla instanceof Motocykl){
            Motocykl rzutowanyMotocykl = (Motocykl) pojazdZMotocykla; // downcasting
            System.out.println("Typ Napędu: " + rzutowanyMotocykl.getTypNapedu() +
            ",Pojemność silnika: " + rzutowanyMotocykl.getPojemnoscSilnika());
        }else{
            System.out.println("Nie udało zrobić się rzutowania na Motocykl!!!");
        }
        //////////////////////////////////////////////////////////////////////////

        //Rzutowanie pojazdu na samochód.
        Samochod samochodZPojazdu = (Samochod) p1;
        //Weryfikacja czy możemy uzyskać dostęp do pól i metod właściwych dla samochodu.
        if(samochodZPojazdu != null){
            System.out.println("\nPo rzutowaniu pojazdu na samochód:");
            System.out.println("Marka: " + samochodZPojazdu.getMarka() + ", Rok produkcji: "+
                    samochodZPojazdu.getRokProdukcji() + ", Liczba drzwi: "+ samochodZPojazdu.getLiczbaDrzwi() +
                    ", Typ silnika: " + samochodZPojazdu.getTypSilnika());
        }else{
            System.out.println("Rzutowanie Pojazdu na Samochód nieudane!!!");
        }

    }
}
