/**
 * Michael Litvinenko
 */
package litvinenko.simple;

/*В переменной n хранится натуральное трёхзначное число.
Создайте программу,вычисляющую и выводящую на экран сумму цифр числа n.*/


import litvinenko.simple.operator.ReadInteger;

public class Task5 {
    private static boolean isTernaryNatural(int number) {
        if (99 < number && number < 1000) {
            return true;
        } else {
            System.out.println("It's not ternary natural number, please change your number");
            return false;
        }
    }

    public static int sumOfNaturalNumber(int numbers) {
        int sum = 0;
        int number = numbers;
        if (isTernaryNatural(number)) {
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            System.out.println("Sum of your ternary number " + numbers + " equal to : " + sum);
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Enter your integer number for rounding: ");
        System.out.println("Your result: " + sumOfNaturalNumber(ReadInteger.read()));

    }
}

