package Encapsulation.Cats_01;

public  class  CatsMainClass {

  public static void main(String[] args) {

    CatsAllOneCat catsAllOneCat_01 =
            new CatsAllOneCat("Lo", 34, 45);

            System.out.println(catsAllOneCat_01);

//    catsAllOneCat_01.name01 = "this is a new name";


            System.out.println(catsAllOneCat_01);


    CatsAllOneCat catsAllOneCat_02 =
            new CatsAllOneCat("LoLoLo", 12, 123456);

    CatsAllOneCat catsAllOneCat_03 =
            new CatsAllOneCat("LoLoLoLo", 3, 1);
  }
}
