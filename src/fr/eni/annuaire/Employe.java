package fr.eni.annuaire;

public class Employe {
	
	private Integer noEmploye;
	private String nom;
	private String email;
	
	public Employe(int noEmploye, String nom, String email) {
		super();
		this.noEmploye = noEmploye;
		this.nom = nom;
		this.email = email;
		Annuaire.ajouterEmploye(this);
	}

	protected Integer getNoEmploye() {
		return noEmploye;
	}

	protected void setNoEmploye(Integer noEmploye) {
		this.noEmploye = noEmploye;
	}

	protected String getNom() {
		return nom;
	}

	protected void setNom(String nom) {
		this.nom = nom;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString(){
		return "Employé [noEmploye=" + noEmploye + ", nom=" + nom + ", email=" + email + "]";				
    }
}	
