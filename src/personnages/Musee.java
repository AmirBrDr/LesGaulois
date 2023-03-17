package personnages;



public class Musee {
	private Trophee[] trophees; 
	private int nbTrophee=0;
	public Musee() {
		trophees = new Trophee [200];
	}
	public void donnerTrophees(Gaulois gaulois,Equipement equipement) {
		trophees[nbTrophee]=new Trophee(gaulois, equipement);
		nbTrophee++;
	}
	private String extraireInstructionsCaml(Trophee trophees[]) {
		return "let musee = [ "+trophees+" ]";
	}
}
