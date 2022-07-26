
//throws
    import java.util.*;
class InvalidAgeException extends Exception
  {
    public InvalidAgeException(String msg)
    {
      super(msg);
    }
  }
class Throws {
  public static void age(int age)throws InvalidAgeException
  {
    if(age>18)
    {
      System.out.println("Person is elegible");
    }
    else
    {
     throw new InvalidAgeException("Person is not eligible");
    }
  }
  public static void main(String args[]) {
    
    try { 
      age(12);
    }
    catch (InvalidAgeException obj) {
      System.out.println(obj);
    }
    
    finally
    {
      System.out.println("Finally block executed always");
    }
    System.out.println("exception handled");
  }
}