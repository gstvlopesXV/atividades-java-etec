package Controle_Bancario;

public class Conta {

	private double saldo;

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;

		if (valor <= 0) {
			System.out.println("Valor inválido!!");
		}
	}

	public void sacar(double valor) {

		if (this.saldo <= 0) {
			throw new NullPointerException("Erro Conta.sacar");

		}
		this.saldo = this.saldo - valor;

	}

	public void atualizarSaldo() {
		if (this.saldo < 0) {
			this.saldo = this.saldo - (this.saldo * 0.08);

		}

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
