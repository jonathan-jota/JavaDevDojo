package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do BD");
    }
}
