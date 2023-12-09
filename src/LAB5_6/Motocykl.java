package LAB5_6;
//Klasa dziedzicząca po klasie Pojazd
public class Motocykl extends Pojazd{
    //Dane składowe klasy Motocykl.
    private String typNapedu;
    private double pojemnoscSilnika;
    //Konstruktor klasy Motocykl.
    public Motocykl(String marka,int rokProdukcji, String typNapedu, double pojemnoscSilnika)
    {
        super(marka, rokProdukcji);
        this.typNapedu = typNapedu;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }
    //Gettery i settery
    public String getTypNapedu() {
        return typNapedu;
    }
    public double getPojemnoscSilnika()
    {
        return pojemnoscSilnika;
    }
    @Override
    public String getMarka() {
        return super.getMarka();
    }
    @Override
    public int getRokProdukcji() {
        return super.getRokProdukcji();
    }
    public void setTypNapedu(String typNapedu) {
        this.typNapedu = typNapedu;
    }
    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
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
