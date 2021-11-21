import java.util.Scanner;
public class Idade {
	public static void main (String []args ) {
		Scanner leia = new Scanner (System.in);
		int id, aNasc, aAtual;
		
		System.out.println("Insira o ano de nascimento:");
		aNasc = leia.nextInt();
		System.out.println("Insira o ano atual:");
		aAtual = leia.nextInt();
		id = aAtual-aNasc;
		System.out.println("A idade é:" +id);
		if (id<10) {
			System.out.println("criança");
		} else if (id<18) {
			System.out.println("adolescente");
		} else if (id<60) {
			System.out.println("adulto");
		} else {
			System.out.println("idoso");
		}
	}	
}

