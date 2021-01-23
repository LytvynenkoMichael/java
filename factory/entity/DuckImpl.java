package pattern.generative_patterns.factory.entity;

import pattern.generative_patterns.factory.interfaces.Duck;

public class DuckImpl implements Duck {

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is duck");
    }

    @Override
    public void whatYouCan() {
        System.out.println("I can + fly ");
    }
}
