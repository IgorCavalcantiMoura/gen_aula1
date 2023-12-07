package gen_exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1;
		float nota2;
		float nota3;
		float nota4; 
		float mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Digite a primeira nota: \n");
		nota1 = leia.nextFloat();
		
		System.out.println("\n Digite a segunda nota: \n");
		nota2 = leia.nextFloat();
		
		System.out.println("\n Digite a terceira nota: \n");
		nota3 = leia.nextFloat();
		
		System.out.println("\n Digite a quarta nota: \n");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println(mediaFinal);
		

	}

}
