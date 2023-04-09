
//abstract means a concept which can be created but can't be used!!
abstract class Animal{
    //this is abstract
    abstract void walk();
    //we can also make a constrctor in abstract class
    Animal(){
        System.out.println("new animal");
    }
    //this is non-abstract
    public void eat(){
        System.out.println("animal eats");
    }
}

class Horse extends Animal{
    //constractor can be called as well in a abstraction class
    Horse(){
        System.out.println("creates a Horse");
    }
    public void walk(){
        System.out.println("4 legs");
    }
}

class chicken extends Animal{
    public void walk(){
        System.out.println("2 legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        //we can't create this object "animal" coz animal is an abstarct which is basically a concept not a reality
        // this error is called run-time error which only be determined at the output time
        //Animal animal = new Animal();
        //animal.walk();
        horse.eat();
    }
}
//base constructor is called and then derived constructor is called , this is called as "constrctor chaining"