package learn_generic.generic1;

public class EvenOddGeneric {
    public static <T extends Number> void evenOdd(T[] number) {
        int sumEven = 0;
        for (int i = 0; i < number.length; i++) {
            int check = (int) number[i];
            if (check % 2 == 0) {
                sumEven = sumEven + check;
                System.out.println(check);
            }
        }

        System.out.println("sum of Even : " + sumEven);

        int sumOdd = 0;
        for (int i = 0; i < number.length; i++) {
            int check = (int) number[i];
            if (check % 3 == 0) {
                sumOdd = sumOdd + check;
                System.out.println(check);
            }
        }
        System.out.println("sum of odd : " + sumOdd);

    }

    public static void main(String[] args) {
        Integer[] elements = {1, 2, 3, 4, 5, 6, 7};
        evenOdd(elements);

    }

}

