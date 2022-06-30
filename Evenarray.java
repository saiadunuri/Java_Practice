 import java.util.*;
class Even
  {
    public static void main(String args[])
    {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
      n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    
      System.out.println("enter array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Even elements are");
      for(int i=0;i<n;i++)
        {
          if(a[i]%2==0){
            b[i]=a[i];
            System.out.println(b[i]);
        }
    }
  }
  }