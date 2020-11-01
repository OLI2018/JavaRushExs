package Encapsulation.Cats_01;

public class CatsAllOneCat {

  private String name01;
  private int age01;
  private int weight01;

  public  CatsAllOneCat()
  {

  }

  public CatsAllOneCat (String name01,
                        int age01,
                        int weight01)
  {
    this.name01 = name01;
    this.age01 = age01;
    this.weight01 = weight01;
  }

  public String toString(){
    return name01 + " " + age01 + " " + weight01;
  }

}
