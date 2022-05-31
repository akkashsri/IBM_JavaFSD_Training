package org.example.beans;

public class BaseballCoach implements Coach{

    private final FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice back volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
