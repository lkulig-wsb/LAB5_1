package LAB5_6;
//Klasa dziedzicząca po klasie Pojazd.
public class Samochod extends Pojazd{
    //Dane składowe klasy Samochód.
    private int liczbaDrzwi;
    private String typSilnika;
    //Konstruktor klasy Samochod.
    public Samochod(String marka, int rokProdukcji, int liczbaDrzwi, String typSilnika)
    {
        super(marka,rokProdukcji);
        this.liczbaDrzwi = liczbaDrzwi;
        this.typSilnika = typSilnika;
    }
    //Gettery i settery klasy Samochód.

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public String getTypSilnika() {
        return typSilnika;
    }
    @Override
    public int getRokProdukcji() {
        return super.getRokProdukcji();
    }
    //@Override oznacza że następująca metoda (w klasie dziedziczącej) ma zastąpić metodę o tej samej nazwie w
    //klasie nadrzędnej.
    @Override
    public String getMarka() {
        return super.getMarka();// super jest użyte żeby odnieść się do klasy bazowej (wywołanie metody z klasy bazowej)
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public void setTypSilnika(String typSilnika) {
        this.typSilnika = typSilnika;
    }

    @Override
    public void setMarka(String marka) {
        super.setMarka(marka);
    }

    @Override
    public void setRokProdukcji(int rokProdukcji) {
        super.setRokProdukcji(rokProdukcji);
    }
}
