package TrabajosEnClase;

import java.util.Scanner;

public class Trabajo2 {

  public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the first number");
      int numb1 = in.nextInt();
      System.out.println("Enter the secon number");
      int numb2 = in.nextInt();
      int add = numb1 + numb2;
      int sub = numb1 - numb2;
      int mult = numb1 * numb2;
      int divi = numb1 / numb2;
      System.out.println("addition" + add);
      System.out.println("Subtraction" + sub);
      System.out.println("Multiplication" + mult);
      System.out.println("division" + divi);
    }
  }
}
