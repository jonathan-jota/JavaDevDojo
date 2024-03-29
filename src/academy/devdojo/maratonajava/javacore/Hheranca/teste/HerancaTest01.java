package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario2;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1050");
        endereco.setCep("12345-678");
        Pessoa pessoa = new Pessoa("Paulo");
        pessoa.setCpf("123456789");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("*********************************");

        Funcionario funcionario = new Funcionario("Mario");
        funcionario.setCpf("12332112312");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4000);
        funcionario.imprime();
        funcionario.relatarioPagamento();
        Funcionario2 funcionario2 = new Funcionario2("Luiz");
        funcionario2.imprime();



    }
}
