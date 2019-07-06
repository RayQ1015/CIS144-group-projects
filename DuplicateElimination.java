import java.util.*;

public class DuplicateElimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	int[] numbers = new int[3];
	int count = 0;
	int firstNumber=0;
	int number = 0;
	do
	{
		System.out.println("Enter a number between 10-100: ");
		try
		{
			firstNumber=input.nextInt();
		}
		catch(InputMismatchException e)
		{
			//System.out.println(e);
			System.out.println("Invalid Input");
			input.next();
		}
	}
	while(!(firstNumber>=10 && firstNumber<=100));
	System.out.println(""+firstNumber);
	do
	{
		System.out.println("Enter another number between 10-100: ");
		try
		{
			number=input.nextInt();
		}
		catch(InputMismatchException e)
		{
			//System.out.println(e);
			System.out.println("Invalid Input");
			input.next();
		}
	}
	while(!(number>=10 && number<=100));
	
	while(count<4)
	{
		count++;
		boolean duplicate = false;
		if(number != firstNumber)
		{
			for(int i=0; i<numbers.length;i++)
			{
				if(number == numbers[i])
				{
					duplicate = true;
				}
			}
			if(duplicate == false)
			{
				for(int i=0; i<numbers.length;i++)
				{
					if(numbers[i]!=0)
					{
						System.out.printf("%d, ", numbers[i]);
					}
				}
				System.out.print(firstNumber+", "+number+"\n");
				if(count<4)
				{
					numbers[count-1]=number;
				}
			}
		}
		if(duplicate == true || number == firstNumber)
		{
			System.out.println("Duplicate Number!");
		}
		if(count<4)
		{
			do
			{
				System.out.println("Enter another number between 10-100: ");
				try
				{
					number=input.nextInt();
				}
				catch(InputMismatchException e)
				{
					//System.out.println(e);
					System.out.println("Invalid Input");
					input.next();
				}
			}while(!(number>=10 && number<=100));
		}
	}
	System.out.print("\nThe Numbers Enter are: "+firstNumber+", ");
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i] != 0)
		{
			System.out.printf("%d, ", numbers[i]);
		}
	}
	boolean  duplicate2 = false;
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i] == number)
		{
			duplicate2 = true;
		}
	}
	if(duplicate2 == false)
	{
		if(firstNumber != number)
		{
			System.out.printf("%d", number);
		}
	}
	

	}

}
