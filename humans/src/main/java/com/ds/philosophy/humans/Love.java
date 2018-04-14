package com.ds.philosophy.humans;

public interface Love {

    default void doLove(Object other) {
        System.out.println(this.getClass().getSimpleName() + " Loves " +other.getClass().getSimpleName());
    }
}
