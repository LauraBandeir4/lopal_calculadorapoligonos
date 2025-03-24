package br.senai.sp.jandira.empresa_poligonos.ui;

import java.util.Scanner;

import br.senai.sp.jandira.empresa_poligonos.dao.QuadradoDao;
import br.senai.sp.jandira.empresa_poligonos.dao.RetanguloDao;
import br.senai.sp.jandira.empresa_poligonos.dao.TrapezioDao;
import br.senai.sp.jandira.empresa_poligonos.dao.TrianguloDao;
import br.senai.sp.jandira.empresa_poligonos.model.Trapezio;

public class Menu {

	static Scanner leitor = new Scanner(System.in);

	public static void criarMenu() {

		System.out.println("-----------------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("-----------------------------");
		System.out.println("1- QUADRADO");
		System.out.println("2- RETÂNGULO");
		System.out.println("3- TRIÂNGULO");
		System.out.println("4- TRAPÉZIO");
		System.out.println("5- CIRCUNFERÊNCIA");
		System.out.println("6- SAIR");
		System.out.println("------------------------------");
		System.out.println("Escolha uma opção (1-6):");

		int opcao = leitor.nextInt();

		System.out.println("A opção escolhida foi " + opcao);

		if (opcao == 1) {
			QuadradoDao.criar();
		} else if (opcao == 2) {
			RetanguloDao.criar();
			// Chamar o RetanguloDao
		} else if (opcao == 3) {
			TrianguloDao.criar();
			// Chamar o TrianguloDao
		} else if (opcao == 4) {
			TrapezioDao.criar();
			// Chamar TrapezioDao
		} else if (opcao == 5) {
			
			// Chamar a CircunferenciaDao
		} else if (opcao == 6) {
			System.out.println("Encerrando programa");
			System.exit(0);
		} else {
			System.out.println("Opção inválida! Você deve escolher entre 1 e 6");
		}

		leitor.close();
	}

	public static void retornar() {
		// TODO Auto-generated method stub

		// Perguntar ao usuário se deseja criar outra fómula
		System.out.println("------------------------------");
		System.out.println("Deseja escolher outra forma? ");
		System.out.println("Digite qualquer tecla e pressione a tecla ENTER tecla para continuar");
		leitor.next();
		criarMenu();

	}

}
