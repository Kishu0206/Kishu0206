package Firstassignmentjava;

abstract class BaseClass {
    public abstract void doSomething(); // Common interface method

    public void debug() {
        // Common debugging logic
        System.out.println("Debugging!!!!");
        doSomething();
    }
}

// Example derived classes
class ClassA extends BaseClass {
    @Override
    public void doSomething() {
        System.out.println("ClassA: Child class");
    }
}

class ClassB extends BaseClass {
    @Override
    public void doSomething() {
        System.out.println("ClassB: Child class");
    }
}

class ClassC extends BaseClass {
    @Override
    public void doSomething() {
        System.out.println("ClassC: Child class");
    }
}

public class Example {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        a.debug();
        b.debug();
        c.debug();
    }
}
