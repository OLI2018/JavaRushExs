package InitializationTasks;

// Статики-2
// Java Core,  5 уровень,  9 лекция

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Initialization_02 {

  public static int A;
  public static int B;

static {

  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

  try {
    A = Integer.parseInt(bufferedReader.readLine());
    B = Integer.parseInt(bufferedReader.readLine());

  } catch (IOException e) {
    e.printStackTrace();
  }
finally {
    try {
      bufferedReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

  public static final int MIN = min(A, B);

  public static void main(String[] args) {
    System.out.println(MIN);
  }

  public static int min(int a, int b) {
    return a < b ? a : b;
  }
}


