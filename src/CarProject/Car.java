package CarProject;

public class Car {

  String model;
  int maxSpeed;

  public static void main(String[] args) {

    Car car1 = new Car();
    car1.model = "Ferrari ";
    car1.maxSpeed = 300;

    Car car2 = new Car();
    car2.model = "Ferrari ";
    car2.maxSpeed = 300;

    System.out.println(car1 == car2);

  }
}


