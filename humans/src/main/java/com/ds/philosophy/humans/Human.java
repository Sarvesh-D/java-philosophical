package com.ds.philosophy.humans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Human {

    private boolean isLiving;

    public Human() {
        decideReligion();
        isLiving = true;
    }

    @PostConstruct
    public void birth() {
        decideCarrier();
        live();
    }

    private void live() {
        while (isLiving) {
            eat();
            sleep();
            reproduce();
        }
    }

    @PreDestroy
    public void die() {
        leaveWealth();
        leaveReligion();
        leaveFamily();
        leaveBody();
        isLiving = false;
    }

    private void decideReligion() {
    }

    private void decideCarrier() {
    }

    private void eat() {
    }

    private void sleep() {
    }

    private void reproduce() {
    }

    private void leaveWealth() {
    }

    private void leaveReligion() {
    }

    private void leaveFamily() {
    }

    private void leaveBody() {
    }

}
