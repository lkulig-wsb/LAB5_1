public class Product {
    //Dane składowe
    private String nazwa;
    private double cena;
    //Gettery - pobierają wartości z pól w klasie.
    public String getNazwa(){
        return nazwa;
    }
    public double getCena(){
        return cena;
    }
    //Settery - ustawiają wartości dla pól w klasie.
    public void setNazwa(String nazwa)
    {
        this.nazwa = nazwa;
    }
    public void setCena(double cena)
    {
        if(cena > 0)
        {
            this.cena = cena;
        }else{
            System.out.println("Cena nie może być ujemna!");
        }
    }

    public static void main(String[] args)
    {

        //Utworzenie obiektów klasy Produkt
        Product produkt1 = new Product();
        Product produkt2 = new Product();

        //Ustawienie nazwy i ceny za pomocą settera
        produkt1.setNazwa("Dysk SSD 500GB");
        produkt1.setCena(205);
        produkt2.setNazwa("Logitech M185");
        produkt2.setCena(64.90);
        //Pobranie nazwy i ceny za pomocą gettera i wyświetlenie ich
        System.out.println(produkt1.getNazwa() + "\t" + produkt1.getCena() + " PLN");
        System.out.println(produkt2.getNazwa() + "\t" + produkt2.getCena() + " PLN");



    }

}
