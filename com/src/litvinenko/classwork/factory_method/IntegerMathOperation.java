package litvinenko.classwork.factory_method;

public class IntegerMathOperation extends Operation {

    public Number sum(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Integer && b instanceof Integer) {
            return a.intValue() + b.intValue();
        }
        return null;
    }

    public Number multiplication(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Integer && b instanceof Integer) {
            return a.intValue() / b.intValue();
        }
        return null;

    }

    public Number divide(Number a, Number b) {
        System.err.println("This is " + getClass());
        Integer ZERO_NUMBER = 0;
        if (b.intValue() == ZERO_NUMBER.intValue()) {
            System.out.println("You can't divide by zero");
            return null;
        }
        if (a instanceof Integer && b instanceof Integer) {
            return a.intValue() / b.intValue();
        }
        return null;
    }

    public Number difference(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Integer && b instanceof Integer) {
            return a.intValue() - b.intValue();
        }
        return null;
    }

    @Override
    public Number mod(Number a, Number b) {
        System.err.println("This is " + getClass());
        Integer ZERO_NUMBER = 0;
        if (b.intValue() == ZERO_NUMBER.intValue()) {
            System.out.println("You can't divide with remain by zero");
            return null;
        }
        if (a instanceof Integer && b instanceof Integer) {
            return a.intValue() % b.intValue();
        }
        return null;
    }
}
