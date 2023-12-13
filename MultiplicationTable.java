//Program in Java to display the multiplication table of a given integer.

import java.util.Scanner;

public class MultiplicationTable
{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number for which table is required. Number = ");
		int num = reader.nextInt();
		for (int i=1; i<11; i++)
		{
			System.out.print(num + " x " + i + "  = " + num*i + "\n");
		}
	}
}

//Output

Enter the number for which table is required. Number = 10
10 x 1  = 10
10 x 2  = 20
10 x 3  = 30
10 x 4  = 40
10 x 5  = 50
10 x 6  = 60
10 x 7  = 70
10 x 8  = 80
10 x 9  = 90
10 x 10  = 100
