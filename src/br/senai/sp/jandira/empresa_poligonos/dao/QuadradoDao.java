package br.senai.sp.jandira.empresa_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.empresa_poligonos.model.Quadrado;
import br.senai.sp.jandira.empresa_poligonos.ui.Menu;

public class QuadradoDao {

	public static void criar() {
		Quadrado quadrado = new Quadrado();
		Scanner leitor = new Scanner(System.in);

		System.out.println("Criando um quadrado");

		System.out.println("Digite a medida do lado do quadrado");

		quadrado.setLado(leitor.nextDouble());
		quadrado.exibirDados();
		
		Menu.retornar();
	
		
	}

}
