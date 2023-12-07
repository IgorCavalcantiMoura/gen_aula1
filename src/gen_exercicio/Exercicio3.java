package gen_exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos; 
		float salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Digite o seu salário bruto: \n");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\n Digite o seu adicioanl noturno: \n");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\n Digite o suas horas extras: \n");
		horasExtras = leia.nextFloat();
		
		System.out.println("\n Digite o seu desconto: \n");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras *5) - descontos;
		
		System.out.println(salarioLiquido);
		
		
	}

}
