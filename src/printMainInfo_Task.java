// Java Core,  4 уровень,  8 лекция
// Реализовать метод printMainInfo

public class printMainInfo_Task {

  public static void main(String[] args) {

    Object obj = new Circle();
    Movable movable = (Movable) obj;
    Drawable drawable = new Rectangle();

    printMainInfo(drawable);
    printMainInfo(movable);
  }

  public static void printMainInfo(Object object) {

    if (object instanceof Drawable) {
      ((Drawable) object).draw();
    }

    if (object instanceof Movable) {
      ((Movable) object).move();
    }
  }

  static interface Movable {

    void move();
  }

  static class Circle implements Movable {

    public void draw() {
      System.out.println("Can be drawn");
    }

    public void move() {
      System.out.println("Can be moved");
    }

  }

  static interface Drawable {
    void draw();
  }

  static class Rectangle implements Drawable {
    public void draw() {
      System.out.println("Can be drawn");
    }

    public void move() {
      System.out.println("Can be moved");
    }
  }
}


