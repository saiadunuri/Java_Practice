//find the factorial of given number
import java.util.*;
class Factorial{
  public static void main(String args[]){;
    int fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    int a=sc.nextInt();
    for(int i=1;i<=a;i++){
    fact=fact*i;
    }
    System.out.println("factorial of "+a+" is "+fact);
  }
}
//