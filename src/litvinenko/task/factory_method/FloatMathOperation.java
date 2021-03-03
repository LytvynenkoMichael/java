package litvinenko.task.factory_method;

public class FloatMathOperation extends Operation {

    public Number sum(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Float || b instanceof Float) {
            return a.floatValue() + b.floatValue();
        }
        return null;
    }

    public Number multiplication(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Float || b instanceof Float) {
            return a.floatValue() * b.floatValue();
        }
        return null;
    }

    public Number divide(Number a, Number b) {
        System.err.println("This is " + getClass());
        Float ZERO_NUMBER = 0f;
        if (b.doubleValue() == ZERO_NUMBER.intValue()) {
            System.out.println("You can't divide by zero");
            return null;
        }
        if (a instanceof Float || b instanceof Float) {
            return a.floatValue() / b.floatValue();
        }
        return null;
    }

    public Number difference(Number a, Number b) {
        System.err.println("This is " + getClass());
        if (a instanceof Float || b instanceof Float) {
            return a.floatValue() - b.floatValue();
        }
        return null;
    }

    @Override
    public Number mod(Number a, Number b) {
        System.err.println("This is " + getClass());
        Float ZERO_NUMBER = 0f;
        if (b.doubleValue() == ZERO_NUMBER.intValue()) {
            System.out.println("You can't divide with remain by zero");
            return null;
        }
        if (a instanceof Float || b instanceof Float) {
            return a.floatValue() % b.floatValue();
        }
        return null;
    }
}


