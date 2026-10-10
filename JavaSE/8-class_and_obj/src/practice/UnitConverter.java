package practice;

public class UnitConverter {
    static final int BOILING = 100;

    public static class Temperature {
        double CToF(double c) {
            return c * 9 / 5 + 32;
        }

        static double FToC(double f) {
            return (f-32) * 5 / 9;
        }
    }

    public static void main(String[] args) {
        UnitConverter.Temperature temperature1 = new UnitConverter.Temperature();
        System.out.println(temperature1.CToF(100));
        System.out.println(temperature1.FToC(100));

        System.out.println(Temperature.FToC(100));

    }
}
