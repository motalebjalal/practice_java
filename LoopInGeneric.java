package learn_generic.generic1;

public class LoopInGeneric {
    public static <T extends Number> void traverseArray(T[] numbers) {
        int index = 0;
        for (T number : numbers) {
            System.out.println("Elements : " + number + " index : " + index);
            index++;
        }
    }
    public static void main(String[] args) {
        Integer[] elements = {10, 20, 30, 40, 50, 60, 70, 71};
        traverseArray(elements);
    }
}
