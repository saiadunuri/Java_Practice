//find duplicate numbers in array
import java.util.*;
class Frequency
{ 
    public static void main(String[] args)
    {    
       int count;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter array size");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter elements");
       for(int i=0;i<n;i++)
       {
          arr[i]=sc.nextInt();
       }
      System.out.println("frequency of numbers");
      for(int i = 0; i < arr.length; i++) 
      { 
        count=1;
       for(int j = i + 1; j < arr.length; j++)
         {  
                if(arr[i] == arr[j])
                {
                  count++;
                }
          }
        System.out.println(arr[i]+"-"+count);
      } 
    }
}

