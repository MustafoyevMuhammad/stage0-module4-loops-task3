package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num = -1,num2 =1, temp = 0;
        for (int i = 1; i <= lastFibonacci; i++) {
            if(i <= 2){
                System.out.println(1);
                num++;
            }
            else{
                temp = num;
                num = num + num2;
                System.out.println(num);
                num2 = temp;
            }
        }
    }
}
