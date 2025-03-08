public class FibonacciRunner {
    public static void main(String[] args) {
        Fibonacci fib1 = new Fibonacci(50);
        System.out.println(fib1.getFibonacciNumber(1));
        System.out.println(fib1.getFibonacciNumber(2));
        System.out.println(fib1.getFibonacciNumber(3));
        System.out.println(fib1.getFibonacciNumber(4));
        System.out.println(fib1.getFibonacciNumber(5));
        System.out.println(fib1.getFibonacciNumber(6));
        System.out.println(fib1.getFibonacciNumber(11));
        System.out.println(fib1.getFibonacciNumber(16));
        System.out.println(fib1.getFibonacciNumber(21));
        System.out.println(fib1.getFibonacciNumber(31));
        System.out.println(fib1.getFibonacciNumber(41));
        System.out.println(fib1.getFibonacciNumber(46));

        Fibonacci fib2 = new Fibonacci(1);
        System.out.println(fib2.getFibonacciNumber(1));

        Fibonacci fib3 = new Fibonacci(2);
        System.out.println(fib3.getFibonacciNumber(1));
        System.out.println(fib3.getFibonacciNumber(2));
        System.out.println(fib3.getFibonacciNumber(11));
    }
}