package pkg_Contas;

public class ContaCorrente extends Conta {

	private double limiteEspecial;

	public void depositar(double valor) {

	}

	public void sacar(double valor) {

		if (valor < limiteEspecial) {
			throw new NullPointerException();

		} else if (valor <= 0) {
			throw new NullPointerException();
		}
	}

	public String toString() {
		return "ContaCorrente toString()";
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
}
