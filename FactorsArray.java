import java.util.*;
class Factors
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
      for(int i=0;i<n;i++)
        {
       for(int j=1;j<a[i];j++)
       if(a[i]%j==0)
       {
       b[i]=j;
         System.out.print(b[i]+",");
      }
      System.out.println("");
      }
      }
  }