package section7;

import java.util.Optional;

public class Unwrap {

    public static void main(String[] args) {

        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);

        // DOn't use get if you don't have if the Optional can be null
        Integer integerVal = optional.get();
        System.out.println(integerVal);

        // Launching an error with get()
        Optional<Integer> emptyOptional = Optional.empty();
        //emptyOptional.get();

        // isPresent
        Integer val = optional.isPresent() ? optional.get() : 0;
        System.out.println(val);

        val = emptyOptional.isPresent() ? optional.get() : 0;
        System.out.println(val);

        // orElse, orElseGet

        // orElse
        Integer orElse = optional.orElse(0);
        System.out.println(orElse);

        orElse = emptyOptional.orElse(0);
        System.out.println(orElse);

        // orElseGet
        Integer orElseGet = emptyOptional.orElseGet(() -> 0);
        System.out.println(orElseGet);

        // orElseThrow
        emptyOptional.orElseThrow(IllegalArgumentException::new);

        // orElseThrow() = get(), if there is no value, throw no value present exception
        emptyOptional.orElseThrow();

    }

}
