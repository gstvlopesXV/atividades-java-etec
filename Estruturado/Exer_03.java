package pkg_estruturado;

import java.text.DecimalFormat;


public class Exer_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat();	

		
		double paisA =  5000000; 
		double taxaNatalidadeA = 5000000*0.3; 
		
		double paisB =  7000000; 
		double taxaNatalidadeB = 7000000*0.2; 
		
		int ano = 0;
		
		while(paisA <= paisB) {
			
			ano = (ano + 1);
		
			paisA = paisA + taxaNatalidadeA;
			System.out.println(ano+"° Ano, "+"Popução País A:\n"+df.format(paisA)+"\n");
		
			paisB = paisB + taxaNatalidadeB;
			System.out.println(ano+"° Ano, "+"Popução País B:\n"+df.format(paisB)+"\n");
		
		}	
	}		
}

	

