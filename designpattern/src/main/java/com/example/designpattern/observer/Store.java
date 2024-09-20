package com.example.designpattern.observer;

import lombok.Getter;

@Getter
public class Store {
    
    private final NotificationService notificationService;
    

    public Store(){
        notificationService = new NotificationService();
    }

    public void newProductArrived(String productDetails){
        notificationService.sendNotification(productDetails);
    }





}
