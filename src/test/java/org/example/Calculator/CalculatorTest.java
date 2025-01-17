package org.example.Calculator;

import org.example.Exception.DivisionByZero;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    /**
     *
     */
    @BeforeClass
    public static void initBS(){
        System.out.println("До");
    }
    @AfterClass
    public static void initAS(){
        System.out.println("До");
    }
    @DisplayName("Сложение")
    @ParameterizedTest
    @CsvSource(value = {"10.0, 1.0, 11.0","10.0, 2.0, 12.0","10.0, 3.0, 13.0"},ignoreLeadingAndTrailingWhitespace = true)
    void testAddition(Double value,Double value2,Double result) {
        Double actual = Calculator.addition(value,value2);
        Assertions.assertEquals(actual,result);
    }

    @DisplayName("Вычитание")
    @ParameterizedTest
    @CsvSource(value = {"10.0, 4.0, 6.0","10.0, 5.0, 5.0","10.0, 6.0, 4.0","10.0, 7.0, 3.0"},ignoreLeadingAndTrailingWhitespace = true)
    void testSubtraction(Double value,Double value2,Double result) {
        Double actual = Calculator.subtraction(value,value2);
        Assertions.assertEquals(actual,result);
    }
    @DisplayName("Умножение")
    @ParameterizedTest
    @CsvSource(value = {"3.0, 2.0, 6.0","3.0, 3.0, 9.0","3.0, 4.0, 12.0","3.0, 5.0, 15.0"},ignoreLeadingAndTrailingWhitespace = true)
    void testMultiplication(Double value,Double value2,Double result) {
        Double actual = Calculator.multiplication(value,value2);
        Assertions.assertEquals(actual,result);
    }
   
    @DisplayName( "Деление")
    @ParameterizedTest
    @CsvSource(value = {"81.0, 9.0, 9.0","72.0, 9.0, 8.0","63.0, 9.0, 7.0","54.0, 9.0, 6.0"},ignoreLeadingAndTrailingWhitespace = true)
    void testDivision(Double value,Double value2,Double result) {
        Double actual = Calculator.division(value,value2);
        Assertions.assertEquals(actual,result);
    }
    @DisplayName("Возведение в квадрат числа")
    @ParameterizedTest
    @CsvSource(value = {"2.0, 4.0","3.0, 9.0","4.0, 16.0","5.0, 25.0"},ignoreLeadingAndTrailingWhitespace = true)
    void testSquaring(Double value,Double result) {
        Double actual = Calculator.squaring(value);
        Assertions.assertEquals(actual,result);
    }
    @DisplayName("Деление на ноль")
    @ParameterizedTest
    @CsvSource(value = {"81.0, 0.0"},ignoreLeadingAndTrailingWhitespace = true)
    void testDivision2(Double value,Double value2) {
        assertThrows(DivisionByZero.class, () -> Calculator.division(value, value2));
    }
}


