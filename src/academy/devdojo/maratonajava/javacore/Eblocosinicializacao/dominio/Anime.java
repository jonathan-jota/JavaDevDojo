package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    /**1 - Alocado espaço em memória pro objeto
     * 2 - Cada atributo de classe é criado e inicializado com valores default ou por nós definido
     * 3 - BLoco de incialização é executado
     * 4 - Construtor é executado
     */
    {
        System.out.println("Dentro do bloco de incialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: this.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}

