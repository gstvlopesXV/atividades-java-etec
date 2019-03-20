package ativBebida;

public class Refrigerante extends Bebida{

	private boolean retornavel;

	
	@Override
	public String mostrarBebida() {
	 return "Nome do Refrigerante: " + getNome() + " \n"
				+ "Preço do Refrigerante: " + "R$" + getPreco()+ "0" + " \n";
	}
	public boolean isRetornavel() {
		return retornavel;
	}
	public void setRetornavel(boolean retornavel) {
		this.retornavel = retornavel;
	}
	@Override
	public boolean verificarPreco(double preco) {
		if (preco < 5) {
		return true;
	}else {
		return false;
	}
}
	
}//fim classe
