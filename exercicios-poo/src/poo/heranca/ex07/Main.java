package poo.heranca.ex07;

public class Main {

	public static void main(String[] args) {
		
		GrandFather grandfather = new GrandFather("Dean", 1.80, 80.6);
		System.out.println(grandfather.toString());
		grandfather.speaking();
		grandfather.sleeping();
		grandfather.walking();
		
		Father father = new Father("Sam", 1.83, 80.5, "Brown");
		System.out.println(father.toString());
		father.running();
		father.speaking();
		father.sleeping();
		father.walking();
		
		Child child = new Child("Bob", 1.35, 30.2, "Black", true);
		System.out.println(child.toString());
		child.playing();
		child.speaking();
		child.sleeping();
		child.walking();
	}
}