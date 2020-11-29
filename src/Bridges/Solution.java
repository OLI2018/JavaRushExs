package Bridges;

// Мосты
// Bridges
// Java Core,  4 уровень,  8 лекция

public class Solution {

  public static void main(String[] args) {
    println(new WaterBridge());
    println(new SuspensionBridge());
  }

  public static void println (Bridge bridge) {

    System.out.println(bridge.getCarsCount());
  }
}



