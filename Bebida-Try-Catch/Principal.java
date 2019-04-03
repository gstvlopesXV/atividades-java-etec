package ativBebida;

import javax.swing.JOptionPane;

public abstract class Principal {

	public static void main(String[] args) {

		Vinho v1 = new Vinho();
		Refrigerante r1 = new Refrigerante();
		Suco s1 = new Suco();

		int retorn;
		String retorna;
		String resp = "s";
		Object[] bebidaOpcoes = { "Refrigerante", "Suco", "Vinho" };
		Object bebidaSelecionada = null;
		String resposta = "sim";

//      <!-- Inicio do Programa --!>
		JOptionPane.showMessageDialog(null,
				"Desenvolvido por:\n\n"
						+ "Vinicius Amaro, \nGustavo Lopes,  \nGedeão Lima,  \nAndreus Alan, \nRafael Martins.",
				"Java's Bar", JOptionPane.INFORMATION_MESSAGE);

//      <!-- Opções Selecionar Bebida --!>
		while (true) {
			try {
				if (resp == "s") {
					bebidaSelecionada = JOptionPane.showInputDialog(null, "Escolha uma bebida:", " Java's Bar",
							JOptionPane.INFORMATION_MESSAGE, null, bebidaOpcoes, bebidaOpcoes[0]);

					if (bebidaSelecionada == null) {
						System.exit(0);
					}
					resp = "n";
					resposta = "sim";
				}

//      <!-- Opções Selecionar Ação --!>
				while (resposta == "sim") {
					String menuOpcoes[] = { "Cadastrar", "Verificar Preço", "Mostrar Dados", "Trocar Bebida" };

					int menuSelecionado = JOptionPane.showOptionDialog(null, bebidaSelecionada + "\nEscolha uma ação:",
							" Java's Bar", 0, JOptionPane.QUESTION_MESSAGE, null, menuOpcoes, menuOpcoes[0]);

//      <!-- Cadastrar --!>

					if (menuSelecionado == 0) {
						if (bebidaSelecionada == "Refrigerante") {
							r1.setNome(JOptionPane.showInputDialog(null, "Digite o nome do " + bebidaSelecionada,
									"Java's Bar", JOptionPane.QUESTION_MESSAGE));
							r1.setPreco(Double.parseDouble(
									JOptionPane.showInputDialog(null, "Digite o preço do " + bebidaSelecionada,
											"Java's Bar", JOptionPane.QUESTION_MESSAGE)));

							String options[] = { "Sim", "Não" };
							retorn = JOptionPane.showOptionDialog(null, "Refrigerante Retornavel? ", "Java's Bar", 0, 0,
									null, options, false);

							if (retorn == 0) {
								r1.setRetornavel(true);

							} else if (retorn == 1) {
								r1.setRetornavel(false);

							}
						} else if (bebidaSelecionada == "Suco") {
							s1.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do " + bebidaSelecionada,
									"Java's Bar", JOptionPane.QUESTION_MESSAGE));

							s1.setPreco(Double.parseDouble(
									JOptionPane.showInputDialog(null, "Digite o preço do " + bebidaSelecionada,
											"Java's Bar", JOptionPane.QUESTION_MESSAGE)));

							s1.setSabor(JOptionPane.showInputDialog(null, "Digite o Sabor do " + bebidaSelecionada,
									"Java's Bar", JOptionPane.QUESTION_MESSAGE));

						} else if (bebidaSelecionada == "Vinho") {
							v1.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do " + bebidaSelecionada,
									"Java's Bar", JOptionPane.QUESTION_MESSAGE));

							v1.setPreco(Double.parseDouble(
									JOptionPane.showInputDialog(null, "Digite o preço do " + bebidaSelecionada,
											"Java's Bar", JOptionPane.QUESTION_MESSAGE)));

							v1.setSafra(Integer.parseInt(
									JOptionPane.showInputDialog(null, "Digite a Safra do " + bebidaSelecionada,
											"Java's Bar", JOptionPane.QUESTION_MESSAGE)));

							v1.setTipo(JOptionPane.showInputDialog(null, "Digite o Tipo do " + bebidaSelecionada,
									"Java's Bar", JOptionPane.QUESTION_MESSAGE));

						}
					}

//		<!-- Verificar Preço --!>
					else if (menuSelecionado == 1) {
						if (bebidaSelecionada == "Refrigerante") {
							if (r1.verificarPreco(r1.getPreco())) {
								JOptionPane.showMessageDialog(null, "Produto em Promoção!", "Java's Bar",
										JOptionPane.INFORMATION_MESSAGE);

							} else {
								JOptionPane.showMessageDialog(null, "Produto com Preço Normal!", "Java's Bar",
										JOptionPane.INFORMATION_MESSAGE);

							}
						} else if (bebidaSelecionada == "Suco") {
							if (s1.verificarPreco(s1.getPreco())) {
								JOptionPane.showMessageDialog(null, "Produto em Promoção!", "Java's Bar",
										JOptionPane.INFORMATION_MESSAGE);

							} else {
								JOptionPane.showMessageDialog(null, "Produto com Preço Normal!", "Java's Bar",
										JOptionPane.INFORMATION_MESSAGE);

							}
						} else if (bebidaSelecionada == "Vinho") {
							if (v1.verificarPreco(v1.getPreco())) {
								JOptionPane.showMessageDialog(null, "Produto em Promoção!", "Java's Bar",
										JOptionPane.INFORMATION_MESSAGE);

							} else {
								JOptionPane.showMessageDialog(null, "Produto com Preço Normal!", "Java's Bar",
										JOptionPane.INFORMATION_MESSAGE);
							}
						}
					}

//		<!-- Mostrar Dados --!>
					else if (menuSelecionado == 2) {
						if (bebidaSelecionada == "Refrigerante") {
							if (r1.getNome() == null || r1.getPreco() == null) {
								throw new NullPointerException();

							}
							if (r1.getRetornavel() == true) {
								retorna = "Sim";

							} else {
								retorna = "Não";

							}
							JOptionPane.showMessageDialog(null, r1.mostrarBebida() + retorna, "Java's Bar",
									JOptionPane.INFORMATION_MESSAGE);

						} else if (bebidaSelecionada == "Suco") {
							if (s1.getNome() == null || s1.getPreco() == null) {
								throw new NullPointerException();

							}
							JOptionPane.showMessageDialog(null, s1.mostrarBebida(), "Java's Bar",
									JOptionPane.INFORMATION_MESSAGE);

						} else if (bebidaSelecionada == "Vinho") {
							if (v1.getNome() == null || v1.getPreco() == null) {
								throw new NullPointerException();

							}
							JOptionPane.showMessageDialog(null, v1.mostrarBebida(), "Java's Bar",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}

					// <!-- Trocar Bebida --!>
					else if (menuSelecionado == 3) {
						resp = "s";
						resposta = "não";
					} else {
						System.exit(0);
					}
				}
			} catch (NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "Valores inválidos !!", "Java's Bar",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (NullPointerException error) {
				JOptionPane.showMessageDialog(null, "Não há produtos cadastrados", "Java's Bar",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception Error) {
				JOptionPane.showMessageDialog(null, "Erro: " + Error, "Java's Bar", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}