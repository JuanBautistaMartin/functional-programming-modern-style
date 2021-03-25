package section4;

public class LambdaPractice3 {

    public static void main(String[] args) {

        IStringLength stringLength = str -> str.length();
        int length = stringLength.getLength("Hello");
        System.out.println(length);

        IStringLength stringLength1 =
                str -> {
                    int lenght = str.length();
                    System.out.println(lenght);
                    return lenght;
                };

        stringLength1.getLength("Hello");
    }

}
