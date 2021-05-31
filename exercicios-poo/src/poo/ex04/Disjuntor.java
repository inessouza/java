package poo.ex04;

public class Disjuntor {
	// Private = Somente a Classe consegue acessar
	private boolean lampada; // false
	private boolean tomada;
	
	
	// Métodos acessores get e set
	
	/* get() = obter o valor do estado
	 * 
	 * getLampada() {
	 * 	
	 * Nível	O tipo a
	 * de 		ser retornado
	 * acesso 		
	 * 	↓		 	↓
	 * public     boolean     getLampada() {
	 * 
	 * }
	 * 
	 * return this.lampada; // retorna está.lampada é da Classe
	 * 	 * 
	 * }
	 * 
	 * set() = alterar o valor do estado
	 *  
	 *  
	 * public void setLampada(boolean lampada) { 
	 * this.lampada = lampada → do parâmetro
	 * 	↓ 
	 * lampada da Classe que é indicada pelo this
	 * 
	 */
	
	public void setLampada(boolean lampada) {
		this.lampada = lampada;
	}
	
	public boolean getLampada() {
		return lampada;
	}
	
	public void setTomada(boolean tomada) {
		this.tomada = tomada;
	}
	
	public boolean getTomada() {
		return tomada;
	}
}
