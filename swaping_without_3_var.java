import java.util.Scanner;

public class swaping_without_3_var {

  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
      System.out.println("WELCOME TO SWAPPING NUMBER !!");
            System.out.print("Enter first number (a): ");
            int a = scanner.nextInt();

            System.out.print("Enter second number (b): ");
            int b = scanner.nextInt();

            System.out.println("Before swap: a = " + a + ", b = " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swap: a = " + a + ", b = " + b);

            scanner.close();
        }
    }


