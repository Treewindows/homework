package org.example.observer;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notificationAllow(String txtMsg) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(txtMsg);
        }
    }
}
