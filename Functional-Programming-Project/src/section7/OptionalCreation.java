package section7;

import java.util.Optional;

public class OptionalCreation {

    public static void main(String[] args) {

        String val = "A String";
        Optional<String> opntional = Optional.of(val);

        // Empty optional
        Optional<Integer> empty = Optional.empty();

        // Nullable
        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);

    }

}
