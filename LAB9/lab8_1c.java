interface Greeting {//Anonymous class
    void sayHello();
}

public class lab8_1c{
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello!");
            }
        };
        greeting.sayHello();
    }
}
