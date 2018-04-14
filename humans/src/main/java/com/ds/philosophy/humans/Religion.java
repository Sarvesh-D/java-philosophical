package com.ds.philosophy.humans;

@FunctionalInterface
public interface Religion extends Love {

    TYPE name();

    enum TYPE {
        HINDU,
        MUSLIM,
        SIKH,
        CHRISTIAN;
    }
}
