package section8;

import java.util.function.Function;

public class FunctionalComposition {

    public static void main(String[] args) {

        IFunction<Square, Integer> fun1 = square -> square.getArea();
        IFunction<Integer, Double> fun2 = area -> Math.sqrt(area);

        IFunction<Square, Double> getSide = fun2.compose(fun1);

        Square square = new Square();
        square.setArea(100);

        Double side = getSide.apply(square);
        System.out.println(side);
    }

}
