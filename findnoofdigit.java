//find no. of digits in given number
import java.util.*;
class findnoofdigit
{
public static void main(String args[])
{
int i=1,n,count=0;
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
n=n/10;
count++;
}
System.out.println(count);
}
}
