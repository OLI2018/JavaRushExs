package Generics;

public class NestedLoops {

  public static void main(String[] args) {

    for (int i = 1; i < 3 ; i++) { // i =1, i =2,
      for (int j = 1; j <5 ; j++) { // j =1, j =2, j =3, j =4, новый цикл    j =1, j =2, j =3, j =4,
        System.out.println(i);  // 1 1 1 1     2 2 2 2
        System.out.println(j);  // 1 2 3 4     1 2 3 4
      }
    }
  }
}
