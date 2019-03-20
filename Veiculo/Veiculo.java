package ativVeiculo;
public class Veiculo {
	
	public float potencia, velocidade, freio; 
	public Carro veiculo;
	public String estado;
		
	public void acelerar() {
		this.velocidade += this.potencia;
		
	}
	
	public void frear() {
		this.velocidade -= this.potencia/2;
		this.freio = this.potencia/2;
		
	}
	
	public Integer marcha() {
	     if (this.velocidade < 0) {
	       return -1;
	     }
	     if (this.velocidade >= 0 && this.velocidade < 40) {
	       return 1;
	     }
	     if (this.velocidade >= 40 && this.velocidade < 80) {
	       return 2;
	     }
	     return 3;
	   }
	
	public float getVelocidade() {
		return this.velocidade;
		
	}
	
	public void radar() {
	System.out.println("RADAR:\nO veículo "+veiculo.Placa+" "+veiculo.Modelo+" registrou velocidade de "+getVelocidade()+"Km/h\n");
	
	}
	
	public void logAcelerar() {
	System.out.println(veiculo.Modelo+":\nAcelerou +"+this.potencia+" \nVelocidade "+getVelocidade()+"Km/h\n");
	
	}
	
	public void logFrear() {
	System.out.println(veiculo.Modelo+":\nFreou -"+this.freio+" \nVelocidade "+getVelocidade()+"Km/h\n");
	
	}
}

