package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("O DevDojo é um ótimo curso\nRecomendo, com certeza\n");
            fw.flush();
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
