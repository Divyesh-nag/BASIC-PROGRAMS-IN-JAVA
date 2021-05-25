import java.util.Scanner;
class Grade
{
   public static void main(String[] args)
   {
      int score;
      Scanner x = new Scanner(System.in);
      System.out.println("Enter your numeric test score: ");
      score = x.nextInt();

if(score >= 90)
	{
	System.out.println("Your grade is: A");
	}
else if(score >= 80)
	{
	System.out.println("Your grade is: B");
	}
else if(score >= 60)
	{
	System.out.println("Your grade is: C");
	}
else if(score <= 50)
	{
	System.out.println("Your grade is: F");
	}
else
	{
	System.out.println("enter valid marks");
	}
}
}