package ArrayTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Cat03 {

    private String name;

    public Cat03 (String name) {
      this.name = name;
    }

    public static void main(String[] args) {

      Cat03 x01 = new Cat03("Thomas");
      Cat03 x02 = new Cat03("Moscow");
      Cat03 x03 = new Cat03("Seattle");
      Cat03 x04 = new Cat03("Вечно молодой и вечно пьяный");

      Cat03 [] newList =  {x01,x02, x03, x04};

      System.out.println(Arrays.toString(newList));

      ArrayList<Cat03> listNew = new ArrayList<>(Arrays.asList(newList));
      System.out.println(listNew);

      int x = listNew.size();
      System.out.println(x);

    }

    public String toString() {
      return name;
    }
  }


