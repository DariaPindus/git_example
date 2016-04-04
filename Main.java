package ua.od.pindus;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int [] cache=new int[100];

        long start=System.nanoTime();

        int result=getSumIteratively();
        System.out.println("The result is "+ result);

        long end=System.nanoTime();

        long duration=end-start;

        System.out.println("Iterative duration is "+ duration);
        System.out.println();

        start=System.nanoTime();
        result=getSumFormule(50);
        cache[50]=result;
        System.out.println("The sum by formula is "+ result);
        end=System.nanoTime();
        duration=end-start;
        System.out.println("Formula duration is "+ duration);

        if(cache[50]!=0)
        {
            start=System.nanoTime();
            System.out.println("The value is "+cache[50]);
            end=System.nanoTime();
        }

        System.out.println("Cache duration " + duration);
    }

    public static int getSumIteratively() {
        int sum=0;
        for(int i=1; i<=100; i++){
            sum+=i;
        }
        return sum;
    }

    public static int getSumFormule(int n){
        int sum=(1+n)*n/2;
        return sum;
    }

    /*public static int getSumFormule(int first, int last, int n){
        int sum;
        sum=(first+last)*n/2;
        return sum;
    }*/
}
