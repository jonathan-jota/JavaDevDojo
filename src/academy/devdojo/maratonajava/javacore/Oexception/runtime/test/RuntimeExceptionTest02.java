package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
//        try {
            divisao(1, 0);
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
        System.out.println("Codigo finalizado");
    }

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
//        try {
//            return a / b;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
        return a / b;

    }
}
