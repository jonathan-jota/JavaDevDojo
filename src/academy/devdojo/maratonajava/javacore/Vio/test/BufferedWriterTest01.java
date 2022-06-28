package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            BufferedWriter br = new BufferedWriter(fw);
            br.write("O DevDojo é um ótimo curso, recomendo com certeza");
            br.newLine();
            br.flush();
            System.out.println("Arquivo criado");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

