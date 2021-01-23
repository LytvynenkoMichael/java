package pattern.generative_patterns.factory.interfaces;

public interface Cat extends Animal {

    @Override
    void sayHello();

    @Override
    void whatYouCan();

    void sayMaybe();
}
