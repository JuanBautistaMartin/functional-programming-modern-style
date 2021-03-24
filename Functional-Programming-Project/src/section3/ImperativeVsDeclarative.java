package section3;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main(String[] args) {

        // SUm of even numbers
        int sumOfEvens = 0;
        /*for(int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                sumOfEvens = sumOfEvens + i;
            }
        }

        System.out.println(sumOfEvens);*/

        sumOfEvens =
                IntStream.range(0, 100)
                        .filter(x -> x % 2 == 0)
                        .reduce((x, y) -> x + y)
                        .orElse(0);

        System.out.println(sumOfEvens);
    }

}
