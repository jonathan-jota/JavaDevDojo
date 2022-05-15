package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Matias";
        estudante.idade = 34;
        estudante.sexo = 'M';

        estudante.imprime();
    }
}
