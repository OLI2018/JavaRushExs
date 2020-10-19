package ArrayTasks;

import java.util.ArrayList;

public class Cat01 {

    private String name;

    public Cat01 (String name) {
      this.name = name;
    }

    public static void main(String[] args) {

      ArrayList<Cat01> list =  new ArrayList<>();

      ArrayTasks.Cat01 x01 = new ArrayTasks.Cat01("Thomas");
      ArrayTasks.Cat01 x02 = new ArrayTasks.Cat01("Moscow");
      ArrayTasks.Cat01 x03 = new ArrayTasks.Cat01("Seattle");
      ArrayTasks.Cat01 x04 = new ArrayTasks.Cat01("Вечно молодой и вечно пьяный");

      list.add(x01);
      list.add(x02);
      list.add(x03);
      list.add(x04);

      System.out.println(list);
      int moscowIndex = list.indexOf(x02);
      System.out.println(moscowIndex);

      Cat01 newCat01 = list.get(0);
      System.out.println(newCat01);

      list.remove(x04);
      System.out.println(list);
      System.out.println(list.contains(x04));

    }

    public String toString() {
      return name;
    }
  }

