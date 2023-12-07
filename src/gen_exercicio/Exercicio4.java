package gen_exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, n4, resultado;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Digite a nota1: \n");
		n1 = leia.nextFloat();
		
		System.out.println("\n Digite a nota2: \n");
		n2 = leia.nextFloat();
		
		System.out.println("\n Digite a nota3: \n");
		n3 = leia.nextFloat();
		
		System.out.println("\n Digite a nota4: \n");
		n4 = leia.nextFloat();
		
		resultado = (n1*n2)-(n3*n4);
		
		System.out.println(resultado);
		
	}

}
