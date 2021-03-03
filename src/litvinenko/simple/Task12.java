/**
 * Michael Litvinenko
 */
package litvinenko.simple;

/*
Пользователь вводит задает расстояние до места назначения (N) и время, за которое нужно доехать (T).
Вычислить скорость (км/ч), с которой нужно ехать.
*/


import litvinenko.simple.operator.ReadDouble;

public class Task12 {
    public static double findSpeed(double way, double time) {
        return way / time;
    }

    public static void main(String[] args) {

        System.out.println("Find speed: ");
        System.out.print("Enter way in 'km' = \n");
        double way = ReadDouble.read();
        System.out.print("Enter time in 'h' = h\n");
        double time = ReadDouble.read();
        System.out.printf("\nYou need drive with speed = %.1fkm/h", findSpeed(way, time));

    }
}
