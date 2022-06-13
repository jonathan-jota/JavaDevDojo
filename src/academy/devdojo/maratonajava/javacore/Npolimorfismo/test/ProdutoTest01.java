package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadorImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Tomate Orgânico", 10);
        Computador computador = new Computador("LG GRAM", 5500);
        System.out.println("---------------------------------");
        CalculadorImposto.calculaImpostoComputador(computador);
        CalculadorImposto.calculaImpostoTomate(tomate);
    }
}
