import java.util.Scanner;

class Twoarray{
  public static void main(String[] args) {
	  int a[][]=new int[10][10];
	  int b[][]=new int[10][10];
	  int c[][]=new int[10][10];
	  int m,n,i,j;
	  Scanner s = new Scanner(System.in);
	 
	  System.out.println("Enter no. of rows and columns: ");
	  m = s.nextInt();
	  n = s.nextInt();
	  System.out.println("Enter A matrix values: ");
	  for(i=1;i<=m;i++){
		  for(j=1;j<=n;j++){
			  a[i][j] = s.nextInt();
		  }
	  }
	  System.out.println("Enter B matrix values: ");
	  for(i=1;i<=m;i++){
		  for(j=1;j<=n;j++){
			  b[i][j] = s.nextInt();
		  }
	  }
	  for(i=1;i<=m;i++){
		  for(j=1;j<=n;j++){
			  c[i][j]=0;
			  c[i][j]=C[i][j]+A[i][k] *b[k][j];
		  }
	  }
	  System.out.println("Sum of the matrix:");
	  for(i=1;i<=m;i++){
		  for(j=1;j<=n;j++)
		  {
			  
			  System.out.print("\t"+c[i][j]);
		  }
		  System.out.print("\n");
		  
	  }

	  



  }
}
		
		
		
        
    
	
 