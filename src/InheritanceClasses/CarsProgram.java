package InheritanceClasses;

public class CarsProgram {

  public static class CarTemplate {

    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public CarTemplate(String model, int maxSpeed, int yearOfManufacture) {
      this.model = model;
      this.maxSpeed = maxSpeed;
      this.yearOfManufacture = yearOfManufacture;
    }

    public void gas() {
      System.out.println("gas");
    }

    public void brake() {
      System.out.println("brake");
    }
  }

  public static class Truck extends CarTemplate {

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
      super(model, maxSpeed, yearOfManufacture);
    }
  }

  public static class Sedan extends CarTemplate {
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
      super(model, maxSpeed, yearOfManufacture);
    }
  }

   public static void main(String[] args) {

    Truck truck = new Truck("SuperTruck", 250, 2020);
     System.out.println(truck instanceof CarTemplate);
     System.out.println(truck instanceof Truck);

     Sedan sedan = new Sedan("Low", 120, 2020);
     System.out.println(sedan instanceof CarTemplate);

     CarTemplate carTemplate = new CarTemplate("Orion", 456, 2020);
     System.out.println(carTemplate instanceof Truck);
     System.out.println(carTemplate instanceof Sedan);
     System.out.println(carTemplate instanceof Object);

  }
}
