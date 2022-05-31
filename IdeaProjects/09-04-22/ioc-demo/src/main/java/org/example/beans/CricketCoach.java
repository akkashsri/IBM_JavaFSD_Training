package org.example.beans;

public class CricketCoach implements Coach{
    private final FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice Leg spin";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
