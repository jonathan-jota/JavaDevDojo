package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Goku";
        estudante01.idade = 44;
        estudante01.sexo = 'M';

        estudante02.nome = "Titi";
        estudante02.idade = 40;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

//        System.out.println(estudante01.nome);
//        System.out.println(estudante01.idade);
//        System.out.println(estudante01.sexo);
//
//        System.out.println("-----------------------------");
//
//        System.out.println(estudante02.nome);
//        System.out.println(estudante02.idade);
//        System.out.println(estudante02.sexo);

    }
}
