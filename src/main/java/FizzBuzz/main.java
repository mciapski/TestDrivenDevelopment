package FizzBuzz;/*
Ciąg pierwszych 100 liczb na wejściu.
Jeżeli liczba podzielna na 3 to zamienić ja na Fizz
Jeżeli liczba podzielna przez 5 to Buzz



 */

public class main {
  public static void main(String[] args) {


    for (int i = 1; i <= 100; i++) {
      System.out.println(generatingFizzBuzz(i));
    }

  }

public static String generatingFizzBuzz(int aNumber) {
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
