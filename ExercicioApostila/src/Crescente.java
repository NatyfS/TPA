import java.util.Scanner;
public class Crescente {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		int a, b, c;
		System.out.println("Insira o valor de a: ");
		a = leia.nextInt();
		System.out.println("Insira o valor de b: ");
		b = leia.nextInt();
		System.out.println("Insira o valor de c: ");
		c = leia.nextInt();
		
		if (a < b && b < c) {
			System.out.println(""+a+","+b+","+c+"");
		} else if (a < c && c < b) {
			System.out.println(""+a+","+c+","+b+"");
		} else if ( c < a && a < b ) {
			System.out.println(""+c+","+a+","+b+"");
		} else if (b < a && a < c) {
			System.out.println(""+b+","+a+","+c+"");
		} else if (b < c && c < a) {
			System.out.println(""+b+","+c+","+a+"");
		} else if (c < b && b < a) {
			System.out.println(""+c+","+b+","+a+"");
		}
		leia.close();
	}
}
