package learn_instanceof;

import java.util.Scanner;

public class Learn_InstanceOf {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any type first value : ");
        String userInput1 = input.nextLine();
        System.out.print("Enter any type second value : ");
        String userInput2 = input.nextLine();

        try {

            int intValue1 = Integer.parseInt(userInput1);
            int intValue2 = Integer.parseInt(userInput2);

            int reslut = addValue(intValue1, intValue2);
            System.out.println("Result = "+reslut);
        } catch (NumberFormatException e1) {
            try {
                double doubleValue1 = Double.parseDouble(userInput1);
                double doubleValue2 = Double.parseDouble(userInput2);
                double reslut = addValue(doubleValue1, doubleValue2);
                System.out.println("Result = "+reslut);
            } catch (NumberFormatException e2) {
                System.out.println("Result : " + userInput1 +" "+ userInput2);
            }
        }

        input.close();
    }

    public static <T extends Number> T addValue(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported type");
        }

    }
}
