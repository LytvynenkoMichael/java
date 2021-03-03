/**
 * Michael Litvinenko
 */
package litvinenko.simple;

//Напишите метод, который будет увеличивать заданный элемент массива на 10%.


import litvinenko.simple.operator.ReadInteger;

public class Task7 {
    public static void increaseSomeElement(double[] someArray, int elementNumber) {
        someArray[elementNumber] = (someArray[elementNumber] * 1.1);
    }

    public static void main(String[] args) {
        double[] newArray = {1.5, 2.6, 3.4, 4.4, 5.4, 6.1};
        System.out.println("Old array");
        for (double i : newArray) {
            System.out.printf("%.2f\n", i);
        }

        System.out.print("Enter index of array element: ");
        increaseSomeElement(newArray, ReadInteger.read());
        System.out.println("Changed array");

        for (double i : newArray) {
            System.out.printf("%.2f\n", i);
        }
    }
}
