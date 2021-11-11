import  java.util.Scanner ;
public class Fibonacci {

		public static void main (String [] args) {
			Scanner leia = new Scanner (System.in);
			int i=1, n, a=0, b=1, c=1;
			
			System.out.println("Insira a quantidade de termos: ");
			n = leia.nextInt();
			do {
				System.out.println(""+c+"");
				c=a+b;
				a=b;
				b=c;
				i++;
			}while (i <=n);
	}
}
