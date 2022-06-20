import java.util.*;
class alphabetordigitorspeacialchar{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    char c=sc.next().charAt(0);
    if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
      System.out.println(c+ " is a alphabet");
    }
    else if(c>=0&&c<=9){
        System.out.print("given value is a digit");
      }
    else{
      System.out.println(c+" is a special charater");
    }
  }
  
}