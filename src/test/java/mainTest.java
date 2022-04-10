import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
//Napisać jeszcze raz testy w assertJ
//Spock DDT
class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 9, 12})
  void numbersDividableBy3ReturnFizz(int aNumber) {

    assertEquals("Fizz", main.generatingFizzBuzz(aNumber));
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 20, 25})
  void numbersDividableBy5ReturnBuzz(int aNumber) {

    assertEquals("Buzz", main.generatingFizzBuzz(aNumber));
  }

  @ParameterizedTest
  @ValueSource(ints = {15, 30, 60})
  void numbersDividableBy3and5ReturnFizzBuzz(int aNumber) {
    assertEquals("FizzBuzz", main.generatingFizzBuzz(aNumber));
  }

  @ParameterizedTest
  @ValueSource(ints = {7,14,28})
  void numbersDividableBy7ReturnsDupa(int aNumber) {

    assertEquals("Dupa", main.generatingFizzBuzz(aNumber));
  }
  @ParameterizedTest
  @ValueSource(ints = {1, 2, 4, 8})
  void numbersNotDividableBy3or5ReturnItself(int aNumber) {
    assertEquals(String.valueOf(aNumber), main.generatingFizzBuzz(aNumber));
  }
}