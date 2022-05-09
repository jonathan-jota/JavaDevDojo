package academy.devdojo.maratonajava.introducao;

public class AulaArrayMultidimensional {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }
        System.out.println("\n------------------------------------");

        for (int[] arrBase : array) {
            System.out.println("\n");
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
