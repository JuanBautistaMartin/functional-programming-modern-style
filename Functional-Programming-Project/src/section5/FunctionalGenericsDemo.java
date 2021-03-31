package section5;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {

        FunctionalGenerics<String, String> func = s -> s.substring(1,5);
        String result = func.execute("12345678910");
        System.out.println(result);

        FunctionalGenerics<String, Integer> func1 = s -> s.length();
        Integer lenght = func1.execute("12345678910");
        System.out.println(lenght);
    }

}
