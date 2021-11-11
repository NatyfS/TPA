import java.util.Scanner; 
public class NumeroIntervalo {
	public static void main (String args []) {
		Scanner leia = new Scanner (System.in);
int i, in1 =0, in2=0, in3=0, in4=0, n=0, q;
		
		System.out.println("Insira a quantidade de números que serão digitados: ");
		q = leia.nextInt();
		
		for (i=1; i<= q; i++) {
			System.out.println("Insira um número ");
			n = leia.nextInt();
		
			if (n <= 25)  {
				in1 = in1 + 1;
			}else if (n <= 50) {
				in2 = in2 + 1;
			}else if (n <= 75) {
				in3 = in3 + 1;
			}else{
				in4 = in4 + 1;
			}
		}
		System.out.println( +in1+ "I ntervalo 1");
		
		System.out.println ( +in2+ " Intervalo 2");
		
		System.out.println( +in3+ " Intervalo 3");
		
		System.out.println ( +in4+ " Intervalo 4");
		
	}
}
