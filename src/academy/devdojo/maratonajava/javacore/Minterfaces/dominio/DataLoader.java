package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;//declarar public static final é redundante
    void load();//Declarar public abstract é redundante
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
