//Write a JAVA program to check whether a number is palindrome or not.
import java.util.*;
class Polindrom
{
  public static void main(String args[]){
    int n, reminder, order=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    n=sc.nextInt();
    int firstorder=n;
    while(n!=0){
      reminder=n%10;
      order=order*10+reminder;
      n=n/10;
    }
    if(order==firstorder){
      System.out.println("given number is polindrom");
    }
    else{
      System.out.println("given number is not a polindrom");
    }
  }
}