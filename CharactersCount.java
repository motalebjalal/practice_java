package learn_string.string1;

public class CharactersCount {
    public static void main(String[] args) {
        String data = "Hello World, I love java";
        System.out.println("Befor : "+ data.length());

        int count = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("After : "+count);
    }
}
