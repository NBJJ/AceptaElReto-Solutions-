package aceptaelreton;
import java.util.Scanner;


public class Elevame295 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		long resultado;
		long base; 
		long exp;

		do{
		base = teclado.nextLong(); 
		 exp = teclado.nextLong();
		 
				
			if(base == 0 && exp == 0) {
				System.exit(0);
			}else {
				System.out.println(potencia(base,exp));
			}
			
			}while(comprobacion(base , exp) == true);
			
		}
		
	


	private static boolean comprobacion(long base, long exp) {
		if(base != 0 || exp != 0) {
			return true;
		}
	
		return false;
	}




	public static long potencia(long base , long exp) {
		long resultado = 0;
		
			if(exp == 0) {
				return 1; 
			}else {
				resultado = base * potencia(base , exp-1); 
					if(resultado >= 31543) {
						return 0; 
						}else {
							return  base * potencia(base , exp-1); 
				
						}
			}		
		}
	}
	