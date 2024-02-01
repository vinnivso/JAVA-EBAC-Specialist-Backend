package org.vinnivso.lambdas;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;


public class TesteLambdas {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        System.out.println(intBinaryOperator.applyAsInt(1, 2));

        BiFunction<Integer, Integer, Integer> biFunction = (Integer a, Integer b) -> {
            return a + b;
        };
        System.out.println(biFunction.apply(2, 2));

        BiFunction<Double, Double, String> biFunctionStr = (Double a, Double b) -> {
            Double result = a + b;
            return String.valueOf(result);
        };
        System.out.println(biFunctionStr.apply(2d, 2d));

        System.out.println(calcular(1L, 2L, (Long a, Long b) -> {
            return a + b;
        }));
    }

    private static Long calcular(Long a, Long b, BiFunction<Long, Long, Long> function) {
        return function.apply(a, b);
    }
}
