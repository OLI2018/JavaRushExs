package InterfaceTasks;

// 3 уровень, 6 лекция
// Том, Джерри и Спайк

public class TomJerry {

  public static void main(String[] args) {
  }
  public interface Movable {
    void move();
  }
  public interface Edible {
    void beEaten();
  }
  public interface Eat {
    void eat();
  }

  public class Dog implements  Movable, Eat {

    @Override
    public void move() {
      System.out.println("move");
    }

    @Override
    public void eat() {
      System.out.println("eat");
    }
  }

  public class Cat implements Movable, Edible, Eat {

    @Override
    public void move() {
      System.out.println("move");
    }

    @Override
    public void beEaten() {
      System.out.println("beEaten");
    }

    @Override
    public void eat() {
      System.out.println("eat");
    }
  }

  public class Mouse implements Movable, Edible{

    @Override
    public void move() {
      System.out.println("move");
    }

    @Override
    public void beEaten() {
      System.out.println("beEaten");
    }
  }
}


