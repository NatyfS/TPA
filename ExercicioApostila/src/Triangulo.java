import java.util.Scanner;
public class Triangulo {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int a, b ,c;
		System.out.println("Insira o valor de a: ");
		a = leia.nextInt();
		System.out.println("Insira o valor de b: ");
		b = leia.nextInt();
		System.out.println("Insira o valor de c: ");
		c = leia.nextInt();
		
		if (a + b < c && b + a < c && c + a < b) {
			System.out.println("N�o � triangulo");
		}else if (a == b && b == c) {
			System.out.println("Tri�ngulo Eq�il�tero");
		}else if (a !=  b && b != c && a != c) {
			System.out.println("Tri�ngulo Escaleno");
		}else {
			System.out.println("Tri�ngulo Is�sceles");
		}
		leia.close();
	}

}
