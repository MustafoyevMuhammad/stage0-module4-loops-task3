package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = (first < second)? first : second;
        while (first % second != 0){
            min = second;
            second = first % second;
            first = min;
        }
        System.out.println(second);
    }
}
