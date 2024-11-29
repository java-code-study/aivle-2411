package com.chap06.sub01;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {
    public static double sum(List<BigDecimal> numbers){
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal num : numbers){
            sum = sum.add(num);
        }
        return sum.doubleValue();
    }
}
