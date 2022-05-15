package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Paulo";
        funcionario.idade = 30;
        funcionario.salarios = new double[] {1200, 987.32, 2000};

        funcionario.imprime();
        funcionario.mediaSalario(funcionario.salarios);
    }
}
