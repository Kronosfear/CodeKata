import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DeleteDigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		Integer n, r, k;
		n = s.nextInt();
		k = s.nextInt();
		List<Integer> rem = new ArrayList();
		while(n > 0)
		{
			rem.add(n%10);
			n = n / 10;
		}
		Collections.sort(rem);
		for(int i = 0; i < rem.size() - k; i++)
			System.out.print(rem.get(i)); 
	}
}