package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois [] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom , int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
	return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	public Gaulois trouverHabitant(int iHabitant) {
		return villageois[iHabitant];
	}
	public void afficherVillageois() {
		System.out.println("Le Chef de village " + nom + " est " + chef.getNom() + " et les villageois sont :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println(trouverHabitant(i).getNom());	
		}
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		dans un tableau avec 30 cases, l'indice de dernier case est n-1.
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.setChef(abraracourcix);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
