package LAB5_4;

public class Student {
    //Dane składowe z prywatnymi modyfikatorami dostępu.
    private String imie;
    private String nazwisko;
    private String numerIndeksu;

    //Konstruktor klasy Student.
    public Student(String imie, String nazwisko, String numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
    }

    //Getter dla imienia.
    public String getImie() {
        return imie;
    }

    //Getter dla nazwiska.
    public String getNazwisko() {
        return nazwisko;
    }

    //Getter dla numeru indeksu.
    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    //Setter dla imienia.
    public void setImie(String imie) {
        this.imie = imie;
    }

    //Setter dla nazwiska.
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    //Setter dla numeru indeksu który zawiera dodatkową logikę.Sprawdza czy numer indeksu składa się
    //z samych cyfr. Wykorzystanie w warunku metody matches, która służy w javie do porównywania ciągu znaków.
    //Wyrażenie regularne "\\d+" oznacza że sprawdzamy czy ciąg znaków zawiera jedną czy wiele cyfry od 0 do 9.


    public void setNumerIndeksu(String numerIndeksu) {
        if (numerIndeksu.matches("\\d+")) {
            this.numerIndeksu = numerIndeksu;
        } else {
            System.out.println("Błędny format! Numer indeksu powinien składać się z samych cyfr!");
        }
    }
}