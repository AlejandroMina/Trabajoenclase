package TrabajosEnClase;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Trabajo5 {
  public class fechas {
    public fechas() {
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your birthdate (format YYYY-MM-DD):");
      String birthDate = scanner.nextLine();

      try {
        LocalDate birthDat = LocalDate.parse(birthDate);
        LocalDate ActualDate = LocalDate.now();
        Period period = Period.between(birthDat, ActualDate);
        System.out.println("You're " + period.getYears() + " years old.");
      } catch (Exception var6) {
        System.out.println("date entered is not correct.");
      }

    }
  }
}
