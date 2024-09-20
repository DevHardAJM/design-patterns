package com.example.designpattern.observer;

public class MainStore {

    public static void simulateObserver() {
        Store myStore = new Store();
        myStore.getNotificationService().subscribe(new EmailMsgListner("wtvr@haha.com"));
        myStore.getNotificationService().subscribe(new EmailMsgListner("wtvr@hoho.com"));
        myStore.getNotificationService().subscribe(new MobileMsgListner("whuh"));

        myStore.newProductArrived("the product X has Arrived");
    }
    
}
