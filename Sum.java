import java.util.Scanner;

class Sum {
  public static void main(String[] args) {

    int i=1,n,s=0;
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        n = sc.nextInt();
	while(i<=n)
	{
		s=s+i;
		i++;
	}
	System.out.println("sum= "+s);
  }
}