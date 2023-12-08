class Animal{
    public void dajGlos()
    {
        System.out.println("Dźwięk zwierzecia...");
    }
}

class Dog extends Animal{
    public void szczekaj()
    {
        System.out.println("Hau hau!");
    }
}
public class RzutowanieWGore {
    public static void main(String[] args){

     //Rzutowanie w górę (upcasting): Pies jest również zwierzęciem.
        //Występuje gdy obiekt klasy jest przypisany do referencji ogólniejszego typu (np. rodzic)
        Animal animal = new Dog();
        animal.dajGlos();
        //Nie wywołamy metody szczekaj(), ponieważ referencja jest typu zwiererze.
        //animal.szczekaj(); // będzie błąd kompilacji

        //Rzutowanie w dół (downcasting) do odzyskania oryginalengo typu.
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.szczekaj();
        }
    }
}
