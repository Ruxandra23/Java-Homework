package calculator;

import java.io.*;

public class CalculatorClient {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();


        createTestFile();


        System.out.println("=== Test NullParameterException ===");
        try {
            calc.add(null, 5.0);
        } catch (Exception e) {
            System.out.println("Capturat: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }


        System.out.println("\n=== Test OverflowException ===");
        try {
            calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Capturat: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }


        System.out.println("\n=== Test UnderflowException ===");
        try {
            calc.add(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Capturat: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }


        System.out.println("\n=== Test MyArithmeticException ===");
        try {
            calc.divide(10.0, 0.0);
        } catch (Exception e) {
            System.out.println("Capturat: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }


        System.out.println("\n=== Test FileProcessingException și Average ===");
        try {
            Double[] values = calc.readValuesFromFile("numbers.txt");
            double avg = calc.average(values);
            System.out.println("Media calculată: " + avg);
        } catch (Exception e) {
            System.out.println("Capturat: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }


        System.out.println("\n=== Test Array Gol ===");
        try {
            calc.average(new Double[0]);
        } catch (Exception e) {
            System.out.println("Capturat: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    private static void createTestFile() {
        try (PrintWriter pw = new PrintWriter("numbers.txt")) {
            pw.println("10.5");
            pw.println("20.3");
            pw.println("15.7");
            pw.println("8.9");
        } catch (IOException e) {
            System.err.println("Eroare la crearea fișierului de test");
        }
    }
}