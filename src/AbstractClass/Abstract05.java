package AbstractClass;

public class Abstract05 {

  public static void main(String[] args) {

  }

  public static abstract class Pet {
    public abstract String getName();

    public abstract Pet getChild();
  }

  public static class Cat extends Pet {

    public String getName(){
      return "any name";
    }

    public Pet getChild(){

      return null;

    }

  }

  public static class Dog extends Pet {

    public String getName()
    {
      return "any name";
    }

    public Pet getChild(){

      return null;

    }

  }

}


