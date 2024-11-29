/* Write a program to check if a character is a vowel or consonant. */
class vowel
{
	public static void main(String[] args)
	{
		char ch='Z';
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Given character : " + ch + " is vowel");
		}
		else
		{
			System.out.println("Given character : " + ch + " is consonant");
		}
	}
}