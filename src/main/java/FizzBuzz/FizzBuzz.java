package FizzBuzz;

import java.util.stream.Stream;

public class FizzBuzz {


//    for (int i = 1; i <= 100; i++) {
//    System.out.println(generatingFizzBuzz(i));
//  }


  protected static Stream<String> generatingFizzBuzz(Stream<Integer> numbers) {
    return numbers.map(FizzBuzz::mappingNumbers);
  }

  private static String mappingNumbers(Integer aNumber) {
    if (aNumber % 5 == 0 && aNumber % 3 == 0) {
      return "FizzBuzz";
    } else if (aNumber % 5 == 0) {
      return "Buzz";
    } else if (aNumber % 3 == 0) {
      return "Fizz";
    } else if (aNumber % 7 == 0) {
      return "Dupa";
    } else {
      return String.valueOf(aNumber);
    }
  }

}
