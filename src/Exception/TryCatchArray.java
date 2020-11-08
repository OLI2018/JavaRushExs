package Exception;

public class TryCatchArray {

  public static void main(String[] args) {
  try {
  int[] m = new int[2];
  m[8] = 5;
}

catch (ArrayIndexOutOfBoundsException e)
{
  System.out.println(e);
}


  }
}

