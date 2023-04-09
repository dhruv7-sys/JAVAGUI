//this module is about inheritance 

class Shape{
    String color;

}

//this extends takes all properties of class "Shape"!
class Triangle extends Shape{

}

public class inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
