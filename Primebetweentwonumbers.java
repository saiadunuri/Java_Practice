//find prime number between 2 numbers
import java.util.*;
class Primebetweentwonumbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    int a=sc.nextInt();
    System.out.println("enter b value");
    int b=sc.nextInt();
    for(int i=a;i<=b;i++)
    {
      int count=0;
      for(int j=1;j<=i/2;j++){
      if(i%j==0){
        count++;
    }   
    }
    if(count<=1)
    {
      System.out.println(i);
    }
    }       
  }
}
//
  