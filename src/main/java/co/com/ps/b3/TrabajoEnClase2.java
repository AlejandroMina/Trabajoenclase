package co.com.ps.b3;
import java.util.Scanner;
public class TrabajoEnClase2 {

  public static void main(String[] args){
    int num1, num2, result, option;
    Scanner in = new Scanner(System.in);
    System.out.println("Please choose the operation you wish to realize");
    System.out.println("1. addition");
    System.out.println("2. subtraction");
    System.out.println("3. multiplication");
    System.out.println("4. division");
    option = in.nextInt();

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