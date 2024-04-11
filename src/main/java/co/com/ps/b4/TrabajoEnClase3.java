package co.com.ps.b4;

import java.util.Scanner;

public class TrabajoEnClase3 {

  public static void main(String[] args) {
    // Create a Scanner object to read input
    Scanner scanner = new Scanner(System.in);

    // Declare an array to store 8 words
    String[] words = new String[8];

    // Prompt the user and read 8 words
    System.out.println("Enter 8 words:");
    for(int i = 0; i < words.length; i++) {
      words[i] = scanner.nextLine();
    }

    // Check and print words with more than 4 letters
    System.out.println("Words with more than 4 letters:");
    for(String word : words) {
      if(word.length() > 4) {
        System.out.println(word);
      }
    }

    // Close the scanner
    scanner.close();
  }
}

