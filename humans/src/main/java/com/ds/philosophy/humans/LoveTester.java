package com.ds.philosophy.humans;

import com.ds.utils.Random;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

@RunWith(JUnit4.class)
public class LoveTester {

    @Test
    public void shouldDisplayLoveIrrespectiveOfReligion() {
        Stream.generate(coupleSupplier)
              .limit(10)
              .forEach(couple -> couple.getKey().doLove(couple.getValue()));

    }

    private Supplier<Religion> religionSupplier = () -> () -> Random.element(Arrays.asList(Religion.TYPE.values()));

    private Supplier<Caste> casteSupplier = () -> () -> Random.element(Arrays.asList(Caste.TYPE.values()));

    private Supplier<LovableHuman> loveableHumanSupplier = () ->
            LovableHuman.builder()
                        .religion(religionSupplier.get())
                        .caste(casteSupplier.get())
                        .build();

    private Supplier<Map.Entry<LovableHuman, LovableHuman>> coupleSupplier = () -> new AbstractMap.SimpleEntry<>(loveableHumanSupplier.get(), loveableHumanSupplier.get());

}
