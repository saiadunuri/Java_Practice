import java.util.*;
class Divbynumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int a=sc.nextInt();
    if(a%5==0||a%11==0){
      if(a%5==0&&a%11!=0){
        System.out.println(a+" is divisible by 5 but not divisible by11");
      }
      if(a%5!=0&&a%11==0){
        System.out.println(a+" is divisible by 11 but not divisible by 5");
    }
    }
    else{
      System.out.println(a+" is not divisible by 5 and 11");
    }
  }
  
}