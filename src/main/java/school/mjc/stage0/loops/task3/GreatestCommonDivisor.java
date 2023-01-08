package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = Math.max(first, second);
        int min = Math.min(first, second);
        for (int i = max; i >= 0; i--) {
            if (min % i == 0 && max % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
