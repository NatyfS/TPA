import java.util.Scanner;
public class Media {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double n1, n2, m, exame, nM;
		System.out.println("Insira a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("Insira a segunda nota: ");
		n2 = leia.nextDouble();
		m = (n1 + n2)/2;
		System.out.println("Sua média é "+m+"");
		
		if (m < 3) {
			System.out.println("Reprovado");
		}else if (m >= 6) {
			System.out.println("Aprovado");
		}else if (m >= 3 && m < 6) {
			System.out.println("Aluno em Exame");	
		System.out.println("Insira a nota do Exame: ");
		exame = leia.nextDouble();
		nM = (m + exame)/2;
		if (nM >= 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		}
		leia.close();
	}

}
