interface Animal{
    int eyes = 2;
    //here public can be written or u if don't want to write don't write , it doesnt matter 
    public void walk();
}

interface Herbivore{

}
//this is called multiple inheritance where both animal and herbiovore are implemented .
class Horse implements Animal , Herbivore{
    //here this public needs to be written as its important to write public here.
    public void walk(){
        System.out.println("4legs");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
