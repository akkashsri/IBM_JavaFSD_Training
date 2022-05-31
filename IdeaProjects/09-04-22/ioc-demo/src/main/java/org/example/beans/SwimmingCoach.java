package org.example.beans;

public class SwimmingCoach implements Coach{

    private final FortuneService fortuneService;

    public SwimmingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "run 4k today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
