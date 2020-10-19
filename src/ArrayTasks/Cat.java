package ArrayTasks;
import java.util.ArrayList;

public class Cat {

  private String name;

  public Cat (String name) {
    this.name = name;
  }

  public static void main(String[] args) {

    ArrayList<Cat> list =  new ArrayList<>();

    Cat x01 = new Cat("Thomas");
    Cat x02 = new Cat("Moscow");
    Cat x03 = new Cat("Seattle");
    Cat x04 = new Cat("Вечно молодой и вечно пьяный");

    System.out.println(list);

    list.add(x01);
    list.add(x02);
    list.add(x03);
    list.add(x04);

    System.out.println(list);
    int moscowIndex = list.indexOf(x02);
    System.out.println(moscowIndex);

  }

  public String toString() {
    return name;
  }
}
