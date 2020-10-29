package DefaultMethods;

public class AllCarsMain {

  public static void main(String[] args) {

    SportCar sportCar =  new SportCar();
    Sedan sedan = new Sedan();
    Truck truck = new Truck();

    sportCar.gas();
    sportCar.brake();

    sedan.gas();
    sedan.brake();

    truck.gas();
    truck.brake();

    SuperCar superCar = new SuperCar();
    superCar.gas();
    superCar.brake();

  }
}
