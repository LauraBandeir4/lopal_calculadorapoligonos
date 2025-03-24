package br.senai.sp.jandira.empresa_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.empresa_poligonos.model.Quadrado;
import br.senai.sp.jandira.empresa_poligonos.model.Triangulo;

public class TrianguloDao {
		public static void criar() {
			Triangulo triangulo = new Triangulo();
			Scanner leitor = new Scanner(System.in);
			
		
			System.out.println();
			System.out.println("Criando um triângulo ");
			
			System.out.println("Digite a medida da altura do triângulo ");
		    triangulo.setAltura(leitor.nextDouble());    
		    
		    System.out.println("Digite a medida da base do triângulo ");
		    triangulo.setBase(leitor.nextDouble());    
		    
		    triangulo.exibirDados();
		    leitor.close();
		}

}
