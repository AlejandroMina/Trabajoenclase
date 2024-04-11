package TrabajosEnClase;

import java.util.Scanner;

public class Trabajo4 {

  public class TrabajoEnClase2 {
    public TrabajoEnClase2() {
    }

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Please choose the operation you wish to realize");
      System.out.println("1. addition");
      System.out.println("2. subtraction");
      System.out.println("3. multiplication");
      System.out.println("4. division");
      int option = in.nextInt();
      int num1;
      int num2;
      int result;
      switch (option) {
        case 1:
          System.out.print("Please enter the first number:");
          num1 = in.nextInt();
          System.out.print("Please enter the second number:");
          num2 = in.nextInt();
          result = num1 + num2;
          System.out.println("The Addition is:" + result);
          break;
        case 2:
          System.out.print("Please enter the first number:");
          num1 = in.nextInt();
          System.out.print("Please enter the second number:");
          num2 = in.nextInt();
          result = num1 - num2;
          System.out.println("The Subtraction is:" + result);
          break;
        case 3:
          System.out.print("Please enter the first number:");
          num1 = in.nextInt();
          System.out.print("Please enter the second number:");
          num2 = in.nextInt();
          result = num1 * num2;
          System.out.println("The Multiplication is:" + result);
          break;
        case 4:
          System.out.print("Please enter the first number:");
          num1 = in.nextInt();
          System.out.print("Please enter the second number:");
          num2 = in.nextInt();
          result = num1 / num2;
          System.out.println("The Division is:" + result);
          break;
        default:
          System.out.println("Please Choose the correct option");
      }

    }
  }
}
