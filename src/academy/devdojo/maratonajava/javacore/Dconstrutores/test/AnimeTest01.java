package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jiraya", "Anime", 450, "Ação", "Production IG");
       // Anime anime2 = new Anime();

        anime.imprime();
        //anime2.imprime();
    }
}
