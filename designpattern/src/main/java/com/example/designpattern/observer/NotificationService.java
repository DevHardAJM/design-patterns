package com.example.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<NotificationListners> customers;

    NotificationService(){
        customers = new ArrayList<>();
    }

    public void subscribe(NotificationListners listner){
        customers.add(listner);
    }

    public void unSubscribe(NotificationListners listner){
        // int listnerIndex = customers.indexOf(listner);
        // if (listnerIndex > -1)
        //     customers.remove(listnerIndex);
        // OR
        customers.remove(listner);
    }

    public void sendNotification(String productDetails) {
        customers.forEach(listner -> listner.update(productDetails));
    }

    

    
}
