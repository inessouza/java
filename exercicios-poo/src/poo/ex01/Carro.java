package poo.ex01;

class Carro {

	public String marca;
	public String modelo;
	public int ano;
	public String cor;	
	public String carro;	
	
	public Carro(String marca, String modelo, int ano, String cor) {
	this.marca = marca;
	this.modelo = modelo;
	this.ano = ano;
	this.cor = cor;	
	}
	
	public void status() {
		System.out.println("Marca: " + marca + " Modelo: "+ modelo + " Ano: " + ano + " Cor: " +cor);
	}
}