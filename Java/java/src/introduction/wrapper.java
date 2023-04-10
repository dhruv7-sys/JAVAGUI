package introduction;

public class wrapper {
    public static void main(String[] args) {
        //wap to swap 2 numbers?
        Integer a = 2;
        Integer b = 5;
        swap(a,b);
        System.out.println(a + " " +b);
    }
    static void swap(Integer a , Integer b){
        int temp = a;
        a=b;
        b=temp;
    } 
}

class A{
    final int num = 10;
    String name;

    A(String name){
        this.name = name;
    }
}
