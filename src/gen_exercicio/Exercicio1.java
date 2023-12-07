package gen_exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario;
		float abono; 
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Digite seu salário: \n");
		salario = leia.nextFloat();
		
		Scanner leia1 = new Scanner(System.in);
		System.out.println("\n Digite seu abono: \n");
		abono = leia.nextFloat();
		
		novoSalario = abono + salario;
		
		System.out.println(novoSalario);
		
		
	}

}
