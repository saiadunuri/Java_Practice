import java.util.*;
class Alphabetornot{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a charcter");
    char c=sc.next().charAt(0);
    if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
      System.out.println(c+ " is a alphabet");
    }
    else{
      System.out.println(c+" is not a alphabet");
    }
  }
  
}