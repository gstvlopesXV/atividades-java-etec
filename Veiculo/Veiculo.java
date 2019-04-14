package ativCarro;
public class Veiculo {
	
	public float potencia, velocidade, freio,velocidadeMaxima; 
	public Carro veiculo;
	public String estado;
	public double velocidadeAtual = 0;
	public String Marcha;
	
	public void acelerar() {
		if (getVelocidadeAtual()<velocidadeMaxima) {
		this.velocidade += this.potencia;
		
		}
	}
	public void frear() {
		this.velocidade -= this.potencia/2;
		this.freio = this.potencia/2;
		
	}
	public float getVelocidadeAtual() {
		return this.velocidade;
		
	}
	public String cambio() { 
		if (getVelocidadeAtual() == 0) { 
			this.Marcha = "N"; //MORTO
			
		} 
		if (getVelocidadeAtual() >= potencia) { 
			this.Marcha = "1";
			
		} 
		if (getVelocidadeAtual() > potencia*2){//13, 17 e 37// 
			this.Marcha = "2";
			
		}
		if (getVelocidadeAtual() >= 90 ) { 
			this.Marcha = "3";
			
		}
		if (getVelocidadeAtual() >= 120 ) { 
			this.Marcha = "4";
			
		}
		if (getVelocidadeAtual() >= 149 ) { 
			this.Marcha = "5";
			
		}
		return Marcha;
	}

	public void radar() {
	System.out.println("RADAR:\nO veículo "+veiculo.Placa+" "+veiculo.Modelo+" registrou velocidade de "+getVelocidadeAtual()+"Km/h\n");
	
	}
	// <-- PRINTS/LOGS -->
	public void logAcelerar() {
	System.out.println(veiculo.Modelo+":\nAcelerou +"+this.potencia+" \nVelocidade "+getVelocidadeAtual()+"Km/h");
	
	}
	
	public void logFrear() {
	System.out.println(veiculo.Modelo+":\nFreou -"+this.freio+" \nVelocidade "+getVelocidadeAtual()+"Km/h\n");
	
	}
	public void logCambio() {
	System.out.println("Marcha " + Marcha + "\n");
	
	}
}
