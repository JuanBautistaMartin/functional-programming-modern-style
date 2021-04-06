package section7;

import java.util.Optional;

public class OptionalOperations {

    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();

        // map()
        String orElse = optional.map( val -> "Replaced").orElse("Empty");
        System.out.println(orElse);

        // filter()
        optional = Optional.of("Value");
        Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("Value"));
        System.out.println(filter.get());


        // flatMap()
        optional = Optional.of("Value");
        Optional<String> replaced = optional.flatMap(val -> Optional.of("Replaced"));
        System.out.println(replaced.get());
    }

}
