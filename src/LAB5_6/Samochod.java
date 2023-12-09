package LAB5_6;
//Klasa dziedzicząca po klasie Pojazd.
public class Samochod extends Pojazd{
    //Dane składowe klasy samochód
    private int liczbaDrzwi;
    private String typSilnika;
    //Konstruktor klays Samochod
    public Samochod(String marka, int rokProdukcji, int liczbaDrzwi, String typSilnika)
    {
        super(marka,rokProdukcji);
        this.liczbaDrzwi = liczbaDrzwi;
        this.typSilnika = typSilnika;
    }
    //Gettery i settery klasy samochód.

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
    @Override
    public String getMarka() {
        return super.getMarka();
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
