package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            StringBuilder s= new StringBuilder();
            for (int j = 0; j <= i; j++) {
                s.append("9");
            }
            sum=sum+Integer.parseInt(s.toString());
        }
        System.out.println(sum);
    }
}
