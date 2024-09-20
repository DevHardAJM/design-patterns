package com.example.designpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class EmailMsgListner implements NotificationListners {

    private final String email;

    @Override
    public void update(String newStateOfProduct) {
        // TODO Auto-generated method stub
        log.info("notifying " + email + " that " + newStateOfProduct);
    }

    

}
