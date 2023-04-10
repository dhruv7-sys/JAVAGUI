package exceptionhandling;

public class main {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        try {
            divide(a,b);
            String name = "dhruv";
            if(name.equals("dhruv")){
                throw new myexception("my name is dhruv")
            }

        }catch (myexception e){
            System.out.println(e.getMessage());
        }catch (ArithemeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("normal exception");
        }finally {
            System.out.println("this will always execute");
        }
    }

    static int divide(int a , int b) throws ArithemeticException{
        if (b == 0){
            throw new ArithmeticException("do not divide by 0");
        }
        return a / b ;
    }
}
