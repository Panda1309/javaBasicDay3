import java.util.Scanner;

public class primeBetweenIntervals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the interval in which you want to find prime numbers:");
        int first= sc.nextInt();
        int last=sc.nextInt();
        int i;
        System.out.println("All prime numbers in the given interval are ");
        for(int x=first+1;x<last;x++)
        {
            for( i=2;i<x;i++)
                if(x%i==0)
                    break;
            if(i==x)
                System.out.println(x);

        }
    }
}
