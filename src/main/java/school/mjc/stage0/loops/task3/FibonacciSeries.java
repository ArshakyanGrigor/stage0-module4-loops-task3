package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int number1 = 0;
        int number2 = 1;
        int number3;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(number1);
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
    }
}
