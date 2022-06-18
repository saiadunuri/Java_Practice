   import java.util.*;
public class Scannerpr
  {
  public static void main(String args[])
    {
    int l, w;
Scanner sc=new Scanner(System.in);
System.out.println("enter length");
l=sc.nextInt();
System.out.println("enter width");
w=sc.nextInt();
  int r=2*(l+w);  
      System.out.println("perimeter of rectangle is =" + r);
     }
}