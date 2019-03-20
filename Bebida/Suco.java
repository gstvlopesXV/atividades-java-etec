package ativBebida;

public class Suco extends Bebida{

	private String sabor;
	
	@Override
	public String mostrarBebida() {
		return "Nome do Suco: " + getNome() + " \n"
				+ "Preço do Suco: " + "R$" + getPreco()+ "0" + " \n";
	}
	@Override
	public boolean verificarPreco(double preco) {
		if (preco < 2.5) {
		return true;
	}else {
		return false;
	}
}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}//fim classe
