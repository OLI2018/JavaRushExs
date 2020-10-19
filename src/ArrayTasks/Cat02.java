package ArrayTasks;

import java.util.ArrayList;

public class Cat02 {

  private String name;

  public Cat02 (String name) {
    this.name = name;
  }

  public static void main(String[] args) {

    ArrayList<Cat02> list =  new ArrayList<>();

    ArrayTasks.Cat02 x01 = new ArrayTasks.Cat02("Thomas");
    ArrayTasks.Cat02 x02 = new ArrayTasks.Cat02("Moscow");
    ArrayTasks.Cat02 x03 = new ArrayTasks.Cat02("Seattle");
    ArrayTasks.Cat02 x04 = new ArrayTasks.Cat02("Вечно молодой и вечно пьяный");

    ArrayTasks.Cat02 x05 = new ArrayTasks.Cat02("NewObject");
    ArrayTasks.Cat02 x06 = new ArrayTasks.Cat02("NewObject02");

    list.add(x01);
    list.add(x02);
    list.add(x03);
    list.add(x04);

    System.out.println(list);

    list.set(0, x05);
    System.out.println(list);

    list.clear();
    System.out.println(list);

  }

  public String toString() {
    return name;
  }
}


