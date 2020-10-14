package ArrayListExs;

public class Family {

  public static void main(String[] args) {

    Human one = new Human("Tom", true, 34);
    Human two = new Human (null,false, 12);
    Human three = new Human ("Kate", false, 45);
    Human four = new Human (null, true, 1);

    Human five = new Human ("Mary", false, 67, one, two );
    Human six = new Human ("Mary", false, 67, three, four );
    Human seven = new Human ("Mary", false, 67, null, null );
    Human eight = new Human ("Mary", true, 67, one, null );
    Human nine = new Human (null, true, 67, one, null );

    System.out.println(one);
    System.out.println(two);
    System.out.println(three);
    System.out.println(four);
    System.out.println(five);
    System.out.println(six);
    System.out.println(seven);
    System.out.println(eight);
    System.out.println(nine);

  }

  public static class Human {

    private String name;
    private boolean sex;
    private int age;
    Human father;
    Human mother;

    public Human (String name, boolean sex, int age) {
      this.name = name;
      this.sex = sex;
      this.age = age;
    }

    public Human (String name, boolean sex, int age, Human father, Human mother) {
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.father = father;
      this.mother = mother;
    }


    public String toString() {
      String text = "";
      text += "Имя: " + this.name;
      text += ", пол: " + (this.sex ? "мужской" : "женский");
      text += ", возраст: " + this.age;

      if (this.father != null) {
        text += ", отец: " + this.father.name;
      }

      if (this.mother != null) {
        text += ", мать: " + this.mother.name;
      }

      return text;
    }
  }
}
