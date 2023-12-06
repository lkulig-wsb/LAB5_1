public class KontoBankowe {

    //Prywatne pole, dostępne tylko wewnątrz klasy KontoBankowe.
    private double saldo;



    //Publiczny getter do uzyskiwania wartości salda.
    public double getSaldo()
    {
        return saldo;
    }
    //Publiczna metoda do wpłacania środków, zmieniająca saldo w kontrolowany sposób.
    public void wplac(double kwota)
    {
        if(kwota>0){

            saldo+=kwota;
        }
    }
    //Publiczna metoda do wypłacania środków, zmnieniająca saldo w kontrolowany sposób.
    public void wyplac(double kwota)
    {
        if(kwota>0 && kwota <= saldo)
        {
            saldo-=kwota;
        }else {
            System.out.println("Nie masz wystarczających środków żeby wypłacić taką kwotę!");
        }
    }
    public static void main(String[] args){

        System.out.println("\nKontoBankowe");
        System.out.println("--------------");
        KontoBankowe kb1 = new KontoBankowe();
        kb1.wplac(6890);
        System.out.println("Aktualne saldo: "+ kb1.getSaldo());
        kb1.wyplac(2500);
        System.out.println("Aktualne saldo: "+ kb1.getSaldo());
        kb1.wyplac(8000);
        System.out.println("Aktualne saldo: "+ kb1.getSaldo());
        kb1.wplac(10000);
        System.out.println("Aktualne saldo: "+ kb1.getSaldo());
        kb1.wyplac(14000);
        System.out.println("Aktualne saldo: "+ kb1.getSaldo());




    }

}
