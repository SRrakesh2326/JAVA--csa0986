import java.util.Scanner;

class Switch {
  public static void main(String[] args) {

    int ch;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);

    // ask users to enter operator
    

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = sc.nextDouble();

    System.out.println("Enter second number");
    number2 = sc.nextDouble();
	do
	{
	System.out.println("1.Add");
	System.out.println("2.Sub");
	System.out.println("3.Multi");
	System.out.println("4.Sub");
	System.out.println("5.Exit");
	System.out.println("Enter your choice=");
	ch=sc.nextInt();

    switch (ch) {

      
      case 1:
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

     
      case 2:
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      
      case 3:
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

     
      case 4:
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
	case 5:
		System.exit(0);
		break;
      
	  default:
        System.out.println("Invalid!");
        break;
    }
	}while(ch!=5);

    sc.close();
  }
}