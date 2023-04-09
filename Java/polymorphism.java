// THIS MODULE IS ABOUT POLYMORPHISM  - which is known as poly for many !!
// 2 TYPES - "FUCNTION OVERLOADING" AND "FUCNTION OVERRIDING" 
//type -1 = compile tiem polymorphism = fucntion overloading
//typw -2 - run-time polymorphism = fucntion overriding.

class Student{
    String name;
    int age;
    //so bascically calling this "public void printInfo" again and again in diffrent ways is polymorphism

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name , int age){
        System.out.println(name + " " + age);
    }
    
}


public class polymorphism  { 
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "dhruv";
        s1.age = 20;
        s1.printInfo( s1.name , s1.age);

    }
}