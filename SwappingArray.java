import java.util.*;
class Swapping{
  public static void main(String args[]){
    int n, i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter Array size");
    n=sc.nextInt();
    System.out.println("enter elements");
    int a[]=new int[n];
    for( i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    int temp=a[3];
    a[3]=a[4];
    a[4]=temp;
    System.out.println("new elements are");
    for(i=0;i<n;i++){
      System.out.println(a[i]);
    }
    
  }
}