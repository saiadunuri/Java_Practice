//Write a program to find given number armstrong or not.
//123=1^3+5^3+3^3=123
import java.util.*;
class Armbetweengiven
{
  public static void main(String args[]){
    int n, reminder, a, b, temp=0, count=0, sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter start number");
    a=sc.nextInt();
    System.out.println("enter end number");
    b=sc.nextInt();
    for(int i=a;i<=b;i++){
       temp=i;
      count=0;
      while(temp>0){
        temp=temp/10;
        count++;
      }
    n=i;
     sum=0;
    while(n>0){
      reminder=n%10;
      sum+=Math.pow(reminder,count);
      n=n/10;
    }
    if(sum==i){
      System.out.println(i+" is a armstrong number");
    }
    }
  }
}