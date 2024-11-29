public class factorial
{
 public static int facto(int num)
 {
  if(num==0 || num==1)
  {
   return 1;
  }
  else
  {
   return num * facto(num-1);
  }
 }
 
 public static void main(String[] args)
 {
  int n = 5;
  System.out.println("the factorial of given number " + n + " is = " + facto(n));
 }
}