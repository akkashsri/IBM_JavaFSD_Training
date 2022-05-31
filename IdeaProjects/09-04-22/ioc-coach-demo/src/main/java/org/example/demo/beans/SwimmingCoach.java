package org.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "swimming")
public class SwimmingCoach implements Coach{
    private final FortuneService sadFortune;

    public SwimmingCoach(FortuneService sadFortune) {
        this.sadFortune = sadFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 4 rounds...";
    }

    @Override
    public String getDailyFortune() {
        return sadFortune.getDailyFortune();
    }

}
