import java.util.*;

// Observer
interface Subscriber {
    void update(String message);
}

// Concrete Observer
class User implements Subscriber {
    String name;

    User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

// Subject
class YouTubeChannel {
    List<Subscriber> subscribers = new ArrayList<>();

    void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    void uploadVideo(String title) {
        System.out.println("New Video: " + title);
        for (Subscriber s : subscribers) {
            s.update(title);
        }
    }
}

// Client
public class ObserverDemo {
    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        channel.subscribe(new User("Nithin"));
        channel.subscribe(new User("Rahul"));

        channel.uploadVideo("Observer Pattern Explained");
    }
}