package InstanceOf;

public class Instanceof01 {

  public static void main(String[] args) {

    Object object =  new Integer(10);
    boolean isInt = object instanceof Integer;

    System.out.println(isInt);
  }
}
