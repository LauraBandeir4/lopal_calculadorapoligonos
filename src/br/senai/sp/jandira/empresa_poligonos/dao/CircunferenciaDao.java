package br.senai.sp.jandira.empresa_poligonos.dao;
import java.util.Scanner;

import br.senai.sp.jandira.empresa_poligonos.model.Circunferencia;
import br.senai.sp.jandira.empresa_poligonos.ui.Menu;


public class CircunferenciaDao {
		public static void criar() {
			Circunferencia circunferencia = new Circunferencia();
			Scanner leitor = new Scanner(System.in);

			System.out.println();
			System.out.println("Criando um Circunferência");

			System.out.println("Digite a medida do Raio do Circunferência");
			circunferencia.setRaio(leitor.nextDouble());


			circunferencia.exibirDados();

			Menu.retornar();

			

		}

}
