package Exception;

import java.io.IOException;
import java.rmi.RemoteException;

public class TryCatch10 {

  public static void main(String[] args) {

    handleExceptions(new TryCatch10());

  }

  public static void handleExceptions(TryCatch10 obj) {

    try  {
      obj.method1();
      obj.method2();
      obj.method3();

    } catch (Exception e) {

      System.out.println(e);
    }
  }




  public void method1() throws IOException {
    throw new IOException();
  }

  public void method2() throws NoSuchFieldException {
    throw new NoSuchFieldException();
  }

  public void method3() throws RemoteException {
    throw new RemoteException();
  }
}
