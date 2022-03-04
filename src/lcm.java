import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int lcm;
     boolean fact=true;
        System.out.println("Enter two numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        lcm=(num1>num2)?num1:num2;
        while(fact)
        {
            if(lcm%num1==0&&lcm%num2==0)
            {
                System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
                break;
            }
         ++lcm;
        }
    }
}
