//print even numbers between 2 numbers
import java.util.*;
class Evenloop{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter start number");
    int a=sc.nextInt();
    System.out.println("enter end number");
    int b=sc.nextInt();
    for(int i=a;i<=b;i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
  }
}