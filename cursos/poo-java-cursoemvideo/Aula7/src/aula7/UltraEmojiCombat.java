package aula7;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[3];
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 
								68.9f, 11, 2, 1);
		
		l[1] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 
								119.3f, 13, 0, 2);
		
		l[2] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 
				105.7f, 12, 2, 4);
		
		l[2].status();
	}
}