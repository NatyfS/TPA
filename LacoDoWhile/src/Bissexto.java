import  java.util.Scanner ;
public class Bissexto {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		int aInici =0, aFinal =0, i=1;
		
		
		System.out.println ("Insira um ano:");
		aInici = leia.nextInt();
		System.out.println ("Insira o ano que a contagem vai parar:");
		aFinal = leia.nextInt();
		do {
			if (aInici % 4 == 0 )     {
				System.out.println ("O ano de " +aInici+ " é bissexto");
			}else{}
			aInici++;
		}while (aInici <= aFinal);

		
	}
}
 
