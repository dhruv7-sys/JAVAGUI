// this is basics of oops - i.e classes ,  objects , constructors, "this" Keyword , types of constructors.

class Pen {
    String Color;
    String type; //ballpoint or gelpoint pen

    //it is a function which the pen will perform 
    public void write(){
        System.out.println("Writuing something");
    }
    public void printColor(){
        //"this" keyword.
        System.out.println(this.Color);
        System.out.println(this.type);
    }

}

class Student{
    String name;
    int age;


    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // this is a non - paramerized constructor (type 1 constructor)
    Student(){
        System.out.println("constructor called");
    }
    //this is parameteriezed constructor (type 2 constrctor)
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
    //this is copy constructor - type 3
    //Student(){}
}

public class classobjects  {
    //string of argument - it a main fucntion 
    public static void main(String[] args) {

        //Creating object pen
        Pen pen1 = new Pen();
        pen1.Color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.Color = "black";
        pen2.type = "ballpoint";
        pen1.printColor();
        pen2.printColor();
        //constrctor type  -  1 
        // constructors name should be same as their class name , they do not return anything , only one time they can be called only only when an object is called
        Student s1 = new Student(); // this "Student();"" is known as constructor. 
        s1.name = "dhruv";
        s1.age = 24;
        s1.printInfo();

        //Constrctor type - 2
        Student s2 = new Student("dhruv" , 20);
        s2.printInfo();

        //constructor type - 3 = copy constructor
        //Student s3 = new Student(s1);
        //s3.printInfo();
    }
}
// Some points to note - 
// Java has a grabage collector in it which eats or consume extra memory which is not in use
// also just like constructors we haver destrctors , but destructors in java is automatic as we do not need to write destructor in it.
// java mein destrcutors nhi likhte coz isme garbage collector hota h .

