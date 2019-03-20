package ativVeiculo;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int moto;
		
		Scanner sc = new Scanner(System.in);
		Veiculo v1 = new Veiculo();
		Carro automovel = new Carro();
		
		v1.veiculo = automovel;
		v1.estado="desligado";
		v1.potencia = 37;
		v1.veiculo.Modelo = "BMW X6";
		v1.veiculo.Placa = "ABC-1234";
		v1.velocidade = 0;
		/* 
		v1.Acelerar();
		v1.logAcelerar();
		
		v1.Frear();
		v1.logFrear();
		
		v1.Radar();
		*/
		System.out.println("[SIMULADOR DE TRÁFEGO]\n\n"
							+ "Digite 0 -> Ligar o Motor\n"
							+ "Digite 1 -> Desligar o Motor\n"
							+ "Digite 2 -> Acelerar\n"
							+ "Digite 3 -> Frear\n"
							+ "Digite 4 -> Trocar a Marcha\n"
							+ "Digite 4 -> Disparar Radar\n");
		
		while (true) {
			 moto = sc.nextInt();
			 
			 
			 if (moto == 0) { //ligar o motor
			 System.out.println("você ligou o motor");
			 v1.estado = "ligado";
			}
			 
			 if (moto == 1) { //ligar o motor
				 System.out.println("você desligou o motor");
				 v1.estado = "desligado";
				}
		 
		if (moto == 2 && v1.estado=="ligado"){ //acelerar
			v1.acelerar();
			v1.logAcelerar();
		}else if (v1.estado=="desligado") {
			System.out.println("Ligue o Motor!");
		}
	
		if (moto == 3) { //frear
			v1.frear();
			v1.logFrear();
		}
	
		if (moto == 4) { //marcha
			v1.marcha();
			System.out.println("Marcha usada : " + v1.marcha());
		}
	
		
		if (moto == 5) { //radar
			v1.radar();
		}
	
		}//fim while
	}//fim metodo
}//fim classe