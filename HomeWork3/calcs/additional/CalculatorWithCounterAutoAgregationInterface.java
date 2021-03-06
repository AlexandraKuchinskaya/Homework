package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationInterface {
    private final ICalculator calc;

    private long counter;

    public long getCountOperation() {
        return counter;
    }

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc) {
        this.calc = calc;
    }

    public double stepen(double number, double stepen) {
        counter++;
        return calc.stepen(number, stepen);
    }


    public double modul(double a) {
        counter++;
        return calc.modul(a);
    }


    public double coren(double a) {
        counter++;
        return calc.coren(a);
    }


    public double sum(double a, double b) {
        counter++;
        return calc.sum(a, b);
    }


    public double minus(double a, double b) {
        counter++;
        return calc.minus(a, b);
    }


    public double multiplication(double a, double b) {
        counter++;
        return calc.multiplication(a, b);
    }


    public double division(double a, double b) {
        counter++;
        return calc.division(a, b);
    }
}
