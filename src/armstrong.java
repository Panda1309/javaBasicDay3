import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check whether a given  number is Armstrong or not");
        int num= sc.nextInt();
        int sum=0,rem;
        int orgnum=num;
        while(num!=0)
        {
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(sum==orgnum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
