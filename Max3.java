import java.util.*;
class Max3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter second number");
    int b=sc.nextInt();
    System.out.println("enter second number");
    int c=sc.nextInt();
    if(a>b&&a>c){
      System.out.println("highest number is "+a);
    }
    else if(b>c&&b>a){
      System.out.println("highest number is "+b);
    }
    else {
      System.out.println("highest number is "+c);
    }
  }
  
}