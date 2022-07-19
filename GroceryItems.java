/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {

//Define the main method
public static void main(String args[]){
//Declare and initialize variables
  int i,n;
//Take the 10 different expenses price
  Scanner sc=new Scanner(System.in);
  System.out.println("enter array size");
  n=sc.nextInt();
  float arr[]=new float[n];
  System.out.println("enter grocery prices");
//Check the 10 different expenses price using for loop
 for(i=0;i<n;i++)
   {
     arr[i]=sc.nextFloat();
   }
//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
float max=0;
  for(i=0;i<n;i++){
    if(max<arr[i]){
      max=arr[i];
    }
  }
//Print the result
System.out.println("The highest price you incurred is "+max);
}
}
