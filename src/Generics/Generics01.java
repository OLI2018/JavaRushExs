package Generics;
import java.util.ArrayList;

public class Generics01 {

  public static void main(String[] args) {

    Dog dog = new Dog();

    ArrayList<String> str = new ArrayList <String>();

    String str01 = "Mike";
    String str02 = "Paris";
    String str03 = "Dog";

    int num01 = 10;
    int num02 = 20;
    int num03 = 20;

    str.add(str01);
    str.add(str02);
    str.add(str03);
//    str.add(num01);

    System.out.println(str);

    ArrayList list = new ArrayList();

    list.add(str01);
    list.add(str02);
    list.add(str03);
    list.add(num01);
    list.add(num02);
    list.add(num03);
    list.add(dog);


    System.out.println(list);

  }

  static public class Dog {

  }

}
