package poo.inheritance.ex08;

public class Manager extends Person{
	
	boolean estrategy;

	public Manager() {
		
	}
	
	public Manager(String name, double height, double weight, double salary, boolean estrategy) {
		
		/* super(); não funciona pois não há método construtor na classe acima (Super Classe)
		 * Isso porque a classe acima é abstrata e não cria objeto		 
		 */
		
		/*super(); does not work because there is no method constructor in the above class (Super Class)
		* That's because the class above is abstract and does not create objects 
		*/
		
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.salary = salary;
		this.estrategy = estrategy;		
	}
	
	@Override
	public void speak() {
		System.out.println("Employee is speaking!");
	}

	@Override
	public void salaryBonus() {
		bonus = 0.5 * salary;
		System.out.println("\n\tBonus\n Salary: " + salary + " \n The bonus is 25%, then: " + salary + "\n Total: " + (salary+bonus));
	}
	
	@Override
	public String toString() {
		return "\n\n\t\t Data Register \n Name: "+name
											+"\n Height: " + height
											+"\n Weight: " + weight
											+"\n Salary: " + salary
											+ "\n Estrategy: " + estrategy;
	}
}
