package br.senai.sp.jandira.empresa_poligonos.model;

public class Retangulo {
  
	private double base;
	private double altura;
	
    public void setBase(double base) {
    	this.base = base;
    }
	   
    public void setAltura (double altura) {
    	this.altura = altura;
    }
    
		public double calcularArea() {
			double area = base * altura;
			return area;
		}
		
		
		public double calcularPerimetro() {
		  double perimetro = 4 * altura; 
		  return perimetro; 
		}
		public void exibirDados() {
	       System.out.println("----------------------------");
	       System.out.println(" Dados do retângulo");
	       System.out.println("----------------------------");
	       System.out.println("tamanho da altura " + altura);
	       System.out.println("Área " + calcularArea());
	       System.out.println("tamanho da base " + base);
	       System.out.println("Perímetro " + calcularPerimetro());
	       System.out.println();
		}
				
	}


