import java.util.*;
class Product
  {
    String pname;
    int pid;
    Product(String pname, int pid)
    {
      this.pname=pname;
      this.pid=pid;
    }
    void display()
    {
      System.out.println("product name: "+pname+" product id: "+pid);
    }
  }
class Con
  {
     public static void main(String args[])
    {
      Product pr[]=new Product[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter product information");
      for(int i=0;i<3;i++)
        {
          System.out.println("enter product id");
          int pid=sc.nextInt();
          System.out.println("enter product name");
          String pname=sc.next();
          pr[i]=new Product(pname, pid);
        }
      for(int i=0;i<3;i++)
        {
          pr[i].display();
        }
    }
  }