//adult or child ticket  
    import java.util.*;
class Ticket
{
public static void main(String[] args)
{
int age;
Scanner sc=new Scanner(System.in);
System.out.println("enter age");
age=sc.nextInt();
if(age>15)
{
System.out.println("adult ticket");
}
else
{
System.out.println("child ticket");
}
}
}
 
