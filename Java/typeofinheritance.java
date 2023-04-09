import java.nio.file.PathMatcher;
import javax.sound.sampled.SourceDataLine;
import packagesinjava; // importing all public things of packge "packagesinjava"


class shape{
    private void area() {
        System.out.println("displays area");
    }
}
// this is single - level inheritance
class Triangle extends Shape{
    public void area(int l , int h) {
        System.out.println(1/2*l*h);
    }
}
// this is multiple level inheritance  - when we have more than 2 child class
class Equilateraltriangle extends Shape{
    public void area(int l , int h) {
        System.out.println(1/2*l*h);
    }
}

// this is called hiearchial inheritance .
// 4th type - is called as hybrid inheritance.
// 5th type is multiple inheritance = we use interface to implement this type of inheritance.
class circle extends Shape{
    public void area(int r) {
        System.out.println(3.14 *r*r);
    }
}
public class typeofinheritance {
    public static void main(String[] args) {
        packagesinjava.Account account1 = new packagesinjava.Account();
        account1.name = "Customer";
    }
}


