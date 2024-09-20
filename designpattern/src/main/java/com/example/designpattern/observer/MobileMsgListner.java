package com.example.designpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class MobileMsgListner implements NotificationListners {

    private String username;

    @Override
    public void update(String newStateOfProduct) {
        // TODO Auto-generated method stub
        log.info("notifying mobile" + username + " that " + newStateOfProduct);
    }
    
}
