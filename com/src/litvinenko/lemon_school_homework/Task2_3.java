/**
 * Michael Litvinenko
 */
package litvinenko.lemon_school_homework;

/*В переменной n хранится натуральное двузначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр числа n.
*/

import litvinenko.lemon_school_homework.operator.ReadInteger;


public class Task2_3 {
    private static boolean isBinaryNatural(int number) {
        if (9 < number && number < 100) {
            return true;
        } else {
            System.out.println("It's not binary natural number, please change your number");
            return false;
        }
    }

    public static int sumOfNaturalNumber(int numbers) {
        int sum = 0;
        int number = numbers;
        if (isBinaryNatural(number)) {
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            System.out.println("Sum of your binary number " + numbers + " equal to : " + sum);
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfNaturalNumber(ReadInteger.read()));
    }
}
