import java.util.Scanner; 
public class Fatorial {
	public static void main (String args []) {
		Scanner leia = new Scanner (System.in);
		int i=10, num, fatorial=1;
		
		System.out.println ("Insira o número desejado: ");
		num = leia.nextInt();
		
		for (i=10; num >1; num--) {
			fatorial = fatorial*num;
		};
		System.out.println("O fatorial  é " +fatorial);
		
	}
}

