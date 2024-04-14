package file_handle.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAndWriteString {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("/home/linux/Passion/java/basic_java/src/myfiles/read.txt");

       if (Files.exists(path)) {
            System.out.println(path.getFileName());
        }

        String text = Files.readString(path);
        //System.out.println(text);

        Path writePath = Path.of("/home/linux/Passion/java/basic_java/src/myfiles/write.txt");
        Files.writeString(writePath, text);

    }
}
