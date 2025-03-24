package br.senai.sp.jandira.empresa_poligonos.dao;
import java.util.Scanner;

import br.senai.sp.jandira.empresa_poligonos.model.Trapezio;
import br.senai.sp.jandira.empresa_poligonos.ui.Menu;
public class TrapezioDao {
	public static void criar() {
		Trapezio trapezio = new Trapezio();
		Scanner leitor = new Scanner(System.in);
		
	
		System.out.println();
		System.out.println("Criando um Trapezio ");
		
		
		 System.out.println("Digite a medida da base maior do Trapezio");
	    trapezio.setBasemaior(leitor.nextDouble());  
	    
	    System.out.println("Digite a medida da base menor do Trapezio");
	    trapezio.setBasemenor(leitor.nextDouble());  
	    
	    
		System.out.println("Digite a medida da altura do Trapezio ");
	    trapezio.setAltura(leitor.nextDouble());    
	    
	   
	    
	    trapezio.exibirDados();
	    Menu.retornar();
	}

}


