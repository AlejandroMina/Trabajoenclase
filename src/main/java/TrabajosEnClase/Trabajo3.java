package TrabajosEnClase;

import java.util.Scanner;

public class Trabajo3 {


  public class TrabajoEnClase3 {
    public TrabajoEnClase3() {
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String[] words = new String[8];
      System.out.println("Enter 8 words:");

      for(int i = 0; i < words.length; ++i) {
        words[i] = scanner.nextLine();
      }

      System.out.println("Words with more than 4 letters:");
      String[] var7 = words;
      int var4 = words.length;

      for(int var5 = 0; var5 < var4; ++var5) {
        String word = var7[var5];
        if (word.length() > 4) {
          System.out.println(word);
        }
      }

      scanner.close();
    }
  }
}
