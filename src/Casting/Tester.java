package Casting;

public class Tester {
    public static void main(String[] args) {
        //********************** UPCASTING ************************//
        Animal a = new Dog();
        // here we are creating a dog object and casting it to animal (parent class)
        // All upcasting is valid in java
        // Only animal methods are valid for animal object
        a.makeNoise();
        doAnimalStuff(a);
        Dog d = new Dog();
        doAnimalStuff(d); // upcasting

        //******************************DownCasting******************//
        Dog dr = new Dog();
        ddoAnimalStuff(dr);
        Animal an = new Animal();
        ddoAnimalStuff(an);

    }


    //upcasting
    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        //animal.growl() cannot be called

    }
    //down-casting
    public static void ddoAnimalStuff(Animal animal){
        animal.makeNoise();
        if (animal instanceof Dog){
            Dog d = (Dog)animal;
            d.growl();

        }


    }

}
