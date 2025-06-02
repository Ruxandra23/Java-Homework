package calculator;

public interface Calculator {
    double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;
    double divide(Double a, Double b) throws NullParameterException, MyArithmeticException;
    double average(Double[] values) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException, FileProcessingException;
}