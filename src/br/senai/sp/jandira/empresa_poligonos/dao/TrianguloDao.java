package br.senai.sp.jandira.empresa_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.empresa_poligonos.model.Quadrado;

public class TrianguloDao {
		public void criar() {
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Criando um triângulo");
			
			Quadrado quadrado = new Quadrado ();
			
			System.out.println("Digite a medida do lado do triângulo");
		
		    quadrado.setLado(leitor.nextDouble());    
		    quadrado.exibirDados();
		}

}
