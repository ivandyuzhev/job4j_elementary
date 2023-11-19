package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 160;
        float expected = 8;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("160 rubles are 8. Test result : " + passed);
        float in2 = 150;
        float expected2 = 6;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("150 rubles are 6. Test result : " + passed2);
    }

}



