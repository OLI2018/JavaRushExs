package AbstractClass;

// Java Core,  3 уровень,  4 лекция
// Большая лисица — это такая лисица

import java.awt.*;

public class Abstract09 {

  public static void main (String[] args) throws Exception {

    Fox bigFox = new BigFox();

    System.out.println(bigFox.getName());
    System.out.println(bigFox.getColor());

  }

  public interface Animal {
    Color getColor();
  }

  public static abstract class Fox implements Animal {
    public String getName() {
      return "Fox";
    }
  }

  public static class BigFox extends Fox {

    @Override
    public Color getColor() {
      return Color.GRAY;
    }
  }
}



