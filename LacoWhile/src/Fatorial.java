import java.util.Scanner;
public class Fatorial {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		int i,fat,n;
		i=1;
		fat=1;
		System.out.println("Insira o numero desejado:");
		n = leia.nextInt();
		
		while (i <= n) {
			fat = fat*i;
			System.out.println(i);
			i++;
			System.out.println(fat);
		}
		}
	}

