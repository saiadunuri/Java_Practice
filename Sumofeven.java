import java.util.*;
class Sumofeven{
  public static void main(String args[]){
    int i,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value");
    int n=sc.nextInt();
    for(i=1; i<=n; i++){
      if(i%2==0){
        System.out.println(i);
        sum=sum+i;
      }
    }
    System.out.println("sum of even numbers from 1 to "+n+" is "+sum);
  }
}
  
