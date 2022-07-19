//Write a JAVA program to find length of a string and compare and concatenate two strings.
class Compare
  {
    public static void main(String args[])
    {
      String str1="hello";
      String str2="world";
      System.out.println("length of a string is: "+str1.length());
      System.out.println(str1.compareTo(str2));
      String str3=str1.concat(" "+str2);
      System.out.println(str3);
    }
  }