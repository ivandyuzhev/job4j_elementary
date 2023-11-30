package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int oneNum = 1;
        int twoNum = 2;
        int result = Max.max(oneNum, twoNum);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax222To111Then222() {
        int oneNum = 222;
        int twoNum = 111;
        int result = Max.max(oneNum, twoNum);
        int expected = 222;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax555To444Then555() {
        int oneNum = 555;
        int twoNum = 444;
        int result = Max.max(oneNum, twoNum);
        int expected = 555;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax555To444To666Then666() {
        int oneNum = 555;
        int twoNum = 444;
        int threeNum = 666;
        int result = Max.max(oneNum, twoNum, threeNum);
        int expected = 666;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax555To444To555To666To888Then888() {
        int oneNum = 555;
        int twoNum = 444;
        int threeNum = 666;
        int fourNum = 888;
        int result = Max.max(oneNum, twoNum, threeNum, fourNum);
        int expected = 888;
        assertThat(result).isEqualTo(expected);
    }
}