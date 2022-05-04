package academy.devdojo.maratonajava.introducao;

public class AulaSwitch {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo
        byte dia = 2;
        switch (dia) {
//            case 1:
//                System.out.println("Domingo");
//                    break;
//            case 2:
//                System.out.println("Segunda");
//                    break;
//            case 3:
//                System.out.println("Terça");
//                    break;
//            case 4:
//                System.out.println("Quarta");
//                    break;
//            case 5:
//                System.out.println("Quinta");
//                    break;
//            case 6:
//                System.out.println("Sexta");
//                    break;
//            case 7:
//                System.out.println("Sábado");
//                    break;
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Dia Inválido");
        }
    }
}
