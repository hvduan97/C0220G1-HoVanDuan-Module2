package services.impl;

import org.springframework.stereotype.Service;
import services.Calculator;
@Service
public class CalculatorImpl implements Calculator {
    @Override
    public double addition(double a, double b) {
        return (a+b);
    }

    @Override
    public double subtraction(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplacation(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        if (b!=0){
            return a/b;
        }
        else return -1;
    }
}
