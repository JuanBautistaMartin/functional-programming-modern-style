package section4;

public class LambdaPractice2 {

    public static void main(String[] args) {

        IMathOperation mathOperation = (a, b) -> System.out.println(a + b);
        mathOperation.operation(2, 2);
    }

}
