import java.util.Scanner;
public class Combustivel {
	public static void main (String []args ) {
		Scanner leia = new Scanner (System.in);
		double km, capacidade, consumo;
		
		System.out.println("Insira a quantidade em litros do tanque de seu veiculo:");
		capacidade = leia.nextInt();
		System.out.println("Insira a dist�ncia percorrida:");
		km = leia.nextInt();
		consumo = km/capacidade;
		
		if (consumo >= 10) {
		System.out.println("Seu carro � econ�mico");
		}else{
			System.out.println("Seu carro n�o � econ�mico");
		
		}
    }
}

