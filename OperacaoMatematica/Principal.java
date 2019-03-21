package matematica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int tipoOperacao;
		
		Scanner sc = new Scanner(System.in);
				
		OperacaoMatematica op1 = new OperacaoMatematica ();
		Multiplicacao m1 = new Multiplicacao();
		Soma s1 = new Soma ();
		
		System.out.println("X:");
		op1.x = sc.nextDouble();
		
		System.out.println("Y:");
		op1.y = sc.nextDouble();
		
		
		System.out.println("1 = Somar, 2 = Multiplicar");
		tipoOperacao = sc.nextInt();
		

		if(tipoOperacao == 1) {
			
			System.out.print("X:"+op1.x+ "\nY:"+op1.y);
			System.out.print("\nResultado: "+s1.calcular(op1.x, op1.y));
			
		}else{
				
			System.out.print("X:"+op1.x+ "\nY:"+op1.y);
			System.out.print("\n\nResultado: "+m1.calcular(op1.x, op1.y));	
			
		}
	}
}
