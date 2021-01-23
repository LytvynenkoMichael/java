package pattern.generative_patterns.factory.entity;

import pattern.generative_patterns.factory.interfaces.Cat;

public class CatImpl implements Cat {

    public CatImpl() {
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is  Cat" );
    }

    @Override
    public void whatYouCan() {
        System.out.println("I can  eat ");
    }

    @Override
    public void sayMaybe() {
        System.out.println("Addition method");
    }


//    public void irritate(){
//        System.out.println("Irritate");
//    }
}
