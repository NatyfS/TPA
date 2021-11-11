import  java.util.Scanner ;
public class Potencia {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		int b, e, p, m, i=1;
		
		System.out.println("Insira o valor da base: ");
		b = leia.nextInt();
		System.out.println("Insira o valor do expoente: ");
		e = leia.nextInt();
		
		do {
			p = b*b;
			i++;
		}while (i <= e);
		System.out.println("A potência de " +b+ " é " +p);
	}
}
