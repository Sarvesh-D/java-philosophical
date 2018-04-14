package com.ds.philosophy.humans;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

@Builder
@Data
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
