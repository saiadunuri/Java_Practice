/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{

//Define the main method
  public static void main(String args[])
  {
//Declare the variables and initialize
    int n,a=0;
//Take temperature of 7 days as a input from user
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of days");
    n=sc.nextInt();
    float arr[]=new float[n];
    for(int i=0;i<n;i++)
      {
        System.out.println("Enter the temperature of Day :"+(i+1));
        arr[i]=sc.nextFloat();
      }
    //Calculate the lowest temperature
    Float lowest_tempurature=arr[0];
    for(int i=0;i<n;i++)
      {
        if(arr[
           i]<lowest_tempurature)
        {
          lowest_tempurature=arr[i];
          a=i+1;
        }
      }
//Print the result
    System.out.println("The lowest temperature of the week "+ a + " is "+lowest_tempurature+ "celsius");
  }
}