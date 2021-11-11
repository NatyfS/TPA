import java.util.Scanner; 
public class Tabuada {

	public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int n, i, r;
	
		System.out.println ("Insira um número: ");
		n = leia.nextInt();
		
		for (i=1; i<=10; i++) {
			r = i*n;
			System.out.println(i+"x"+n+" = " +r);
			
		}
	}
}


