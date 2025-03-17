package br.senai.sp.jandira.empresa_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.empresa_poligonos.model.Retangulo;

public class RetanguloDao {
	public static void criar () {
		Scanner leitor = new Scanner(System.in);
		
			System.out.println("Criando um retângulo");
			
			Retangulo retangulo= new Retangulo ();
			
			System.out.println("Digite a medida do lado do retângulo");
		
		    retangulo.setBase(leitor.nextDouble());    
		    retangulo.exibirDados();
	}

}
