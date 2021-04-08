package aceptaelreton; 
import java.util.*;
 import java.*;

/**
 *
 * @author Nicolás
 */
public class Aritmetica {
   static final int MAX = 5;
public static void main(String[] args)
{
	while (resuelve())
	{
	};


    
}
public boolean func(int[] numero, int k, int acu, int n)
{
    
	if (acu == n && k == MAX)
	{
		return true;
	}
	if (k >= MAX)
	{
		return false;
	}

	int suma = acu + numero[k];
	int resta = acu - numero[k];
	int mul = acu * numero[k];
	int division = 0;
	boolean divisible = false;
	if (numero[k] != 0 && acu % numero[k] == 0)
	{
		division = acu / numero[k];
		divisible = true;
	}

	++k;
	if (!func(numero, k, suma, n))
	{
		if (!func(numero, k, resta, n))
		{
			if (!func(numero, k, mul, n))
			{
				if (!divisible || (divisible && !func(numero, k, division, n)))
				{
					return false;
				}
			}
		}
	}
	return true;
}


private static boolean resuelve()
{
	int num;
	int[] numero = new int[MAX];
        Scanner teclado = new Scanner(System.in); 
        num = teclado.nextInt(); 
	//num =  (true));
	/*if (num)
                //(!cin)
	{
		return false;
	}
*/
	for (int i = 0; i < MAX; ++i)
	{
		numero[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	if (func(numero, 1, numero[0], num))
	{
		System.out.print("SI\n");
	}
	else
	{
		System.out.print("NO\n");
	}
	return true;
}



}
}
