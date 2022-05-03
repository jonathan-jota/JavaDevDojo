package academy.devdojo.maratonajava.introducao;

/*
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>
* */
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Jonathan";
        String endereco = "Av. das Camélias";
        double salario = 3000.00;
        String dataRecebimentoSalario = "01/05/2022";

        System.out.println(
                "Eu, "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "
                        +salario+", na data "+dataRecebimentoSalario);
    }
}
