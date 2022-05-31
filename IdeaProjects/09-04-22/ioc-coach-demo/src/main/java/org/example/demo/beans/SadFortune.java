package org.example.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class SadFortune implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "It's a sad day...";
    }
}
