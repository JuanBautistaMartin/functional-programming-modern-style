package section7;

import java.util.Optional;

public class OptionalMoreOperations {

    public static void main(String[] args) {

        // ifPresent
        Optional<String> optional = Optional.of("Value");
        optional.ifPresent(System.out::println);

        optional = Optional.empty();
        optional.ifPresent(System.out::println);

        // ifPresentOrElse
        optional = Optional.of("Value");
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));

        optional = Optional.empty();
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));

        // stream
        optional = Optional.of("Value");
        optional.stream().forEach(System.out::println);

        optional = Optional.empty();
        optional.stream().forEach(System.out::println);

        // or , if the supplier function return a null, NullPointerException
        optional = Optional.of("Value");
        optional.or(() -> Optional.of("New value")).ifPresent(System.out::println);

        optional = Optional.empty();
        optional.or(() -> Optional.of("New value")).ifPresent(System.out::println);

        // equals, is equals if it is also an optional and eiher both are empty
        // or if the values in optional are equals to each other via equals method
        optional = Optional.of("Value");
        System.out.println(optional.equals(Optional.of("Value")));

        // hasCode , return hasCode of the value and if the optional is empty, it returns zero
        System.out.println(optional.hashCode());
        System.out.println(Optional.empty().hashCode());


    }

}
