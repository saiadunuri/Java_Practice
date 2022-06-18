import java.util.*;
class Scannersumsn
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      a=sc.nextInt();
      System.out.println("enter b value");
      b=sc.nextInt();
      int c=a*a;
      System.out.println("a^2="+c);
      int d=b*b;
      System.out.println("b^2="+d);
      int s=c+d;
      System.out.println("sum of square of a,b is " +s);
        }
  }