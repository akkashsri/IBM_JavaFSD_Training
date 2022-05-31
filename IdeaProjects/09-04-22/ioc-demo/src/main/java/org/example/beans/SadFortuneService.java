package org.example.beans;

public class SadFortuneService implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "Bad Day...";
    }
}
