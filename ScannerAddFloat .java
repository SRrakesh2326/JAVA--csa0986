import java.util.Scanner;
public class ScannerAddFloat {

  public static void main(String[] args) {

    double num1, num2, sum;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    num1 = sc.nextDouble();

    System.out.print("Enter Second Number: ");
    num2 = sc.nextDouble();

    sc.close();
    sum = num1 + num2;
    System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
  }
}