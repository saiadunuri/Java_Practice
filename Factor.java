//find the factors of given number
import java.util.*;
class Factor{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    int a=sc.nextInt();
    for(int i=1;i<=a;i++){
      if(a%i==0){
    System.out.println(i);
    }
    }
    
  }
}
//