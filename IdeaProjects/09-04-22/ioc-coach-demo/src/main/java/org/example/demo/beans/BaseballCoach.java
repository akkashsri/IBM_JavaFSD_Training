package org.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "baseball")
public class BaseballCoach implements Coach{
    private final FortuneService sadFortune;

    public BaseballCoach(FortuneService sadFortune) {
        this.sadFortune = sadFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice back volley...";
    }

    @Override
    public String getDailyFortune() {
        return sadFortune.getDailyFortune();
    }
}
