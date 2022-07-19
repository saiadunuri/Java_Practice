/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/
import java.util.*;
public class DiamondPattern {

//Add main method here
public static void main(String args[]){
//Declare variables i,j,k,m and initialize ch=97(because we are printing alpha
  int i, j;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a value");
  int n=sc.nextInt();
  for(i=1;i<=n;i++)
    		{
        		for(j=i;j<n;j++)
        		{
            			System.out.print(" ");
        		}
        		for(j=1;j<=(2*i-1);j++)
        		{
              if((i+j)%2==1){
                System.out.print("a");
              }
              else if(j==3){
                System.out.print("c");
              }
              else{
                System.out.print("b");
              }
        		}
        		System.out.println("");
    		}	
		for(i=n;i>=1;i--)
    		{
        		for(j=i;j<=n;j++)
        		{
            			System.out.print(" ");
        		}
        		for(j=2;j<(2*i-1);j++)
        		{
              if((i+j)%2==0){
                System.out.print("b");
              }
              else{
                System.out.print("a");
              }
        		}
        		System.out.println(" ");
}
}
}