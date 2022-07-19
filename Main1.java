
class Main1
  {
    public static void prime(int n)
    {
      int count=0;
      if(n==0)
      {
        System.out.println(n+" is a prime number");
      }
      else if(n==1)
      {
        System.out.println(n+" is a prime number");
      }
      else
      {
        for(int i=1;i<=n;i++)
          {
            if(n%i==0){
              count++;
          }
      }
         if(count==1)
         {
          System.out.println(n+"is a prime number");
         }
    }
    }
      public static void main(String args[])
        {
        Main.prime(10);
        }
    
  }