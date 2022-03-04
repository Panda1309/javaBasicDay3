import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check whether it is prime or not");
        int num= sc.nextInt();
        int i;
        for(i=2;i<num;i++)
            if(num%i==0)
                break;
        if(i==num)
        System.out.println("Prime number");
        else
        System.out.println("Not a prime number");
    }
}
