package pattern.generative_patterns.factory;

import pattern.generative_patterns.factory.entity.CatImpl;
import pattern.generative_patterns.factory.entity.DogImpl;
import pattern.generative_patterns.factory.entity.DuckImpl;
import pattern.generative_patterns.factory.interfaces.Animal;
import pattern.generative_patterns.factory.interfaces.Dog;
import pattern.generative_patterns.factory.interfaces.Duck;

public class AnimalFactory {
    Animal animal;

    public Animal getInstance(Animal animal) {
        if (animal instanceof Dog) {
            animal = new DogImpl();
        } else if (animal instanceof CatImpl) {
            animal = new CatImpl();
        } else if (animal instanceof Duck) {
            animal = new DuckImpl();
        } else {
            System.out.println("Unknown enemy");
        }
        return animal;
    }
}
