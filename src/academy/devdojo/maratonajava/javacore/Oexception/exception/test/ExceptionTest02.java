package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
        boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        };
    }

}
/**
 * No diretório aberto pelo explorer remover a permissão de escrita para lançar a exceção
 */