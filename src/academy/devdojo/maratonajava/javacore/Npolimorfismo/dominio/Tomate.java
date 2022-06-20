package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

import java.util.Date;

public class Tomate extends Produto {
    private static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }




    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
