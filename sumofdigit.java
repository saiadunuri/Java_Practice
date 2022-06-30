//sum of number of digits in given number
import java.util.*;
class sumofdigit
{
public static void main(String args[])
{
int i=1,n,reminder,sum=0;
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)//0!=0
{
reminder=n%10;//1
sum=sum+reminder;//10
n=n/10;//0
}
System.out.println(sum);
}
}
