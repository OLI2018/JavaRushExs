package DefaultMethods;

public interface  Car {

  default void gas() {
    System.out.println("Gas");
  }
  default void brake() {
    System.out.println("Break");
  }
}

class  Sedan implements Car {
  }

  class  Truck implements Car{

  }

  class  SportCar implements Car {

}

class  SuperCar implements Car{
  @Override
  public void gas() {
    System.out.println("Don't gas");
  }

  @Override
  public void brake() {
    System.out.println("Don't break!!!");

  }
}
