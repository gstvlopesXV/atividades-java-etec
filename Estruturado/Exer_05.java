package milton;

import java.util.Scanner;

public class Exer_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double quilometragemPercorrida;
		Double valorDoCombustivel;
		Double GastoTotal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quilometragem:");
		quilometragemPercorrida = ler.nextDouble();
		
		System.out.println("Valor Do Combustivel:");
		valorDoCombustivel = ler.nextDouble();
		
		GastoTotal = quilometragemPercorrida*(valorDoCombustivel/8);
		
		System.out.println("Gasto Total: R$"+GastoTotal);
		
	}

}
