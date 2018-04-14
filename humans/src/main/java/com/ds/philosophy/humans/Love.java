package com.ds.philosophy.humans;

import lombok.extern.slf4j.Slf4j;

public interface Love {

    default void doLove(Object other) {
        System.out.println(this.getClass().getSimpleName() + " Loves " +other.getClass().getSimpleName());
    }
}
