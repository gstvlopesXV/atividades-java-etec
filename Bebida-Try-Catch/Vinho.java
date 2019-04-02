package ativBebida;

public class Vinho extends Bebida {

	private int safra;
	private String tipo;
	
	@Override
	public String mostrarBebida() {
		return "Nome do Vinho: " + getNome() + " \n"
				+ "Preço do Vinho: " + "R$" + getPreco()+ "0" + " \n "+ "Safra do Vinho: " + this.safra + " \n"
				+ "Tipo do Vinho: " + this.tipo;
				
	}
	@Override
	public boolean verificarPreco(double preco) {
		if (preco < 25) {
		return true;
	}else {
		return false;
	}
}
	public int getSafra() {
		return safra;
	}
	public void setSafra(int safra) {
		this.safra = safra;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}//fim classe
