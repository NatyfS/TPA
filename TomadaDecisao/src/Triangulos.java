import java.util.Scanner;

public class Triangulos {
	public static void main (String []args ) {
		 Scanner leia = new Scanner (System.in);
			int  a, b, c;
			
			   System.out.println("Digite o primeiro valor:");
			   a = leia.nextInt();
			   System.out.println("Digite o segundo valor ");
			   b = leia.nextInt();
			   System.out.println("Digite o terceiro valor valor ");
			   c = leia.nextInt();
			   
			   if (a + b > c && a + c > b && b + c > a) {
				   if(a == b && a == c) { 
					   System.out.println("Tri�ngulo equilatero");
				       }else if (a == b || a == c || b == c) {
				    	   System.out.println("Tri�ngulo isoceles");
				       }else if (a!= b && b!=c){ 
				    	   System.out.println("Tri�ngulo escaleno");
			   } else {
				   System.out.println("N�o � um tri�ngulo");
			   }		   
			   }		    
	     }
	}
