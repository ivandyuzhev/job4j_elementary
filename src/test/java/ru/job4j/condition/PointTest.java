package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point point = new Point(0, 0);
        Point r1 = new Point(2, 0);
        double out = point.distance(r1);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when50to56then6() {
        double expected = 6;
        Point point = new Point(5, 0);
        Point r2 = new Point(5, 6);
        double out = point.distance(r2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when70to74then4() {
        double expected = 4;
        Point point = new Point(7, 0);
        Point r3 = new Point(7, 4);
        double out = point.distance(r3);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when40to44then8() {
        double expected = 10;
        Point point = new Point(0, 0);
        Point r4 = new Point(6, 8);
        double out = point.distance(r4);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }
}