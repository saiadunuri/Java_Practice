//Write a program to find given number armstrong or not.
//123=1!+2!+3!
import java.util.*;
class Strong{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value");
    int n=sc.nextInt();
    int input=n ;
    int fact, sum=0;
    while(n>0)
    {
     int reminder=n%10;
      fact=1;
      int j=1;
    while(j<=reminder)
      {
        //3!=1*2*3
        fact=fact*j;
        j++;
    }
      sum=sum+fact;
      n=n/10;
    }
    n=input;
    if(sum==n){
      System.out.println("given number is Strong number");
    }
    else{
      System.out.println("given number is not a Strong number");
    }
  }
}
//}