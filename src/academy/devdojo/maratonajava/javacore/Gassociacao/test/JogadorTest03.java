package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pedro");
        Jogador jogador2 = new Jogador("Arrascaeta");
        Jogador[] jogadores = {jogador, jogador2};
        Time time = new Time("Flamengo");

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
