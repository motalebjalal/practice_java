package learn_generic.generic2;

public class EvenOddPureGeneric {
    public static <T extends Number> void evenOdd(T[] numbers) {
        int sumEven = 0;
        for (T number : numbers) {
            if (number.intValue() % 2 == 0) {
                System.out.println(number.intValue());
                sumEven += number.intValue();

            }
        }

        System.out.println("sum of Even : " + sumEven);

        int sumOdd = 0;
        for (T number : numbers) {
            if (number.intValue() % 3 == 0) {
                System.out.println(number.intValue() );
                sumOdd += number.intValue();

            }
        }
        System.out.println("sum of odd : " + sumOdd);

    }

    public static void main(String[] args) {
        Integer[] elements = {1, 2, 3, 4, 5, 6, 7};
        evenOdd(elements);

    }

}
