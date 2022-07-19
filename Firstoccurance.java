//Write a JAVA program to find first occurrence of a character in a given string.
class Firstoccurance
  {
    public static void main(String args[])
    {
      int i,count=0;
      String str="sai is a good boy";
      char check='s';
      for(i=0;i<str.length();i++)
        {
          if(str.charAt(i)==check)
          {
            count++;
            if(count==1)
            {
              break;
            }
          }
        }
      if(count==0)
      {
        System.out.println("not found");
      }
      else{
        System.out.println("first occurance of "+check+" at index value "+i);
      }
    }
  }
