import java.util.*;
class Vowelornot{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a charcter");
    char ch=sc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch =='i'||ch =='o'||ch=='u'||ch=='A'||ch =='E'||ch=='I'||ch=='O'||ch =='U' )
{
      System.out.println(ch+ " is a vowel");
    }
    else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
      System.out.println(ch+" is a contstant");
    }
    else{
      System.out.println("invalid input");
    }
  }
  
}