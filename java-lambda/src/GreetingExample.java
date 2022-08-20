public class GreetingExample {
    public static void main(String[] args) {
        /*Classic java code*/
        Greeting m1 = new HelloWorldMessageGreeting();
        m1.message();

        /*Functional java code*/
        Greeting m2 = () -> System.out.println("Hello World!");
        m2.message();

    }
}

interface Greeting {
    void message();
}

class HelloWorldMessageGreeting implements Greeting {

    @Override
    public void message() {
        System.out.println("Hello World!");
    }
}
