package InterfaceTasks;

// Level 2, lecture 9, Создаем человека

public class FlyRunSwimHuman {

  public static void main(String[] args) {

  }

  public interface CanFly {
    public void fly();
  }

  public interface CanRun {
    public void run();
  }

  public interface CanSwim {
    public void  swim();
  }


  public class Human implements CanRun, CanSwim {
    public void run(){
      System.out.println("run");
    }
    public void swim(){
      System.out.println("swim");
    }

  }

  public class Duck implements CanFly, CanSwim, CanRun {
    public void fly(){
      System.out.println("fly");
    }
    public void swim(){
      System.out.println("swim");
    }

    public void run(){
      System.out.println("run");
    }

  }

  public abstract class Penguin implements CanSwim, CanRun {
    public void swim()
    {
      System.out.println("swim");
    }

  }

  public abstract class Airplane implements CanFly, CanRun {
    public void fly(){
      System.out.println("fly");
    }

  }
}
