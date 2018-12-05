package fr.uga.projet1.lambda;

public class Etudiant {
	private String nom;
	private String prenom;
	private Double moyenne;
	private String mention;
	
	
	
	
	
	public String getMention() {
		if (moyenne < 10) {
			mention = "recalé";
		} else if (moyenne >= 10 && moyenne <= 12) {
			mention =  "passable";

		} else if (moyenne >= 12 && moyenne <= 18) {
			mention =  "bon";

		} else {
			mention =  "Tres bon";
		}
		
		
		return mention;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", moyenne=" + moyenne + "]";
	}
	public Etudiant(String nom, String prenom, Double moyenne) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.moyenne = moyenne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(Double moyenne) {
		this.moyenne = moyenne;
	}
	
	
	
	
}
