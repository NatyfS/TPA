import java.util.Scanner;
public class Empregado {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        double sal, taxa, parc, imposto;
	        System.out.println("Entre com o sal?rio: ");
	        sal = in.nextDouble();
	        if (sal <=1434.59) {
	            taxa = 0;
	            parc = 0;
	        } else if (sal <=2150) {
	            taxa = 7.5;
	            parc = 107.59;
	        } else if(sal <=2866.7) {
	            taxa = 15;
	            parc = 268.84;
	        } else if (sal<=3582) {
	            taxa = 22.5;
	            parc = 483.84;
	        }else {
	            taxa = 27.5;
	            parc = 662.94;
	        }
	        imposto = sal/100*taxa - parc;
	        System.out.println("O imposto devido ? R$"+imposto);
	    in.close();
	    
	}
	 
}