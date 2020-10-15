package CarProject;

public class Man {

  int dnaCode;

  public boolean equals(Man x) {
   return this.dnaCode ==  x.dnaCode;

  }

  public static void main(String[] args) {

    Man man1 = new Man();
    man1.dnaCode = 1;

    Man man2 = new Man();
    man2.dnaCode =  1;

    System.out.println(man1.equals(man2));

  }
}


