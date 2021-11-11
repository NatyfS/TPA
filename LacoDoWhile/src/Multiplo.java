import java.util.Scanner;
public class Multiplo {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		int i=0, mult=10;
		
		do {
			i++;
			if (i % mult ==0) {
				System.out.println(mult);
				System.out.println("Numero-Múltiplo de 10");
			}else {
				System.out.println(i);
			}
		}while (i <= 300);
		
		leia.close();
	}
}

