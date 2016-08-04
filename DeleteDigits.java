/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DeleteDigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		Integer n, r, k, x;
		n = s.nextInt();
		k = s.nextInt();
		x = n;
		n = Math.abs(n);
		List<Integer> rem = new ArrayList();
		while(n > 0)
		{
			rem.add(n%10);
			n = n / 10;
		}
		Collections.sort(rem);
		if(x > 0)
		{
			for(int i = 0; i < rem.size() - k; i++)
				System.out.print(rem.get(i)); 
		}
		else
		{
			System.out.print('-');
			Collections.reverse(rem);
			for(int i = 0; i < rem.size() - k; i++)
				System.out.print(rem.get(i)); 
		}
	}
}