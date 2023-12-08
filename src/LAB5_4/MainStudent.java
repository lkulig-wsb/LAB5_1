package LAB5_4;

public class MainStudent {
    public static void main(String[] args){
        System.out.println();
        //Utworzenie obiektu klasy Student
        Student s1 = new Student("Dobromir","Pędziwiatr","202110016782");
        //Wyświetlnie danych obiektu za pomocą Getterów.
        System.out.println(s1.getImie()+ " " + s1.getNazwisko() + " - Indeks: " + s1.getNumerIndeksu());
        //Zmiana numeru indeksu za pomocą Settera. Użycie błędnego formatu.
        //Przetestowanie dodatkowej logiki settera.
        //s1.setNumerIndeksu("ASD1234512123");
        //Użycie prawidłowego formatu przy zmianie numeru indeksu.
        s1.setNumerIndeksu("66771223");
        //Wyświetlnie danych obiektu po zmianie.
        System.out.println(s1.getImie()+ " " + s1.getNazwisko() + " - Indeks: " + s1.getNumerIndeksu());

    }

}
