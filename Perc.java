import java.util.*;
class Perc
  {
    public static void main(String args[])
    {
      double a,b,c,d,e,maximum;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the marks");
      a=sc.nextDouble();
      b=sc.nextDouble();
      c=sc.nextDouble();
      d=sc.nextDouble();
      e=sc.nextDouble();
      System.out.println("enter maximum marks");
      maximum=sc.nextDouble();
      double total=a+b+c+d+e;
      System.out.println("total marks"+total);
      double percentage=(total/maximum)*100;
      System.out.println("percentage is"+percentage);
      int newpercentage=(int)percentage;
      if(newpercentage>90)
      {
        System.out.println("the grade is a");
      }
      else if(newpercentage<90&&newpercentage>80)
      {
        System.out.println("the grade is b");
      }
      else if(newpercentage<80&&newpercentage>70)
      {
        System.out.println("the grade is c");
      }
      else if(newpercentage<70&&newpercentage>60)
      {
        System.out.println("the grade is d");
      }
      else
      {
        System.out.println("fail");
      }
        
    }
  }