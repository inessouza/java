package poo.heranca.ex07;

public class Child extends Father {
	protected boolean intelligence;
	
	public Child() {
        
    }
	
	public Child(String name, double height, double weight, String hair, boolean intelligence) {
		 super(name, height, weight, hair);
		 this.intelligence = intelligence;
    }
	
	public void playing() {
		System.out.println("\nChild is playing!");
	}

	public boolean getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(boolean intelligence) {
		this.intelligence = intelligence;
	}	
	
	@Override
	public void speaking() {
		System.out.println("Child is speaking!");
	}
	
	@Override
	public void sleeping() {
		System.out.println("Child is sleeping!");
	}
	
	@Override
	public void walking() {
		System.out.println("Child is walking!");
	}

	@Override
	public String toString() {
		return "\nAttributes [Name: " + name + ", Height: " + height + ", Weight: " + weight 
				+ ", Hair: " + hair + ", Intelligence: " + intelligence +"]";
	}	
}