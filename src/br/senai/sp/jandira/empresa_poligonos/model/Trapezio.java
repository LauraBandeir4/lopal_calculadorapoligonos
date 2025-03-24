package br.senai.sp.jandira.empresa_poligonos.model;

public class Trapezio {
	private double baseMenor;
	private double baseMaior;
	private double altura;

	public void setBasemaior(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public void setBasemenor(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		double area = ((baseMaior + baseMenor) * altura) / 2;
		return area;
	}

	public void exibirDados() {
		System.out.println("----------------------------");
		System.out.println(" Dados do trapézio");
		System.out.println("----------------------------");
		System.out.println("Base maior " + baseMaior);
		System.out.println("Base menor " + baseMenor);
		System.out.println("tamanho da altura " + altura);
		System.out.println("Área " + calcularArea());

	}

}
