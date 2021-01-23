package litvinenko.classwork.factory_method;

public class LongMathOperation extends Operation {

    public Number sum(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Long || b instanceof Long) {
            return a.longValue() + b.longValue();
        }
        return null;
    }

    public Number multiplication(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Long || b instanceof Long) {
            return a.longValue() * b.longValue();
        }
        return null;
    }

    public Number divide(Number a, Number b) {
        System.err.println("This is " + getClass());
        Long ZERO_NUMBER = 0L;
        if (b.doubleValue() == ZERO_NUMBER.intValue()) {
            System.out.println("You can't divide by zero");
            return null;
        }
        if (a instanceof Long || b instanceof Long) {
            return a.longValue() / b.longValue();
        }
        return null;
    }

    public Number difference(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Long || b instanceof Long) {
            return a.longValue() - b.longValue();
        }
        return null;
    }

    @Override
    public Number mod(Number a, Number b) {
        System.err.println("This is " + getClass());
        Long ZERO_NUMBER = 0L;
        if (b.doubleValue() == ZERO_NUMBER.intValue()) {
            System.out.println("You can't divide with remain by zero");
            return null;
        }
        if (a instanceof Long || b instanceof Long) {
            return a.longValue() % b.longValue();
        }
        return null;
    }
}


