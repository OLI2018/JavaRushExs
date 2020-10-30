package DistanceBetweenPoints;

public class  Util {

  public static double getDistance(int x1, int y1, int x2, int y2) {

   double a = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
   System.out.println(a);
   return a;
  }

  public static void main(String[] args) {

    getDistance (9, 10, 30, 45);
  }
}

