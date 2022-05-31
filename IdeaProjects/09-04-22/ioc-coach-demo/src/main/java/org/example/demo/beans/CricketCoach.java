package org.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "cricket")
public class CricketCoach implements Coach{

    private final FortuneService happyFortune;

    public CricketCoach(FortuneService happyFortune) {
        this.happyFortune = happyFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice leg spin...";
    }

    @Override
    public String getDailyFortune() {
        return happyFortune.getDailyFortune();
    }
}
