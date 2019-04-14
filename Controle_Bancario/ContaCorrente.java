package Controle_Bancario;

public class ContaCorrente extends Conta {

	private double limiteEspecial;

	public void depositar(double valor) {

	}

	public void sacar(double valor) throws NullPointerException {

		this.limiteEspecial = -800;

		if (valor < limiteEspecial) {
			throw new NullPointerException("Erro ContaCorrente.sacar , valor ultrapassou limiteEspecial(-800)");

		} else if (valor <= 0) {
			throw new NullPointerException("Erro ContaCorrente.sacar , valor recebido menor ou igual a zero");
		}
	}

	public void atualizarSaldo() {

	}

	public String toString() {
		return "*Conta -> ContaCorrente* \n limiteEspecial= -800 \n depositar(valor); \n sacar(valor); \n atualizarSaldo(); ";
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

}
