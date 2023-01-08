package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        for (; t != 0; ) {
            sum += (t % 10);
            t = t / 10;
        }
        if (sum < 0) {
            sum = sum * (-1);
        }
        System.out.println(sum);
    }
}
