package br.senai.sp.jandira.empresa_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.empresa_poligonos.model.Retangulo;
import br.senai.sp.jandira.empresa_poligonos.ui.Menu;

public class RetanguloDao {
	public static void criar() {
		Retangulo retangulo = new Retangulo();
		Scanner leitor = new Scanner(System.in);

		System.out.println();
		System.out.println("Criando um retângulo");

		System.out.println("Digite a medida da altura do retângulo");
		retangulo.setAltura(leitor.nextDouble());

		System.out.println("Digite a medida da base do retângulo");
		retangulo.setBase(leitor.nextDouble());

		retangulo.exibirDados();

		Menu.retornar();

		

	}

}
