import java.util.Scanner;
public class Numeros {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		int i=1, n, ma, me, d;
		
		System.out.println("Coloque a quantidade de números que gostaria de digitar");
		d = leia.nextInt();
		
		System.out.println("Insira um número: ");
		n = leia.nextInt();
		ma = n;
		me = n;
		
		do {
			System.out.println("Insira um número");
			n= leia.nextInt();
			if ( n > ma) {
				ma = n;
			}else if (n < me) {
				me = n;
			}
			i++;
		}while (i < d);
		System.out.println(+ma+" é o maior número ");
		
		leia.close();
	}

}
