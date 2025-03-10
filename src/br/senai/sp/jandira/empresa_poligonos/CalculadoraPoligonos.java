package br.senai.sp.jandira.empresa_poligonos;

import br.senai.sp.jandira.empresa_poligonos.model.Quadrado;
import br.senai.sp.jandira.empresa_poligonos.model.Retangulo;

public class CalculadoraPoligonos {

	public static void main(String[] args) {
		
	Quadrado quadrado1 = new Quadrado(); 
	quadrado1.setLado(16);
    quadrado1.exibirDados();
    
    Retangulo retangulo1 =new Retangulo();
	retangulo1.setBase(3);
	retangulo1.setAltura(4);
	retangulo1.exibirDados();
	}
	
}
