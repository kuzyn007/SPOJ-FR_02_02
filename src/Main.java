/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/FR_02_02/
 */

import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.nextLine();
		
		for(int i=0; i<n; i++)
		{
			ArrayList<Integer> liczby = new ArrayList<Integer>();
			liczby.add(in.nextInt());
			liczby.add(in.nextInt());
			liczby.add(in.nextInt());
			liczby.add(in.nextInt());
			liczby.add(in.nextInt());
			liczby.add(in.nextInt());
			
			int max = Collections.max(liczby);
			int min = Collections.min(liczby);
			//System.out.println(max +" "+min);
			
			String Smax = Integer.toString(max);
			int sumMax = Wyliczanie(Smax);
			
			String Smin = Integer.toString(min);
			int sumMin = Wyliczanie(Smin);
			
			System.out.println(sumMin + " " + sumMax);
		}
		
		in.close();
	}
	public static int Wyliczanie(String a)
	{
		int suma=0;
		for(int i=0; i<a.length(); i++)
		{
			char znak = a.charAt(i);
			if(znak == '6' || znak == '0' || znak == '9'){suma=suma+1;}
			if(znak == '8') {suma=suma+2;}
		}
		return suma;
	}
}

