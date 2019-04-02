package ativBebida;

public abstract class Bebida{
	
	private String nome;
	private Double preco;

	public abstract String mostrarBebida();
	
	/*Retornar todos os dados cadastrados de acordo com
	a op��o (VINHO/SUCO/REGRIGERANTE). */	
	
	public abstract boolean verificarPreco(double preco);

	//Verificar se o mesmo � menor que 25, se sim retornar true sen�o false.
	//TRUE = "Produto em oferta"
	//FALSE = "Produto com o pre�o normal"
	
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
