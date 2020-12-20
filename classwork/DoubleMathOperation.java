package classwork;

public class DoubleMathOperation extends Operation {

    public Number sum(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        }
        return null;
    }

    public Number multiplication(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() * b.doubleValue();
        }
        return null;
    }

    public Number divide(Number a, Number b) {
        System.err.println("This is " + getClass());
        Double ZERO_NUMBER = 0d;
        if (b.doubleValue() == ZERO_NUMBER.intValue()) {
            System.out.println("You can't divide by zero");
            return null;
        }
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() / b.doubleValue();
        }
        return null;
    }

    public Number difference(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        }
        return null;
    }

    @Override
    public Number mod(Number a, Number b) {
        System.err.println("This is " + getClass());
        Double ZERO_NUMBER = 0d;
        if (b.doubleValue() == ZERO_NUMBER.intValue()) {
            System.out.println("You can't divide with remain by zero");
            return null;
        }
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() % b.doubleValue();
        }
        return null;
    }
}


