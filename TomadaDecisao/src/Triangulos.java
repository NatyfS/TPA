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
					   System.out.println("Triângulo equilatero");
				       }else if (a == b || a == c || b == c) {
				    	   System.out.println("Triângulo isoceles");
				       }else if (a!= b && b!=c){ 
				    	   System.out.println("Triângulo escaleno");
			   } else {
				   System.out.println("Não é um triângulo");
			   }		   
			   }		    
	     }
	}
