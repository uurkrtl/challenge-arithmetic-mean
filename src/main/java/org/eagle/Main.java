package org.eagle;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        ArithmeticMeanCalculator arithmeticMeanCalculator = new ArithmeticMeanCalculator();
        Collection<Integer>numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(23);
        numbers.add(35);
        numbers.add(42);
        numbers.add(7);
        numbers.add(11);
        System.out.println(arithmeticMeanCalculator.mean(numbers));
    }
}