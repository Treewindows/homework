package org.example.QuadraticEquationTest;

import org.example.Calculator.Calculator;
import org.example.QuadraticEquation.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class QuadraticEquationTest {
    @DisplayName("Решение квадратного уравнения")
    @ParameterizedTest
    @CsvSource(value = {"5.0, -9.0, -2.0,-0.2,2.0","2.0, -11.0, 5.0,0.5,5.0","5.0, 11.0, 2.0,-2.0,-0.2"},ignoreLeadingAndTrailingWhitespace = true)
    void testSquaring(Double a, Double b, Double c,Double x1,Double x2) {
        String actualValue = QuadraticEquation.QuadraticEquation(a,b,c);
        String resultAdditionValue = String.format("%.2f,%.2f",x1,x2);
        Assertions.assertEquals(actualValue,resultAdditionValue);
    }
}
