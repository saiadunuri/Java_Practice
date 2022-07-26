//multiple catch block
    import java.util.*;
class Multiplecatch {
  public static void main(String args[]) {
    System.out.println("hello");
    String name = "sai123";
    try {
      System.out.println(Integer.parseInt(name));
      System.out.println(5/0);
    }
    catch (NullPointerException obj) {
      System.out.println(obj);
    }
    catch(NumberFormatException e)
      {
        System.out.println(e);
      }
    finally
    {
      System.out.println("Finally block executed always");
    }
    System.out.println("hello");
  }
}