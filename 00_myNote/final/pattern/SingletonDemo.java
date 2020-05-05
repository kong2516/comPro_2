package pattern;

public class SingletonDemo {
    //1. It should have only single instance
    //2. This instance should be available through a global access
    public static void main(String[] args) {
        //Circle circle = new Circle(); Error because the constructor is private

        Circle circle = Circle.getCircleInstance();
        circle.count();
        circle.count();
        circle.count();
        circle.count();
        circle.count();
    }
}

// Step1: Create a class which you want to make Singleton
class Circle {
    private int count = 0;

    // Step2: Create a private default constructor of the class
    private Circle() {}

    //Step3: Create a private static variable of the class create in step 1. and
    // this variable should be private and static and it should refer to
    // the instance of class create in step 1.
    private static Circle circleInstance = new Circle();

    //Step4: Create a accessor method method which could always return us
    // back with a instance of class created in step3.
    public static  Circle getCircleInstance() {
        return circleInstance;
    }

    //Step5: There should not be any method or constructor which can create instance of this class
    public void count() {
        count++;
        System.out.println(count);
    }
}
