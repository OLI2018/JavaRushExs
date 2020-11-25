package InterfaceTasks;

// Level 2, lecture 9, Класс Human и интерфейсы CanRun, CanSwim


public class HumanCanDoThings {

  public static void main(String[] args) {

  }

  public interface CanRun{
    void run();
  }

  public interface  CanSwim{
    void swim();
  }

  public abstract class Human implements CanRun, CanSwim {

  }
}

