package academy.devdojo.maratonajava.introducao;

public class AulaEstruturadeRepeticaoBreak02 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode  ser parcelado
    //Condição de valorParcela >= 1000
    public static void main(String[] args) {
        int valorTotal = 30000;
        for (int parcela = valorTotal; parcela >= 1; parcela--) {
            int valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ "+valorParcela);
        }

    }
}
