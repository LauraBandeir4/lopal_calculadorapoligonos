package br.senai.sp.jandira.empresa_poligonos;

import java.util.Scanner;

import br.senai.sp.jandira.empresa_poligonos.ui.Menu;

public class CalculadoraPoligonos {

	public static void main(String[] args) {

		// Looping / Laços de repetição
		// int contador = 0;
		// while (contador < 10) {
		// System.out.println("SENAI JANDIRA - " + contador);
		// contador = contador + 1;

//	String resposta = "s";
//	while(resposta.equals("s"));
//	{
//		System.out.println("Estamos dando voltas");
//		System.out.println("Gostaria de dar uma volta (s/n)");
//		Scanner leitor = new Scanner(System.in);
//		resposta = leitor.next();
//	}
		
		System.out.println("---------------");
		System.out.println("Tabuada do 9 ");
		System.out.println("---------------");
		int i = 0;
		while (i <= 10) {
			System.out.println("9 x " + i + " = " + (9 * i));
			i = i + 1;
		}

		// Menu.criarMenu();

	}

}
