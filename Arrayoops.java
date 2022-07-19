import java.util.*;
class Product
  {
    String pname;
    int pid;
    void display()
    {
      System.out.println("product name: "+pname+" product id: "+pid);
    }
  }
class Array
  {
     public static void main(String args[])
    {
      Product pr[]=new Product[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++)
        {
          System.out.println("enter product information");
          pr[i]=new Product();
          System.out.println("enter product id");
          pr[i].pid=sc.nextInt();
          System.out.println("enter product name");
          pr[i].pname=sc.next();
        }
      for(int i=0;i<3;i++)
        {
          pr[i].display();
        }
    }
  }