package AbstractClass;

// Java Core,  3 уровень,  4 лекция
// Лисица — это такое животное

import java.awt.*;

public class Abstract08 {

  public static void main (String[] args) throws Exception {
  }

  public interface Animal {
    Color getColor();
  }

  public static abstract class Fox implements  Animal{
    public String getName() {
      return "Fox";
    }

  }
}




