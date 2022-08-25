package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci<2){
            System.out.println(0);
        }
        int num[]=new int[lastFibonacci];
        num[0]=0;
        num[1]=1;
        for (int i = 2; i < lastFibonacci; i++) {
            num[i]=num[i-1]+num[i-2];
        }
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(num[i]);
        }
    }
}
