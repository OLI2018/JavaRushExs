package Initialization;

public class CRadius {

  // скрытые переменные
  private double Pi = 3.1415;
  private double radius = 1;

  // общедоступные переменные
  public double len = Length(radius); // инициализация переменной len методом Length()
  public double area = Area(radius); // инициализация переменной area методом Area()
  public double volume = Volume(radius); // инициализация переменной volume методом Volume()

  // методы вычисления
  double Length(double r)
  {
    return 2*Pi*r;
  }

  double Area(double r)

  {
    return Pi*r*r;
  }
  double Volume(double r)
   {
     return 4.0/3.0*Pi*r*r*r;
   }

  public static void main(String[] args)
  {
    // демонстрация инициализации методами класса CRadius
    CRadius r1 = new CRadius(); // происходит явная инициализация членов данных объекта r1
    double l, a, v;

    l = r1.len; // l = 6.283;
    a = r1.area; // a = 3.1415
    v = r1.volume; // v = 4.1886666666
  }
}
