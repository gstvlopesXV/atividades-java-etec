package pkg_estruturado;

import java.util.Scanner;

public class Exer_04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nome = new String[3];
		Double[] valor = new Double[3];
		Integer[] quantidade = new Integer[3];
		Double[] valorTotal = new Double[4];
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.println("Produto "+(i+1));
			
			System.out.println("Informe o nome:");
			nome[i] = ler.next();
			
			System.out.println("Informe o valor:");
			valor[i] = ler.nextDouble();
			
			System.out.println("Informe a quantidade:");
			quantidade[i] = ler.nextInt();
			
			valorTotal[i] = quantidade[i] * valor[i];
		}
		valorTotal[3] = valorTotal[0] +valorTotal[1] +valorTotal[2];
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.println("Produto "+(i+1));
			System.out.println(nome[i]);
			System.out.println("R$"+valor[i]);
			System.out.println("Qnt: "+ quantidade[i]+"\n");
			
		}
		System.out.println("Valor Total:"+valorTotal[3]);
	}
}

