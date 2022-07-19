[12:54 PM] Lalitha Ujjaneni
    import java.util.*;
class Main
  {
    //create the method
   public static void insertion(int n,int[] arr,int pos,int ele)
    {
    
      for(int i=n;i>=(pos-1);i--)
        {
          arr[i+1]=arr[i];
    
        }
      arr[pos-1]=ele;
      for(int i=0;i<6;i++)
        {
          System.out.println(arr[i]);
        }
      
    }
    public static void main(String args[]){​
       int arr[]=new int[100];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
        {
          arr[i]=sc.nextInt();
        }
      
       insertion(50,arr,2,22);
        
      
    }
    
  }
