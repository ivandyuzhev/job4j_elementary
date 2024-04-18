package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point point = new Point(0, 0);
        Point r1 = new Point(2, 0);
        point.info();
        double out = point.distance(r1);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when500to560then6() {
        double expected = 6;
        Point point = new Point(5, 0, 0);
        Point r2 = new Point(5, 6, 0);
        double out = point.distance3d(r2);
        point.info();
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }
}
