package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoVerticalNotFullOne() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {' ', ' ', ' '},
        };
        int column = 0;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoVerticalNotFullTwo() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', ' ', ' '},
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
        };
        int raw = 2;
        boolean result = MatrixCheck.monoHorizontal(input, raw);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoHorizontalNotFullOne() {
        char[][] input = {
                {'X', 'X', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int raw = 0;
        boolean result = MatrixCheck.monoHorizontal(input, raw);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoHorizontalNotFullTwo() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '},
        };
        int raw = 1;
        boolean result = MatrixCheck.monoHorizontal(input, raw);
        assertThat(result).isFalse();
    }
}