package coreJava;

public class TwoSum {

	// [1,3]
	
	public static void main(String[] args) 
	{
		int[] numbers = {2, 3, 7, 15, 16};
		int target = 18;

		for (int i = 0; i < numbers.length - 1; i++)
		{
			for (int j = i + 1; j < numbers.length; j++)
			{
				if (numbers[i] + numbers[j] == target)
				{
					System.out.println("Indices are " + i + " and " + j);
					
				}
			}
		}
	}
}	


