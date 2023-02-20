import personnages.*;

public class Scenario {
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 8);
		Romain minus = new Romain("Minus",6);
		panoramix.parler("e vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour a tous");
		minus.parler("ofuisdohdch");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

		
	}
}
