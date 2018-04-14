package com.ds.philosophy.humans;

@FunctionalInterface
public interface Caste extends Love {

    TYPE name();

    enum TYPE {
        BRAHMIN,
        KSHATRIYA,
        VAISHYA,
        BANIYA;
    }
}
