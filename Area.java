import java.util.Scanner;

class Area{
  public static void main(String[] args) {
float pi=3.14f,r,a;
Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius = ");
        r = sc.nextInt();
		
		a=pi*r*r;
		System.out.println("Area of the Rectangle = "+a);
        
    
	
  }
}