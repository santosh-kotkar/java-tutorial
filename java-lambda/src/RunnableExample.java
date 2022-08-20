
public class RunnableExample {
    public static void main(String[] args) {
        /*Classic Java code*/
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        });
        t1.run();

        /*Functional code*/
        Thread t2 = new Thread(() -> System.out.println("Inside lambda runnable"));
        t2.run();

    }
}
