package controle;

public class Caixa {
	
	int cod_compra;
	String nome_produto;
	double valor_produto;
	double valor_total;
	int data_compra;
	
	public Caixa(int cod_compra, String nome_produto, double valor_produto, double valor_total, int data_compra){
		this.cod_compra = cod_compra;
		this.nome_produto = nome_produto;
		this.valor_produto = valor_produto;
		this.valor_total = valor_total;
		this.data_compra = data_compra;
	}
	
	public String toString(){
		return cod_compra+", "+nome_produto +", "+valor_produto+", "+valor_total+", "+data_compra;
	}

}
