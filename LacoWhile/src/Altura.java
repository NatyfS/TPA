
public class Altura {
	public static void main (String args[]) {
		int i;
		double pedro, joao;
		joao = 134;
		pedro = 145;
		i = 1;
		
		while (joao <= pedro) {
			joao = joao+02.5;
			pedro = pedro+0.2;
			i = i+1;
			
			System.out.println("Irá demorar "+i+" para joao ficara mais alto que pedro.");
		}
	}
}

