package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario2 extends Pessoa {

    public Funcionario2(String nome) {
        super(nome);
    }

    public void imprime() {
        System.out.println(this.nome);
    }
}
