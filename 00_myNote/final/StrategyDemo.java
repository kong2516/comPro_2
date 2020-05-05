public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("10 + 5 = " + context.sol(10, 5));

        context = new Context(new Subtract());
        System.out.println("10 - 5 = " + context.sol(10, 5));
    }
}

class Context {
    private Operation todoOperation;

    public Context(Operation newOperation) {
        this.todoOperation = newOperation;
    }

    public int sol(int num1, int num2) {
        return todoOperation.operation(num1, num2);
    }
}

interface Operation {
    int operation(int num1, int num2);
}

class Add implements Operation {
    @Override
    public int operation(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtract implements Operation {
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }
}
