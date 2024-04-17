package ru.job4j.condition;

public class Max {
    public static int max(int oneNum, int twoNum) {
        return oneNum >= twoNum ? oneNum : twoNum;
    }

    public static int max(int oneNum, int twoNum, int threeNum) {
        return max(oneNum, max(twoNum, threeNum));
    }

    public static int max(int oneNum, int twoNum, int threeNum, int fourNum) {
        return max(oneNum, max(twoNum, threeNum, fourNum));
    }
}