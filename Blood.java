//Eligibilty for blood donation
    import java.util.*;
class Blood
{
public static void main(String[] args)
{
int age,weight;
Scanner sc=new Scanner(System.in);
System.out.println("enter age");
age=sc.nextInt();
System.out.println("enter weight");
weight=sc.nextInt();
if(age>=18&&weight>=50)
{
System.out.println("eligible for blood donation");
}
else
{
System.out.println("not eligible");
}
}
}

