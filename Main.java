class Main
  {
    public static void fact(int n)
    {
      int fact=1;
      if(n==0)
      {
        fact=0; 
        System.out.println(fact);
      }
      else if(n==1)
      {
        fact=1;
        System.out.println(fact);
      }
      else
      {
        for(int i=1;i<=n;i++)
          {
            if(n%i==0){

            
          }
        System.out.println(fact);
      }
    }
      public static void main(String args[])
        {
        Main.fact(10);
        }
    
  }
  }