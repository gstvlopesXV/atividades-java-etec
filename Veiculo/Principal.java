package ativCarro;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		int resp=0;
		
		Scanner sc = new Scanner(System.in);
		Veiculo v1 = new Veiculo();
		Carro automovel = new Carro();
		
		v1.velocidade = 0;
		v1.veiculo = automovel;
		v1.estado="desligado";
				
		String opcoes[] = {"1 - Impala", "2 - Maquina de Mistério", "3 - Relampago Marquinhos"};
		resp = JOptionPane.showOptionDialog(null, "Escolha um Veiculo", "SIMULADOR DE VEÍCULOS", 0,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		
		if (resp==0) {
			v1.veiculo.Modelo = "Impala";
			v1.veiculo.Placa = "KAZ-2Y5";
			v1.potencia = 17;
			v1.velocidadeMaxima = 374;
	
		}
		else if (resp==1) {
			v1.veiculo.Modelo = "Maquina de Mistério";
			v1.veiculo.Placa = "SCO-OBY1";
			v1.potencia = 13;
			v1.velocidadeMaxima = 286;
			
		}
		else if (resp==2) {
			v1.veiculo.Modelo = "Relampago Marquinhos";
			v1.veiculo.Placa = "KAT-IAUU";
			v1.potencia = 37;
			v1.velocidadeMaxima = 481;
			
		}
		else{
		System.exit(0);
		
		}
		System.out.println("[SIMULADOR DE VEÍCULOS]\n\n"
							+ "0 -> Ligar Motor\n"
							+ "1 -> Desligar Motor\n"
							+ "2 -> Acelerar\n"
							+ "3 -> Frear\n\n"
							+ "@ HHora de correr "+v1.veiculo.Modelo.toUpperCase()+" "+v1.veiculo.Placa+" !!\n\n-> "
							);
		
		while (true) {
		int exe = sc.nextInt();
		
		// <--- MOTOR LIGAR ---> 
		if (exe == 0 && v1.estado=="desligado") { 
			System.out.println("Você ligou o motor !");
			v1.estado = "ligado";
			
		}
		else if (exe == 0 && v1.estado=="ligado"){
			System.out.println("@ERRO: seu motor já está ligado !");
			
		}
		// <--- MOTOR DESLIGAR ---> 
		else if (exe == 1 && v1.estado=="ligado") {
			v1.estado = "desligado";
			System.out.println("Você desligou o motor !");
			v1.velocidade = 0;
			
		}
		else if (exe == 1 && v1.estado=="desligado"){
			System.out.println("@ERRO: seu motor já está desligado, ligue-o primeiro !");
			
		}
		// <--- ACELERAR --->
		else if (exe == 2 && v1.estado=="ligado"){ 
			v1.acelerar();
			v1.logAcelerar();
			v1.cambio();
			v1.logCambio();
			
		}
		else if (exe == 2 && v1.estado=="desligado") {
			System.out.println("@ERRO: seu motor está desligado, ligue-o primeiro !");
			
		}
		// <--- FREAR --->
		else if (exe == 3 && v1.estado == "ligado" && v1.velocidade > 0){ 
			v1.frear();
			v1.logFrear();
			v1.cambio();
			v1.logCambio();
			
		}
		else if(exe == 3 && v1.estado=="desligado") {
			System.out.println("@ERRO: seu motor está desligado, ligue-o primeiro !");
		
		}
		else{
			System.out.println("@ERRO: comando inválido");
			
		}	
		}//fim while
	}//fim metodo	
}//fim classe


//<--- EVENTO RADAR/MULTA --->
/*if (exe == 5) { 
v1.radar();			
}*/
