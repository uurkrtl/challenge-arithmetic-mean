package org.eagle;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class ArithmeticMeanCalculator {
    public double mean(Collection<Integer>numbers){
        long count = numbers.stream().count();
        double sumNumbers = numbers.stream().mapToInt(Integer::intValue).sum();
        double arithmeticMean = sumNumbers/count;
        return arithmeticMean;
    }
}
