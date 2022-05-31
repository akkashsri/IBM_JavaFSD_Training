package org.example.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "It's a good day...";
    }
}
