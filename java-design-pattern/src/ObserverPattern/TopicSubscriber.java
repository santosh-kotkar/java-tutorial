package ObserverPattern;

public class TopicSubscriber implements Observer {
    String name;

    TopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        Object object = observable.getUpdate();
        System.out.println(String.format("%s: %s", this.name, object));
    }
}
