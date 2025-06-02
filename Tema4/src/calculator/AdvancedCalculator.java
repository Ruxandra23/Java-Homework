package calculator;

import java.io.*;
import java.util.*;

public class AdvancedCalculator implements Calculator {

    @Override
    public double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null) {
            throw new NullParameterException("Parametrii nu pot fi null");
        }

        double result = a + b;

        if (result == Double.POSITIVE_INFINITY) {
            throw new OverflowException("Suma rezultă în overflow pozitiv");
        }
        if (result == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("Suma rezultă în underflow negativ");
        }

        return result;
    }

    @Override
    public double divide(Double a, Double b) throws NullParameterException, MyArithmeticException {
        if (a == null || b == null) {
            throw new NullParameterException("Parametrii nu pot fi null");
        }
        if (b == 0.0) {
            throw new MyArithmeticException("Împărțire la zero");
        }

        return a / b;
    }

    @Override
    public double average(Double[] values) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException, FileProcessingException {
        if (values == null) {
            throw new NullParameterException("Array-ul nu poate fi null");
        }
        if (values.length == 0) {
            throw new FileProcessingException("Array-ul este gol");
        }

        double sum = 0;
        for (Double value : values) {
            sum = add(sum, value);
        }

        return divide(sum, (double) values.length);
    }

    public Double[] readValuesFromFile(String fileName) throws FileProcessingException {
        List<Double> values = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    values.add(Double.parseDouble(line.trim()));
                } catch (NumberFormatException e) {
                    throw new FileProcessingException("Format invalid în fișier: " + line);
                }
            }
        } catch (IOException e) {
            throw new FileProcessingException("Eroare la citirea fișierului: " + e.getMessage());
        }

        return values.toArray(new Double[0]);
    }
}
