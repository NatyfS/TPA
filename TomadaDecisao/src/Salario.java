import java.util.Scanner;
public class Salario {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double sp, sm;
		System.out.println("Insira o sal�rio: ");
		sp = ler.nextDouble();
		System.out.println("Insira o sal�rio minimo: ");
		sm = ler.nextDouble();
		if (sp>=sm) {
			System.out.println(" Sal�rio Suficiente");
		}else {
			System.out.println("Sal�rio Insuficiente");
		}
		ler.close();
		
	}

}
