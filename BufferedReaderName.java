import java.io.*;
class BufferedReaderName {
 public static void main(String args[]) throws Exception {
  String a;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter your name=");
  a = br.readLine();
  
  System.out.println("\nName:" + a);
 }
}