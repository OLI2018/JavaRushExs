package ArrayTasks;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MamaRamaVowels {

  public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

  public static void main(String[] args) throws Exception {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String words = bufferedReader.readLine();
    String word = words.replaceAll("( )+", "");

    ArrayList<Character>  vowels = new ArrayList<>();
    ArrayList<Character> consonants = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
      char c;
    if (!word.substring(i).equals("")) {
      c = word.charAt(i);
      if (isVowel(c)) {
        vowels.add(c);
      }

      else {
        consonants.add(c);
      }
    }

  }
        for (char c : vowels) {
    System.out.print(c + " ");
  }
        System.out.println();

        for (char c : consonants) {
    System.out.print(c + " ");

    }
  }

  public static boolean isVowel(char character) {
    character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
    for (char vowel : vowels) {  // ищем среди массива гласных
      if (character == vowel) {
        return true;
      }
    }
    return false;
  }
}


