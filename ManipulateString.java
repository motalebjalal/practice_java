package stringclasses11;

public class ManipulateString {

    public static void main(String[] args) {
        String str = "Hello ";
        System.out.println(" String Hello :  " +
                "\n lowercase ; " + str.toLowerCase() +
                "\n uppercase:" + str.toUpperCase() +
                "\n length:" + str.length() +
                "\n Indexof e: " + str.indexOf("e") +
                "\n Indexof l: " + str.indexOf("l") +
                "\n substring 1 to 3 : " + str.substring(1, 3) +
                "\n replace l with m : " + str.replace("l", "m") +
                "\n replaceall : " + str.replaceAll("Hello", "Dhaka") +
                "\n concat : " + str.concat(" world") +
                "\n contains : " + str.contains("lo") +
                "\n equals : " + str.equals("HELLO") +
                "\n equalsIgnoreCase : " + str.equalsIgnoreCase("HELLO") +
                "\n compareTo : " + str.compareTo("Hello") +
                "\n isBlank : " + str.isBlank() +
                "\n isEmpty : " + str.isEmpty() +
                "\n startsWith : " + str.startsWith("h") +
                "\n startsWith : " + str.endsWith(" ") +
                "\n trim : " + str.trim().length()

        );

        //reverse String
        StringBuilder input = new StringBuilder();
        input.append(str);
        input.reverse();
        System.out.println(input);


    }

}
