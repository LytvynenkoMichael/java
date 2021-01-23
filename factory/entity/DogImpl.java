package pattern.generative_patterns.factory.entity;

import pattern.generative_patterns.factory.interfaces.Dog;

public class DogImpl implements Dog {


    @Override
    public void sayHello() {
        System.out.println("Hello, my name is Dog");
    }

    @Override
    public void whatYouCan() {
        System.out.println("I can burk");
    }
}


