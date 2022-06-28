package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("Is Directory " + file.isDirectory());
            System.out.println("Is file " + file.isFile());
            System.out.println("Is hidden " + file.isHidden());
            System.out.println("Last modified " + new Date(file.lastModified()));
            boolean exists = file.exists();
            if(exists){
                boolean isDeleted = file.delete();
                System.out.println("Deleted " + isDeleted);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
