/**
 * Michael Litvinenko
 */
package litvinenko.simple;

//Напишите метод переводящий гривны в доллары по заданному курсу. В качестве аргументов передайте кол-во гривен и курс.


import litvinenko.simple.operator.ReadDouble;

public class Task14 {
    public static double convertUahToUsd(double uah, double usd) {
        return uah / usd;
    }

    public static void main(String[] args) {

        System.out.println("Enter your  quantity of UAH: ");
        double uah = ReadDouble.read();
        System.out.println("Enter current USD rate: ");
        double usd = ReadDouble.read();
        System.out.printf("You convert %.1f UAH to %.1f USD", uah, convertUahToUsd(uah, usd));

    }
}
