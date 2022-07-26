    import java.util.*;
class Throw {
  public static void blood(int age)
  {
    if(age>18)
    {
      System.out.println("Person is elegible");
    }
    else
    {
      throw new ArithmeticException("Person is not eligible");
    }
  }
  public static void main(String args[]) {
    try {
      blood(17);
    }
    catch (Exception obj) {
      System.out.println(obj);
    }
    finally
    {
      System.out.println("sai is a good boy");
    }
  }
}