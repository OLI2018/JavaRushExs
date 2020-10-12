package AbstractClass;

public class Abstract04 {

  public static void main(String[] args) {

  }

  public static abstract class Animal {
    public abstract String getName();
  }

  public static class Cow extends Animal {

    public String getName(){
      return "any name";
    }
  }

}


