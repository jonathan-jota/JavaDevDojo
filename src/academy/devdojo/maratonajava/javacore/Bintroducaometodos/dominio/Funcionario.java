package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    /**Exercício
     * Crie uma classe Funcionário com os seguintes atributos
     * nome
     * idade
     * salario
     *
     * Crie dois métodos
     * 1. Para imprimir os dados
     * 2. Para tirar a média dos salários e imprimir o resultado
     */
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salarios) {
            System.out.println(salario);
        }
    }

    public void mediaSalario(double[] salarios) {
        double media = 0;
        double somaSalario = 0;
        for(double sal: salarios){
            somaSalario += sal;
        };
        media = somaSalario / salarios.length;
        System.out.println("A média salarial é de R$" + media);
    }
}
