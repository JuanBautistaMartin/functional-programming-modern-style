package section5;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {

        BinaryOperator<String> binaryOperator = (a, b) -> a + "." + b;
        String result = binaryOperator.apply("Basics", "Strong");
        System.out.println(result);
    }

}
