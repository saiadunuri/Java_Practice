//two dimentional array
    import java.util.*;
class Even_2dimen
  {
    public static void main(String args[])
    {
       int row,col;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row size");
      row=sc.nextInt();
      System.out.println("Enter col size");
      col=sc.nextInt();
      System.out.println("enter elements");
      //declare
      int[][]  arr=new int[row][col];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("************* 2 Dimenssion************");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              if((arr[i][j])%2==0){
                System.out.print(arr[i][j]+" ");
              }
            }
          System.out.println();
        }
    }
  }
