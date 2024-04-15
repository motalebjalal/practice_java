
// A simple exercise for reading and writing a file.

package file_handle.practice;

import java.io.*;

public class IoStream {
    public static void main(String[] args) throws IOException {

        String readSource = "/home/linux/Passion/java/basic_java/src/myfiles/read.txt";
        String writeSource = "/home/linux/Passion/java/basic_java/src/myfiles/write.txt";

        try (InputStream in
                     = new FileInputStream(readSource);
             OutputStream ops
                     = new FileOutputStream(writeSource)){
            int c;
            while ((c = in.read()) != -1){
                ops.write((byte) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }









    }
}
