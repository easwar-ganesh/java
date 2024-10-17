import java.io.*;
import java.util.*;
public class ArrayListDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> al = new ArrayList<Integer>();
		int sum = 0;
		float avg = 0;
		System.out.print("Enter elements into array list : ");
		while(sc.hasNextInt())
		{
			al.add(sc.nextInt());
		}
		for(int i=0;i<al.size();i++)
		{
			sum = sum + al.get(i);
		}
		avg=(float)sum/al.size();
		System.out.println("The Sum of elements is " + sum);
		System.out.println("The Average of elements is " + avg);
	}
}
