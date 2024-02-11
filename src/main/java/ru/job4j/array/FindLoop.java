package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int elements) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == elements) {
                return index;
            }
        }
        return -1;
    }

    public static int indexInRange(int[] data, int elements, int start, int finish) {
        for (int index = start; index <= finish; index++) {
            if (data[index] == elements) {
                return index;
            }
        }
        return -1;
    }
}
