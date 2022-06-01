package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    /**
     * 0 - O Bloco de Inicialização estático da superclasse é executado quando a JVM carregar a classe pai
     * 1 - O Bloco de Inicialização estático da subclasse é executado quando a JVM carregar a classe filha
     * 2 - Alocado espaço em memória pro objeto da superclasse
     * 3 - Cada atributo de superclasse é criado e inicializado com valores default ou por nós definido
     * 4 - Bloco de incialização da superclasse é executado na ordem em que aparece
     * 5 - Construtor da superclasse é executado
     * 6 - Alocado espaço em memória pro objeto da subclasse
     * 7 - Cada atributo de subclasse é criado e inicializado com valores default ou por nós definido
     * 8 - Bloco de incialização da subclasse é executado na ordem em que aparece
     * 9 - Construtor da subclasse é executado
     */
    static {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos");
    }
}
