import java.util.Scanner;
public class Usuarios {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		String n, nomeMaior, nomeMenor;
		double id, idadeMaior, idadeMenor;
		
		System.out.println("Insira o primeiro nome: ");
		n = leia.next();
		System.out.println("Insira a primeira idade: ");
		id = leia.nextDouble();
		nomeMaior = n;
		idadeMaior = id;
		nomeMenor = n;
		idadeMenor = id;
		
		System.out.println("Insira o segundo nome: ");
		n = leia.next();
		System.out.println("Insira a segunda idade: ");
		id = leia.nextDouble();
		if (id > idadeMaior) {
			idadeMaior = id;
			nomeMaior = n;
		}else if (id < idadeMenor) {
			idadeMenor = id;
			nomeMenor = n;
		}	
		System.out.println("Insira o terceiro nome: ");
		n = leia.next();
		System.out.println("Insira a terceira idade: ");
		id = leia.nextDouble();
		if (id > idadeMaior) {
			idadeMaior = id;
			nomeMaior = n;
		}else if (id < idadeMenor) {
			idadeMenor = id;
			nomeMenor = n;
		}	
		System.out.println("Insira o quarto nome: ");
		n = leia.next();
		System.out.println("Insira a quarta idade: ");
		id = leia.nextDouble();
		if (id > idadeMaior) {
			idadeMaior = id;
			nomeMaior = n;
		}else if (id < idadeMenor) {
			idadeMenor = id;
			nomeMenor = n;
		}	
		System.out.println("Insira o quinto nome: ");
		n = leia.next();
		System.out.println("Insira a quinta idade: ");
		id = leia.nextDouble();
		if (id > idadeMaior) {
			idadeMaior = id;
			nomeMaior = n;
		}else if (id < idadeMenor){
			idadeMenor = id;
			nomeMenor = n;
		}	
		System.out.println("O nome do usuario mais velho é:"+nomeMaior);
		System.out.println("A idade do usuario mais velho é:"+idadeMaior);
		System.out.println("O nome do usuario mais novo é:"+nomeMenor);
		System.out.println("A idade do usuario mais novo é:"+idadeMenor);
		leia.close();
	 
	}

}
