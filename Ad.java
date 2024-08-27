import java.io.*;
class Ad
{
public static void main(String args[])throws Exception
{
int a,b,c;
add br= new add( new InputStreamReader(System.in));
System.out.println("Enter the two numbers to add:");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c = a+b;
System.out.println("\nSum of two numbers:"+ c);
}
}
 