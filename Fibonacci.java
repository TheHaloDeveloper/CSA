public class Fibonacci {
    private int[] fibArray;

    public Fibonacci(int size) {
        fibArray = new int[size > 0 ? size : 0];
        if (size >= 1) fibArray[0] = 1;
        if (size >= 2) fibArray[1] = 1;
        
        for (int i = 2; i < size; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
    }

    public int getFibonacciNumber(int index) {
        return (index < 1 || index > fibArray.length) ? -1 : fibArray[index - 1];
    }
}