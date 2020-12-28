package Initialization;

public class Initialization02 {

  public static void main(String[] args) {

    Dog dog = new Dog("Brave", "dog", 7);
  }

  public static class Dog {

    private String name;
    private String breed;
    private int age;

    {
      System.out.println("Это не статический блок инициализации");
    }

    public Dog(String name, String breed, int age) {
      this.name = name;
      this.breed = breed;
      this.age = age;
    }
  }

}
