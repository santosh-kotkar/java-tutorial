package ObserverPattern;

public class ObserverPatternTest {
    public static void main(String[] args) {

        Topic topic = new Topic();

        Observer observer1 = new TopicSubscriber("Observer 1");
        Observer observer2 = new TopicSubscriber("Observer 2");
        Observer observer3 = new TopicSubscriber("Observer 3");

        topic.addObserver(observer1);
        topic.addObserver(observer2);
        topic.addObserver(observer3);

        topic.sendObject(new String("Hello, Santosh!"));
        topic.sendObject(new String("You repository reached 1000 view."));
    }
}
