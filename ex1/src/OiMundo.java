public class OiMundo {
    private HelloWorld User;

    public OiMundo(){
        this.User = new HelloWorld();
    }

    int a = 5;
    int b = 10;
    int sum = a + b;

    public void Oi(){
        System.out.println("Your math result is: " + sum + ", " + User.getUserName());
    }
}
