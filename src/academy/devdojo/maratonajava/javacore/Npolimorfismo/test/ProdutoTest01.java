package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Orgânico", 10);
        Computador computador = new Computador("LG GRAM", 5500);
        Televisao tv = new Televisao("Samsung 50\"", 5500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
