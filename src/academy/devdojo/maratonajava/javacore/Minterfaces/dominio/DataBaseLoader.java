package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do BD");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do BD");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no BD");
    }
}
