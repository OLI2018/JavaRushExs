package ArrayListExs;

import java.util.ArrayList;

public class ArrayListFamily {

  public static void main(String[] args) {

    ArrayList<Human> noKids = new ArrayList<>();

    Human child01 = new Human("Anna", true, 12, noKids);
    Human child02 = new Human("Alex", false, 23,noKids);
    Human child03 = new Human("Aldo", true, 3,noKids);

    ArrayList<Human> allChildren01 = new ArrayList<>();
    allChildren01.add(child01);
    allChildren01.add(child02);
    allChildren01.add(child03);

    Human dad = new Human("Tom", true, 34, allChildren01);
    Human mom = new Human("Marta", false, 23, allChildren01);

    ArrayList<Human> allChildren02 = new ArrayList<>();
    allChildren02.add(dad);

    ArrayList<Human> allChildren03 = new ArrayList<>();
    allChildren03.add(mom);

    Human grandPa01 = new Human("Oleg", true, 55,allChildren02);
    Human grandPa02 = new Human("Leo", false, 4,allChildren02);
    Human grandMa01 = new Human("Kate", true, 67,allChildren03);
    Human grandMa02 = new Human("Jessica", false, 80,allChildren03);

    System.out.println(child01);
    System.out.println(child02);
    System.out.println(child03);
    System.out.println(dad);
    System.out.println(mom);
    System.out.println(grandPa01);
    System.out.println(grandPa02);
    System.out.println(grandMa01);
    System.out.println(grandMa02);

  }

  public static class Human {

    String name;
    boolean sex;
    int age;
    ArrayList<Human> children;

    public Human (String name, boolean sex, int age, ArrayList<Human> children) {
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.children = children;
    }

    public String toString() {
      String text = "";
      text += "Имя: " + this.name;
      text += ", пол: " + (this.sex ? "мужской" : "женский");
      text += ", возраст: " + this.age;

      int childCount = this.children.size();
      if (childCount > 0) {
        text += ", дети: " + this.children.get(0).name;

        for (int i = 1; i < childCount; i++) {
          Human child = this.children.get(i);
          text += ", " + child.name;
        }
      }
      return text;
    }
  }
}
