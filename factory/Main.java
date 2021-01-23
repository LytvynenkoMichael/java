package pattern.generative_patterns.factory;

import pattern.generative_patterns.factory.entity.CatImpl;
import pattern.generative_patterns.factory.entity.DogImpl;
import pattern.generative_patterns.factory.entity.DuckImpl;
import pattern.generative_patterns.factory.interfaces.Animal;
import pattern.generative_patterns.factory.interfaces.Cat;
import pattern.generative_patterns.factory.interfaces.Dog;
import pattern.generative_patterns.factory.interfaces.Duck;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new DuckImpl("Chichi", "run!!!!");
        DogImpl dog = new DogImpl();
        CatImpl cat = new CatImpl();
        DuckImpl duck = new DuckImpl();
        Animal animal1 = new AnimalFactory().getInstance(cat);
//        Cat animal2 = new AnimalFactory().getInstance();
        animal1.sayHello();
        animal1.whatYouCan();
        if (animal1 instanceof Cat) {
            System.out.println(true);
        }

        //Можно ли раширить какой то интерфейс и использовать его возможности через Фабричный метод.


    }
}
