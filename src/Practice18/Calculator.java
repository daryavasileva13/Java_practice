package Practice18;

//public class Calculator {
//    public static <T extends Number> T sum(T num1, T num2) {
//        if (num1 instanceof Integer && num2 instanceof Integer) {
//            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
//        } else if (num1 instanceof Double && num2 instanceof Double) {
//            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
//        } else {
//            throw new IllegalArgumentException("Unsupported number types");
//        }
//    }
//
//    public static <T extends Number> T multiply(T num1, T num2) {
//        if (num1 instanceof Integer && num2 instanceof Integer) {
//            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
//        } else if (num1 instanceof Double && num2 instanceof Double) {
//            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
//        } else {
//            throw new IllegalArgumentException("Unsupported number types");
//        }
//    }
//
//    public static <T extends Number> T divide(T num1, T num2) {
//        if (num1 instanceof Integer && num2 instanceof Integer) {
//            return (T) Integer.valueOf(num1.intValue() / num2.intValue());
//        } else if (num1 instanceof Double && num2 instanceof Double) {
//            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
//        } else {
//            throw new IllegalArgumentException("Unsupported number types");
//        }
//    }
//
//    public static <T extends Number> T subtraction(T num1, T num2) {
//        if (num1 instanceof Integer && num2 instanceof Integer) {
//            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
//        } else if (num1 instanceof Double && num2 instanceof Double) {
//            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
//        } else {
//            throw new IllegalArgumentException("Unsupported number types");
//        }
//    }
//}
//



public class Calculator {
    public static <N extends Number> N sum(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() + b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() + b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() + b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.doubleValue() + b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }

    public static <N extends Number> N multiply(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() * b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() * b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() * b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.doubleValue() * b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }

    public static <N extends Number> N divide(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() / b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() / b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() / b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.doubleValue() / b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }

    public static <N extends Number> N subtraction(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() - b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() - b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() - b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.doubleValue() - b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }
}
