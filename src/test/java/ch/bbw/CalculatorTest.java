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

  @Test
  public void testSubtraktionZweiPositiveIsOk() {
    calculator = new Calculator();
    assertEquals(5, calculator.subtraktion(15, 10));
  }
}