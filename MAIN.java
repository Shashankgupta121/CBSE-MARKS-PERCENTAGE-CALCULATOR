import java.util.Scanner;
public class MAIN
{
	public static void main(String[]args)
	{
	Scanner in = new Scanner(System.in);
	System.out.println("ENTER YOUR MATHS MARKS HERE: ");
	int MATHS_MARKS = in.nextInt();
	if (MATHS_MARKS>100){
		System.out.println("THIS IS GREATER THAT 100");
	}
	System.out.println("ENTER YOUR HINDI MARKS HERE: ");
	int HINDI_MARKS = in.nextInt();
	if (HINDI_MARKS>100){
		System.out.println("THIS IS GREATER THAT 100");
	}
	System.out.println("ENTER YOUR ENGLISH MARKS HERE: ");
	int ENGLISH_MARKS = in.nextInt();
	if (ENGLISH_MARKS>100){
		System.out.println("THIS IS GREATER THAT 100");
	}
	System.out.println("ENTER YOUR SST MARKS HERE: ");
	int SST_MARKS = in.nextInt();
	if (SST_MARKS>100){
		System.out.println("THIS IS GREATER THAT 100");
	}
	System.out.println("ENTER YOUR SCIENCE MARKS HERE: ");
	int SCIENCE_MARKS = in.nextInt();
	if (SCIENCE_MARKS>100){
		System.out.println("THIS IS GREATER THAT 100");
	}
	int F = (MATHS_MARKS+HINDI_MARKS+ENGLISH_MARKS+SST_MARKS+SCIENCE_MARKS)/5;
	System.out.println("TOTAL PERCENTAGE IS EQUAL TO:  " + F + "%");
	if (F==100){
		System.out.println("GOOD, YOU ARE A TOPPER");
	}
	}
}