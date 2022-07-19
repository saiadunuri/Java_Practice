//converts lower case to upper case and lower case to upper case.
class Convertcase
  {
    public static void main(String args[])
    {
      String str="sAI aDUNURI 123";
      char strarr[]=str.toCharArray();
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='a'&&str.charAt(i)<='z')
          {
            strarr[i]=(char)((int)strarr[i]-32);
          }
          else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
          {
            strarr[i]=(char)((int)strarr[i]+32);
          }
        }
      System.out.println(strarr);
    }
  }