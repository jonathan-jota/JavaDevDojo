package academy.devdojo.maratonajava.introducao;

public class AulaArray {
    public static void main(String[] args) {
        //formas de declarar um Array
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};

        for(int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        System.out.println("------------------------------------------");
        for(int i : numeros3) {
            System.out.println(i);
        }
    }
}
