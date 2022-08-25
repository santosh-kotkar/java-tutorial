import java.util.Arrays;

public class SynchronizedBlockExample {
    public static void main(String[] args) {
        SynchronizedBlockExample e = new SynchronizedBlockExample();
        new Thread(e::process).start();
        new Thread(e::process).start();
        new Thread(e::process).start();
    }

    /*On its stack(basically thread stack), local primitives and local reference variables are stored.
    Hence one thread does not share its local variables with any other thread as these local variables and
    references are inside the thread's private stack. Hence local variables are always thread-safe.*/
    private void process() {
        int length = 10;
        Double[] localObjects; //thread-safe
        synchronized (this) {
            double random = Math.random() * 10;
            localObjects = new Double[length];
            for (int i = 0; i < length; i++) localObjects[i] = random;
            System.out.println(Arrays.toString(localObjects));
        }
        for (int i = 0; i < length; i++) System.out.println(localObjects[i]);
    }
}
