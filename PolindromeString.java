class Polindrome
  {
    public static void main(String args[])
    {
      String rev="";
      String str="asasasasasa";
      for(int i=str.length()-1;i>=0;i--)
        {
          rev+=str.charAt(i);
        }
      if(str.equals(rev))
      {
        System.out.println("given string is a polindrome");
      }
      else
      {
        System.out.println("given string is not a polindrome");
      }
    }
  }