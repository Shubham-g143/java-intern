public class overloading
{
 public static void display(int num)
 {
  System.out.println("printing integer number : " + num);
 }
 
 public static void print(double num)
 {
  System.out.println("printing double value : " + num);
 }
 
 public static void print(String str)
 {
  System.out.println("Printing string : " + str);
 }
 
 public static void print(char ch)
 {
  System.out.println("printing a character : " + ch);
 }
 
 public static void main(String[] args)
 {
  display(10);
  print(3.142);
  print("hello Shubbham!");
  print("S");
 }
}