//Write a JAVA program to find first and last digit of a number.
import java.util.*;
class firstandlastdigit{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    n=sc.nextInt();
    int lastdigit=n%10;
    while(n>10){
      n=n/10;
    }
    System.out.println("last digit of number is "+lastdigit);
    System.out.println("first digit of number is "+n);
  }
}