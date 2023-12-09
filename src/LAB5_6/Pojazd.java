package LAB5_6;
//KlASA BAZOWA
public class Pojazd {

    //Dane składowe klasy Pojazd.
    private String marka;
    private int rokProdukcji;
    //Konstruktor klasy Pojazd.
    public Pojazd(String marka, int rokProdukcji)
    {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }
    //Gettery i settery klasy Pojazd.
    public String getMarka()
    {
        return marka;
    }
    public int getRokProdukcji()
    {
        return rokProdukcji;
    }
    public void setMarka(String marka){
        this.marka = marka;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
}
