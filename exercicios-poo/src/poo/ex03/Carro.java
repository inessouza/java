package poo.ex03;

class Carro {

	private String marca;
	private String modelo;
	private int ano;
	private String cor;	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}	
		
	public String getCor() {
		return cor;
	}
	
	/*public void status() {
		System.out.println("Marca: " + marca + " Modelo: "+ modelo + " Ano: " + ano + " Cor: " +cor);
	}*/
}