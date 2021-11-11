import java.util.Scanner;
public class Fatorial {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		int i=10, n, f=1;
		
		System.out.println ("Insira o número desejado: ");
		n = leia.nextInt();
		
		do {
			f = f*n;
			n--;
			
	}while (n > 1);
		System.out.println("O fatorial  é " +f);
		
	}
}

