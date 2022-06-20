import java.util.*;
class EvenorAdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    if(a%2==0){
      if(a==0){
        System.out.println("given value is zero");
      }
      else{
        System.out.println(a+" is a even number");
      } 
    }
    else{
      System.out.println(a+" is a add number");
    }
  }
  
}