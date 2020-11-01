package Encapsulation.Cats02;

public class Cats_02 {

    private  String name_02;
    private int age_02;
    private int weight_02;

    public Cats_02(String name_02,
                   int age_02,
                   int weight_02) {
      this.name_02 = name_02;
      this.age_02 = age_02;
      this.weight_02 = weight_02;
    }

    public String getName() {
      return name_02;
    }

    private void setName(String name_02) {
      this.name_02 = name_02;
    }

    public int getAge() {
      return age_02;
    }

    private void setAge(int age_02) {
      this.age_02 = age_02;
    }

    public String toString()
    {
      return name_02 + " " + age_02 + " " + weight_02;
    }
  }

