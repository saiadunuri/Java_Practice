//exception handling using try and catch
    import java.util.*;
class Try {
  public static void main(String args[]) {
    System.out.println("sai is a good boy");
    String name = "sai502";
    try {
      System.out.println(Integer.parseInt(name));
    }
    catch (Exception obj) {
      System.out.println(obj);
    }
  }
}