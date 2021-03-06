import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter an equation:"); 
		String eq = kb.nextLine(); 
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(eq.split(" ")));
		
		doEquation(equation);
	}
	
	public static void doEquation(ArrayList<String> equation)
	{
		int i = 0;
		
		while(i < equation.size())
		{
			if(equation.get(i).equals("*"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else if (equation.get(i).equals("/"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else
			{
				i++;
			}
		}
		
		i = 0;
		
		while(i < equation.size())
		{
			if(equation.get(i).equals("+"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else if (equation.get(i).equals("-"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else
			{
				i++;
			}
		}
		
		System.out.println(equation);
	}
}