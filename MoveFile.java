package file_handle.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class MoveFile {
    public static void main(String[] args) throws IOException {

        String sourceDirectoryPath = "/home/linux/Videos/file_path";
        String destinationDirectoryPath = "/home/linux/Videos/move_dir";

        File sourceDirectory = new File(sourceDirectoryPath);
        Path targetDir = Path.of(destinationDirectoryPath);


        File[] files = sourceDirectory.listFiles();

        if (files.length != 0){
            for (File file : files) {
                Path sourcePath = file.toPath();
                Path targetSourcePath = targetDir.resolve(file.getName());
                Files.move(sourcePath,targetSourcePath,StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("Successfully Moved");
        }else {
            System.out.println("No files found in the source directory.");
        }
    }
}
