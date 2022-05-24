package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.dominio.Seminario;

public class ExercicioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Zezinho", 17);
        Professor professor = new Professor("Girafales", "Matemática");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Da Vila", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
