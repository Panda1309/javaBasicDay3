import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any umber to check whether it is palindrome or not");
        int num= sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");

    }
}
