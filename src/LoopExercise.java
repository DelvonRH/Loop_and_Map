import java.util.ArrayList;
import java.util.Scanner;

public class LoopExercise 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		int product = 1;
		
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int firstNum = input.nextInt();
		numList.add(firstNum);
		
		System.out.println("Please enter another:");
		int secondNum = input.nextInt();
		numList.add(secondNum);
		
		System.out.println("Please enter another:");
		int thirdNum = input.nextInt();
		numList.add(thirdNum);
		
		System.out.println("Please enter another:");
		int fourthNum = input.nextInt();
		numList.add(fourthNum);
		
		System.out.println("Please enter the last number:");
		int fifthNum = input.nextInt();
		numList.add(fifthNum);
		
		int maxSoFar = numList.get(0);
		int minSoFar = numList.get(0);
		
		for(int numbers : numList)
		{
			sum = sum + numbers;
			product = product * numbers;
			
			if(numbers > maxSoFar)
				maxSoFar = numbers;
			
			if(numbers < minSoFar)
				minSoFar = numbers;
		}
		
		System.out.println("The Values Entered Were:");
		System.out.println(numList.toString());
		System.out.println();
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		System.out.println("The max is: " + maxSoFar);
		System.out.println("The min is: " + minSoFar);

	}

}
