class Account{
    //type 1 0f access modifiers is "public"
    //if i remove public from this it will become default access modifier
    public String name;
    protected String email;
    //4th type - is called private ,no other class nor any package can use this private method ,the accessmodifiers class can't access it 
    //private classess can only be accessd via getters and setters method.
    private String password;

    //Getters
    public String getPassword(){
        return this.password;
    }
    //setters
    public void setPassword(String pass){
        this.password = pass;
    }
}


public class accessmodifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Dhruv ka bank";
        account1.email = "dhruvg636@gmail.com";
        account1.setPassword("dhruv1122");
        System.out.println(account1.getPassword());

    }
}
// 2nd type is known as "default"
// 3rd type is called "protected" - it can access sub-classes of other package.


// encapculation = data + fucntion when combimed is called encapsulation
// in other words making classes and objects is called encapsulations

//Data Hiding - is basically implemented using access modifies(private , public , protected)
//abstraction - show important thing to users , and hide unimportant thingd to the users.
