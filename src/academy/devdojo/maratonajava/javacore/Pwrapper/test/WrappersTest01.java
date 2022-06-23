package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10f;
        double doubleP = 10D;
        char charP = 'J';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10f;
        Double doubleW = 10D;
        Character charW = 'J';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");

        System.out.println(Character.isDigit('J'));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isLetterOrDigit('?'));
        System.out.println(Character.isUpperCase('J'));
        System.out.println(Character.isLowerCase('j'));
        System.out.println(Character.toUpperCase('j'));
        System.out.println(Character.toLowerCase('J'));
    }
}
