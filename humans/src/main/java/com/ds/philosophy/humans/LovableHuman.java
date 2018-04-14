package com.ds.philosophy.humans;

import org.junit.Assert;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Builder
@Getter
@Setter
@Slf4j
public class LovableHuman implements Love {

    private Religion religion;

    private Caste caste;

    @Override
    public void doLove(Object other) {
        Assert.assertTrue("Other must be LovableHuman", LovableHuman.class.isAssignableFrom(other.getClass()));
        log.info("{} Loves {}", this.religion.name(), LovableHuman.class.cast(other).religion.name());
    }
}
