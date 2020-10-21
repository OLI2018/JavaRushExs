package CastingRef;

public class RefType04 {

  public static void main(String[] args) {

    Object o = 123;
    Integer str = (Integer) o;

    System.out.println(str);
  }
}
