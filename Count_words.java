//Write a JAVA program to count total number of words in a string.
class Count_words
  {
    public static void main(String args[])
    {
      String str="Sai is a good boy";
      String words[]=str.split(" ");
      System.out.println("no. of words in given string is: "+words.length);
    }
  }