public class ExceptionPropagationExample {

    // method1 throws ArithmeticException
    public static void method1() {
        // This will cause ArithmeticException
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }

    // method2 calls method1
    public static void method2() {
        method1();  // Exception will propagate from here
    }

    public static void main(String[] args) {

        try {
            method2(); // Exception propagates to main
        }
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }

        System.out.println("Program continues after exception");
    }
}
