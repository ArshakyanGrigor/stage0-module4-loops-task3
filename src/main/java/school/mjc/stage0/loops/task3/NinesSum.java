package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println("0");
            return;
        }
        String str = "1";
        for (int i = 0; i < lengthOfLastNumber - 2; i++) {
            str += "1";
        }
        str += "0";
        str += (10 - lengthOfLastNumber);
        System.out.println(str);
    }
}
