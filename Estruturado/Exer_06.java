package milton;

import java.util.Scanner;

public class Exer_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double valorPiso;
		Double larguraComodo;
		Double comprimentoComodo;
		Double valorTotal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Preço do piso:");
		valorPiso = ler.nextDouble();
		System.out.println("Largura do Comodo:");
		larguraComodo = ler.nextDouble();
		System.out.println("Comprimento do Comodo:");
		comprimentoComodo = ler.nextDouble();
		
		valorTotal = (larguraComodo*comprimentoComodo)/valorPiso;
	
		System.out.println("Valor Total: R$"+valorTotal);
		
	}
}
