package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipements = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	private void sEquiper(Equipement equipement) {
		switch (nbEquipements) {
		case 2: {
			System.out.println("Le soldat " + nom + "est deja bien protege!");
		}
		case 1: {
			if (equipement == equipements[0]) {
				System.out.println("Le soldat " + nom + " possede deja un " + equipement + "!");
			} else {
				equipements[1] = equipement;
				System.out.println("Le soldat " + nom + " s'equipe avec un" + equipement + ".");
				nbEquipements += 1;
			}
		}
		default: {
			equipements[0] = equipement;
			System.out.println("Le soldat " + nom + " s'equipe avec un" + equipement + ".");
			nbEquipements += 1;
		}
		}
	}

	public void recevoirCoup(int forceCoup) {
		assert (force > 0);
		int invariant = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert (force < invariant);
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);

	}
}
