package milton;

import java.text.DecimalFormat;

public class Exer_02 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.##m");
		
		double pessoaJoao = 1.50; 
		double cresceJoao = 0.02; 
		
		double pessoaMaria = 1.10; 
		double cresceMaria = 0.03; 
		
		int ano = 0;
		
		while(pessoaMaria <= pessoaJoao) {
			
			ano = (ano + 1);
		
			pessoaMaria = pessoaMaria + cresceMaria;
			System.out.println(ano+"° Ano, "+"crescimento de Maria:\n"+df.format(pessoaMaria)+"\n");
		
			pessoaJoao = pessoaJoao + cresceJoao;
			System.out.println(ano+"° Ano, "+"crescimento de João:\n"+df.format(pessoaJoao)+"\n");
		
		}	
	}		
}	

	


