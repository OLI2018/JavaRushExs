package InitializationTasks;

// Java Core,  5 уровень,  9 лекция
// Статики и котики

public class Initialization_05 {

  public static Cat cat;

  static
  {
    cat = new Cat();
    cat.name = "Cat's Name";
    System.out.println(cat.name);
  }


  public static void main(String[] args) {

  }

  public static class Cat {
    public String name;
  }
}



