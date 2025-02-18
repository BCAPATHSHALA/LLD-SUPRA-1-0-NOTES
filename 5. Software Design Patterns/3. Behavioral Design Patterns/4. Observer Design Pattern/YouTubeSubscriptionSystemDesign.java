import java.util.ArrayList;
import java.util.List;

// Step 1: Observer Interface (Subscribers)
interface Subscriber {
    void update(String videoTitle);
    String getName();
}

// Step 2: Subject Interface (YouTube Channel)
interface YouTubeChannel {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String videoTitle);
}

// Step 3: Concrete Subject (YouTube Channel)
class TechYouTubeChannel implements YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;

    public TechYouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " subscribed to " + channelName);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " unsubscribed from " + channelName);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        System.out.println("\n🔔 " + channelName + " uploaded a new video: " + videoTitle);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }
}

// Step 4: Concrete Observers (Subscribers)
class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " received a notification: New Video - " + videoTitle);
    }

    public String getName() {
        return name;
    }
}

// Step 5: Client Code (Main Function)
public class YouTubeSubscriptionSystemDesign {
    public static void main(String[] args) {
        // Creating the YouTube Channel (Subject)
        TechYouTubeChannel channel = new TechYouTubeChannel("10xTech Infinity");

        // Creating Subscribers (Observers)
        User subscriber1 = new User("Subscriber 1");
        User subscriber2 = new User("Subscriber 2");
        User subscriber3 = new User("Subscriber 3");

        // Subscribing Users to the Channel
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        // Publishing a New Video
        channel.notifySubscribers("Observer Design Pattern Explained");

        // Unsubscribing a User
        channel.unsubscribe(subscriber2);

        // Publishing Another Video
        channel.notifySubscribers("Singleton Design Pattern Tutorial");
    }
}

/*
OUTPUT:
Subscriber 1 subscribed to 10xTech Infinity
Subscriber 2 subscribed to 10xTech Infinity
Subscriber 3 subscribed to 10xTech Infinity

? 10xTech Infinity uploaded a new video: Observer Design Pattern Explained
Subscriber 1 received a notification: New Video - Observer Design Pattern Explained
Subscriber 2 received a notification: New Video - Observer Design Pattern Explained
Subscriber 3 received a notification: New Video - Observer Design Pattern Explained
Subscriber 2 unsubscribed from 10xTech Infinity

? 10xTech Infinity uploaded a new video: Singleton Design Pattern Tutorial
Subscriber 1 received a notification: New Video - Singleton Design Pattern Tutorial
Subscriber 3 received a notification: New Video - Singleton Design Pattern Tutorial
*/