 //Write a JAVA program to search all occurrences of a character in given string.
class Allocuurance
  {
    public static void main(String args[])
    {
    String str="sai is a good boy";
      int count=0;
      int i=0;
      char ch='o';
      for(;i<str.length();i++)
        {
          if(str.charAt(i)==ch)
          {
            count++;
          }
        }
      System.out.println(count);
    }
  }