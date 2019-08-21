package pl.mbatyra.calculatorservice;

public class Calculator {

    public int add(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Passed values should be greater than zero!");
        }
        return a + b;
    }

}
