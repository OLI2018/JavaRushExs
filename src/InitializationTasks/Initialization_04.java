package InitializationTasks;

// Статики и исключения
// Java Core,  5 уровень,  9 лекция

public class Initialization_04 {

  public static int A = 0;

    static {

      if (true)throw new ExceptionInInitializerError();

    }

  public static int B = 5;

  public static void main(String[] args) {
    System.out.println(B);
  }
}



