import spock.lang.Specification

import java.util.stream.Collectors
import java.util.stream.Stream

class FizzBuzzTestSpock extends Specification {

//    def "dividable by 3 gives Fizz"() {
//        when:
//        String fizzString = new FizzBuzz().generatingFizzBuzz(aNumbers)
//
//        then:
//        fizzString == "Fizz"
//
//        where:
//        aNumbers << [3, 9, 12]
//    }
//
//    def "dividable by 3 and 5 gives FizzBuzz"() {
//        when:
//        String fizzString = new FizzBuzz().generatingFizzBuzz(aNumbers)
//
//        then:
//        fizzString == "FizzBuzz"
//
//        where:
//        aNumbers << [15, 30]
//    }
//
//    def "Not dividable by 3 or 5 gives Itself"() {
//        when:
//        String fizzString = new FizzBuzz().generatingFizzBuzz(aNumbers)
//
//        then:
//        fizzString == String.valueOf(aNumbers)
//
//        where:
//        aNumbers << [1, 2, 4]
//    }

    def "FizzBuzz"() {
        when:
        def results = new FizzBuzz().generatingFizzBuzz(Stream.of(aNumber))
                .collect(Collectors.toList())

        then:

        def expected =Stream.of(result)
                .collect(Collectors.toList())

        results == expected

        where:
        aNumber || result
        3       || "Fizz"
        9       || "Fizz"
        12      || "Fizz"

        15      || "FizzBuzz"
        30      || "FizzBuzz"

        1       || "1"
        2       || "2"
        4       || "4"

        5       || "Buzz"
        20      || "Buzz"


    }

}
