package poo.heranca.ex07;

public class Father extends GrandFather {
	 protected String hair;
	
	 public Father() {
	        
	 }
	 
	 public Father(String name, double height, double weight, String hair) {
		 super(name, height, weight); // O super utiliza o construtor da classe acima ou classe herdada
		 this.hair = hair;
	 }
	
	public void running() {
		System.out.println("\nFather is running!");
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}	
	
	@Override
	public void speaking() {
		System.out.println("Father is speaking!");
	}
	
	@Override
	public void sleeping() {
		System.out.println("Father is sleeping!");
	}
	@Override
	public void walking() {
		System.out.println("Father is walking!");
	}

	@Override
	public String toString() {
		return "\nAttributes [Name: " + name + ", Height: " + height + ", Weight: " + weight 
				+ ", Hair: " + hair +"]";
	}
	
}