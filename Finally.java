//finally
class Finally {
  public static void main(String args[]) {
    System.out.println("before exception");
    String name = "sai123";
    try {
      System.out.println(Integer.parseInt(name));
    }
    catch (NullPointerException obj) {
      System.out.println(obj);
    }
    finally
    {
      System.out.println("this will execute even exception not handled");
    }
    System.out.println("after exception");
    System.out.println("no exception/exception handled");
  }
}