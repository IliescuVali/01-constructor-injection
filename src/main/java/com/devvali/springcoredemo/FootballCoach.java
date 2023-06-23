package com.devvali.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Run fast for 30 minutes!and then walk 15 minutes and reload!";
    }
}
