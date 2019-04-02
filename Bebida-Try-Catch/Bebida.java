package ativBebida;

public abstract class Bebida{
	
	private String nome;
	private Double preco;

	public abstract String mostrarBebida();
	
	/*Retornar todos os dados cadastrados de acordo com
	a opção (VINHO/SUCO/REGRIGERANTE). */	
	
	public abstract boolean verificarPreco(double preco);

	//Verificar se o mesmo é menor que 25, se sim retornar true senão false.
	//TRUE = "Produto em oferta"
	//FALSE = "Produto com o preço normal"
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
