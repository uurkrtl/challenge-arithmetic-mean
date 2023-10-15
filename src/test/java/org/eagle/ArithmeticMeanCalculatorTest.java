package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ArithmeticMeanCalculatorTest {
    @Test
    void givenCollectionInteger_whenArithmeticMeanCalculate_thenArithmeticMean(){
        ArithmeticMeanCalculator arithmeticMeanCalculator = new ArithmeticMeanCalculator();
        Collection<Integer>numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        double expected = 5.5;
        double actual = arithmeticMeanCalculator.mean(numbers);
        Assertions.assertEquals(expected,actual);
    }
}
