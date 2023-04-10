// this modeule is basics of oops - classes  , objects and constructors.

package introduction;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //q1 store 5 roll nos.
        int[] numbers = new int[5];

        //q2 crete datasturcture that stores 5 name
        String[] names = new String[5];

        //q3 - data of 5 students - rollno. name and marks
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] s1 = new Student[5];
        //declareing the object **(important)**
        Student dhruv = new Student();
        //Student dhruv = new student(rno:25 , name:"dhruvv" , marks:67.90f);

        dhruv.marks = 65.8f;
        dhruv.rno = 5;
        dhruv.name = "dhruvgupta";

        //defining method "public void greeting for this"
        dhruv.greeting();
        dhruv.changename("baby");

        //this is for 3rd constructor jo h "other"!!
        Student random = new Student();
        System.out.println(random.name);

        //this is for 4th constructor
        Student s2 = new Student();
        System.out.println(s2.name);

        //only these lines will get printed
        System.out.println(dhruv);
        System.out.println(dhruv.rno);
        System.out.println(dhruv.name);
        System.out.println(dhruv.marks);
        
        

    }
}
//create a class
class Student{
    int rno;
    String name;
    float marks = 80;
    String greeting;

    //constructor is a fucntions basdically
    //and using "this keyword" in the constrctor
    Student(){
        this.marks = 65.8f;
        this.rno = 9;
        this.name = "dhruvgupta";
        this.greeting = "hello";

    }

    //the below method is called constructor overloading.
    //type 2 constructoer - in which we insert things in the constructor student.
    Student(int roll , String naam , float marks){
        this.marks = 65.9f;
        this.rno = roll; 
        this.name = naam;
        this.greeting = "hello";

    }

    //making a construct which takes value from other object.
    Student(Student other){

        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;

    }

    //this is a constructor calling other constructor
    //
    Student(){
        this();
    }

    public void changename(String newName) {
        name = newName;
    }

    public void greeting() {
        System.out.println("Hello evryone ");
    }

    
}