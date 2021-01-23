package litvinenko.lemon_school_homework_2;

//Представить своё ФИО в цифровом формате согласно значениям символов. 1-й уровень десятичная система исчисления.
// 2-й уровень двоичная, третий шестнадцатиричная

public class WelcomeClass {
    public static void main(String[] args) {

        String name = "m";


//        System.out.println(a1);

//        System.out.println(name.hashCode());
//        System.out.println(Integer.toBinaryString(name.hashCode()));
//        System.out.println(convertToDecimal(name.hashCode()));

        System.out.println(Integer.toBinaryString(11));
        System.out.println(convertDecimalToBinary(11));
        System.out.println(convertDecimalToAnything(11, 2));
        System.out.println(Integer.toHexString(11));
        System.out.println(convertDecimalToAnything(11, 16));
//        System.out.println(Integer.toOctalString(name.hashCode()));

    }

    public static String convertDecimalToBinary(int decimal) {
        int remainder;
        String output = "";
        while (decimal > 0) {
            remainder = (decimal % 2);
            output = Integer.toString(remainder) + output;
            decimal = decimal / 2;
        }
        return output;
    }
    public static int convertBinaryToDecimal(int binaryDigit) {
        int decimal = 0;
        int n = 0;
        int temp = 0;
        while (binaryDigit > 0) {
            temp = binaryDigit % 10;
            decimal += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / 10;
            n++;
        }
        return decimal;
    }
    public static String convertDecimalToAnything(int decimalDigit, int systemIndex) {
        int remainder;
        String output = "";
        while (decimalDigit > 0) {
            remainder = (decimalDigit % systemIndex);
            output = Integer.toString(remainder) + output;
            decimalDigit = decimalDigit / systemIndex;
        }
        return output;
    }
}
