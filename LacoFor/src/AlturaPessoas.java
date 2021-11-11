import java.util.Scanner; 
public class AlturaPessoas {
	public static void main (String args []) {
		Scanner leia = new Scanner (System.in);
		int ame, ama, h, i;
		
		System.out.println ("Insira a primeira altura: ");
		h = leia.nextInt();
		ame = h;
		ama = h;
		
		for (i =1; i < 5; i++){
			System.out.println ("Insira a altura: ");
			h = leia.nextInt();
			
			if (h < ame){ 
				ame= h;
				}else {
				ama = h;
			}
		}
		System.out.println ("A altura maior é " +ama+ " e a altura menor é " +ame );
		
	}
}

