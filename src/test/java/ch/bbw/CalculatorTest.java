package ch.bbw;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  Calculator calculator;

  @Before
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void givenTwoPositiveNumbersItShouldCalculateThemSum() {
    int firstNumber = 20;
    int secondNumber = 10;

    int result = calculator.summe(firstNumber, secondNumber);

    assertEquals(30, result);
  }

  @Test
  void givenTwoNegativeNumbersItShouldCalculateThemSum() {
    int firstNumber = -10;
    int secondNumber = -20;

    int result = calculator.summe(firstNumber, secondNumber);

    assertEquals(-30, result);
  }

  @Test
  void givenTwoZeroValueNumbersItShouldCalculateThemSum() {
    int zeroValue = 0;

    int result = calculator.summe(zeroValue, zeroValue);

    assertEquals(0, result);
  }

  @Test
  void givenPositiveAndNegativeNumberItShouldCalculateThemSum() {
    int firstNumber = -10;
    int secondNumber = 20;

    int result = calculator.summe(firstNumber, secondNumber);

    assertEquals(10, result);
  }

  @Test
  void givenZeroValueAndPositiveNumberItShouldCalculateThemSum() {
    int firstNumber = 0;
    int secondNumber = 20;

    int result = calculator.summe(firstNumber, secondNumber);

    assertEquals(20, result);
  }

  @Test(expected = ArithmeticException.class)
  void givenMaxValueItShouldThrowExceptionSum() {
    int firstNumber = Integer.MAX_VALUE;
    int secondNumber = 20;

    calculator.summe(firstNumber, secondNumber);
  }

  @Test(expected = ArithmeticException.class)
  void givenMinValueItShouldThrowExceptionSum() {
    int firstNumber = Integer.MIN_VALUE;
    int secondNumber = -20;

    calculator.summe(firstNumber, secondNumber);
  }

  @Test
  void givenBigNumbersItShouldCalculateThemSum() {
    int firstNumber = 10;
    int secondNumber = 9244424;

    int result = calculator.summe(firstNumber, secondNumber);

    assertEquals(9244434, result);
  }

  @Test
  void givenTwoPositiveNumbersItShouldCalculateThemSub() {
    int firstNumber = 20;
    int secondNumber = 10;

    int result = calculator.subtraktion(firstNumber, secondNumber);

    assertEquals(10, result);
  }

  @Test
  void givenTwoNegativeNumbersItShouldCalculateThemSub() {
    int firstNumber = -10;
    int secondNumber = -20;

    int result = calculator.subtraktion(firstNumber, secondNumber);

    assertEquals(10, result);
  }

  @Test
  void givenTwoZeroValueNumbersItShouldCalculateThemSub() {
    int zeroValue = 0;

    int result = calculator.subtraktion(zeroValue, zeroValue);

    assertEquals(0, result);
  }

  @Test
  void givenPositiveAndNegativeNumberItShouldCalculateThemSub() {
    int firstNumber = -10;
    int secondNumber = 20;

    int result = calculator.subtraktion(firstNumber, secondNumber);

    assertEquals(-30, result);
  }

  @Test
  void givenZeroValueAndPositiveNumberItShouldCalculateThemSub() {
    int firstNumber = 0;
    int secondNumber = 20;

    int result = calculator.subtraktion(firstNumber, secondNumber);

    assertEquals(-20, result);
  }

  @Test(expected = ArithmeticException.class)
  void givenMaxValueItShouldThrowExceptionSub() {
    int firstNumber = Integer.MAX_VALUE;
    int secondNumber = -2;

    calculator.subtraktion(firstNumber, secondNumber);
  }

  @Test
  void givenMinValueShouldThrowExceptionSub() {
    int firstNumber = Integer.MIN_VALUE;
    int secondNumber = 2;

    calculator.subtraktion(firstNumber, secondNumber);
  }

  @Test
  void givenZeroAsItShouldBeLowerAsZeroSub() {
    int firstNumber = 0;
    int secondNumber = 2;

    int result = calculator.subtraktion(firstNumber, secondNumber);

    assertEquals(-2, result);
  }

}