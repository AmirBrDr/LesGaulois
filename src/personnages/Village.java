package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom , int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	private void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois+=1;
	}
	
	private Gaulois trouverHabitant(int place) {
		return villageois[place];
	}
	private void afficherVillageois() {
		System.out.println("Chef du village "+nom+" est "+chef.getNom());
		for (int i=0; i<nbVillageois; i++) {
			System.out.println(villageois[i].getNom());
		} 
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// on a n-1 cases dans un tableau de taille n.
		//Chef abraracourcix = new Chef("Abraracourcix",6,village);
		//village.chef=abraracourcix;
		//village.ajouterHabitant(abraracourcix);
		//Gaulois asterix = new Gaulois("Asterix",8);
		//village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(0);
		//System.out.println(gaulois);
		//chef nest pas un gaulois 
		//Gaulois obelix = new Gaulois("Obelix",25);
		//village.ajouterHabitant(obelix);
		//village.afficherVillageois();
	}
}
