package InterfaceTasks;

// Level 2, lecture 9, Есть, летать и двигаться

public class FlyMoreEat {

  public static void main(String[] args) {

  }

  public interface  CanFly {
    public void fly();
  }

  public interface CanMove {
    public void move();
  }

  public interface CanEat {
    public void eat();
  }

  public class Dog implements CanMove, CanEat {


    public void move(){
      System.out.println("CanMove");
    }

    public void eat(){
      System.out.println("CanEat");
    }

  }

  public class Duck implements CanMove, CanFly, CanEat {
    public void move(){
      System.out.println("CanMove");
    }
    public void fly(){
      System.out.println("CanFly");
    }
    public void eat(){
      System.out.println("CanEat");
    }
  }

  public class Car implements CanMove {
    public void move(){
      System.out.println("CanMove");
    }
  }

  public abstract class Airplane implements CanMove, CanFly {
  }
}