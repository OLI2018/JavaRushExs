package InheritanceClasses;

public class InherProgram {

  public class Room {

    int numberOfrooms;
    String nameOfRoom;

    public void setNameOfRoom() {
      System.out.println("Super Cool");
    }
  }

  class LivingRoom extends Room {


  }

  class DiningRoom extends Room {

  }


  public static void main(String[] args) {

  }
}
