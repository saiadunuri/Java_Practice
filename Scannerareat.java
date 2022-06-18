   import java.util.*;
public class Scannerareat
  {
  public static void main(String args[])
    {
    double h, b, area;
Scanner sc=new Scanner(System.in);
System.out.println("enter height");
h=sc.nextDouble();
System.out.println("enter base");
b=sc.nextDouble();
  area=0.5*h*b;  
      System.out.println("area of triangle is ="+area);
     }
}