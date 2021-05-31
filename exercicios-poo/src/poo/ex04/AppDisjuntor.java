package poo.ex04;

public class AppDisjuntor {

	public static void main(String[] args) {
		Disjuntor disjuntor = new Disjuntor();

		disjuntor.setLampada(true);
		disjuntor.setTomada(true);
		
		System.out.println(disjuntor.getLampada());
		System.out.println(disjuntor.getTomada());
	}
}
