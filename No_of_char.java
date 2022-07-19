//Write a JAVA program to find total number of alphabets, digits or special character in a string.
class No_of_char
  {
    public static void main(String args[])
    {
      String str="Sai@123";
      int a=0, d=0, s=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
          {
            a++;
          }
          else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
          {
            d++;
          }
          else
          {
            s++;
          }
        }
      System.out.println("no. of alphabets in given string is: "+a);
      System.out.println("no. of digits in given string is: "+d);
      System.out.println("no. of special characters in given string is: "+s);
    }
  }