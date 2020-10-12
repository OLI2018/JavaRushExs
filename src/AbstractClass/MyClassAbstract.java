package AbstractClass;

public abstract class MyClassAbstract {

  abstract void print ();

  abstract void printAll();

  public static void pritnPageNumber (int x, int y){
    System.out.println(x + y);
  }
}

class Doc extends MyClassAbstract {

  @Override
  void print() {
    System.out.println("Text");
  }

  @Override
  void printAll() {
    System.out.println("Page Number");
  }
}
