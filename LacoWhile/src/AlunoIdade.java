import java.util.Scanner;
public class AlunoIdade {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		int i=1, aa,an,idade, mn=0, ma=0 ;
		
		System.out.println("Insira o ano atual");
		aa = leia.nextInt();
		
		while (i<=10) {
			System.out.println("Insira o ano de nascimento");
			an = leia.nextInt();
			idade = aa-an;
			if (idade>=18) {
				ma++;
			}else {
				mn++;
			}
			i++;
		}
		System.out.println("Quantidade de maiores: "+ma+"");
		System.out.println("Quantidade de menores: "+mn+"");
	}
}
