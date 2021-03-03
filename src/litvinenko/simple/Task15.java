/**
 * Michael Litvinenko
 */
package litvinenko.simple;

//Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.
//    right triangle


import litvinenko.simple.operator.ReadDouble;

public class Task15 {

    //    c^2=a^2+b^2, где a,\;b – катеты, c – гипотенуза. Видеодоказательство
    public static double hypotenuse(double cathetus1, double cathetus2) {
        return Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
    }

    public static double square(double cathetus1, double cathetus2) {
        return (cathetus1 * cathetus2) / 2;
    }

    public static double perimeter(double cathetus1, double cathetus2) {
        return hypotenuse(cathetus1, cathetus2) + cathetus1 + cathetus2;
    }

    public static void main(String[] args) {
        System.out.println("Enter cathetus 1: ");
        double first = ReadDouble.read();
        System.out.println("Enter cathetus 2: ");
        double second = ReadDouble.read();
        System.out.printf("Square = %.1f\n", square(first, second));
        System.out.printf("Perimeter = %.1f\n", perimeter(first, second));
        System.out.printf("Hypotenuse = %.1f\n", hypotenuse(first, second));

    }
}
