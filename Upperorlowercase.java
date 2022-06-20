import java.util.*;
class Upperorlowercase{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a charcter");
    char c=sc.next().charAt(0);
    if(c>='a'&&c<='z'){
      System.out.println(c+ " is a lower case");
    }
    else if(c>='A'&&c<='Z'){
      System.out.println(c+" is a upper case");
    }
    else{
      System.out.println("invalid input");
    }
  }
  
}