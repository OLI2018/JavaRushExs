package AbstractClass;

// Java Core,  3 уровень,  4 лекция
// Код сам не исправится

public class Abstract07 {

  public static void main (String[] args) throws Exception {

    Translator translator = new Translator();
    System.out.println(translator.translate());
  }

  public  static class Translator {
    public String translate() {
      return "Я переводчик с английского";
    }
  }

}


