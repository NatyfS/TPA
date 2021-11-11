import java.util.Scanner;
public class Salario {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double sp, sm;
		System.out.println("Insira o salário: ");
		sp = ler.nextDouble();
		System.out.println("Insira o salário minimo: ");
		sm = ler.nextDouble();
		if (sp>=sm) {
			System.out.println(" Salário Suficiente");
		}else {
			System.out.println("Salário Insuficiente");
		}
		ler.close();
		
	}

}
