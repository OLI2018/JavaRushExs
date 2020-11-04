package Exception;

public class TryCatch03 {

  public static void main(String[] args) {
    System.out.println("Program starts here");

    try
    {
      System.out.println("Before method1 calling");
      method1();
      System.out.println ("After method1 calling. Never will be shown");
    }
    catch (Exception e)
    {
      System.out.println("Exception has been caught");
    }

    finally {
      System.out.println("No matter what I am still here");
    }

    System.out.println("Program is still running");
  }

  public static void method1()
  {
    int a = 100;
    int b = 2;
    System.out.println(a / b);
  }
}
