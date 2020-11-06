package Exception;

import java.io.FileNotFoundException;

public class TryCatch12 {

  public static void main(String[] args) {
  }

  static class MyException  extends NoSuchFieldException {
  }

  static class MyException2  extends FileNotFoundException {
  }

  static class MyException3 extends ArithmeticException{
  }

  static class MyException4 extends IndexOutOfBoundsException{
  }
}


