/* Write java code to display the following messages  
  •	if a number divides by 3 display hello 
  •	if number divides by 5 display hi 
  •	if number divides by 3 and 5 display hello hi 3,10,15
*/
class numDiv
{
	public static void main(String[] args)
	{
		int n=15;
		if(n%3==0 && n%5==0)
		{
			System.out.println("Hii Hello");
		}
		else if(n%3==0)
		{
			System.out.println("Hii");
		}
		else if(n%5==0)
		{
			System.out.println("Hello");
		}
	}
}