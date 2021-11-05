import java.util.Scanner;
public class PesoAltura {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double p, a , imc;
		System.out.println("Insira seu peso em kg: ");
		p = leia.nextDouble();
		System.out.println("Insira sua altura em m: ");
		a = leia.nextDouble();
		imc = p/(a*a);
		System.out.println("Seu IMC é "+imc+"");
		
		if (imc < 18.5) {
			System.out.println("Excesso de Magreza");
		} else if (imc >=18.5 && imc <= 25) {
			System.out.println("Peso Normal");
			} else if (imc >25 && imc <= 30) {
				System.out.println("Excesso de Peso");
			} else if (imc >=30 && imc <= 35) {
				System.out.println("Obesidade grau I");
			} else if  (imc >=35 && imc <= 40) {
				System.out.println("Obesidade grau II");
			} else{
				System.out.println("Obesidade grau III");
			}
		leia.close();
	}

}
