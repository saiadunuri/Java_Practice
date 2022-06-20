import java.util.*;
class Max2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter second number");
    int b=sc.nextInt();
    if(a>b){
      System.out.println("highest number is "+a);
    }
    else{
      System.out.println("highest number is "+b);
    }
  }
  
}