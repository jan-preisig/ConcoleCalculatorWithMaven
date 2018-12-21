package ch.bbw;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

  Calculator calculator;

  @Test
  public void testSummeZweiPositiveIsOk() {
    calculator = new Calculator();
    assertEquals(25, calculator.summe(10, 15));
  }
}