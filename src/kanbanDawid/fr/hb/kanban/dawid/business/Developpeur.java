package kanbanDawid.fr.hb.kanban.dawid.business;

public class Developpeur {

	private long id;
	private String nom;
	private String prenom;
	private String email;
	private static long compteur = 0;

	public Developpeur() {
		this.id = ++compteur;
	}

	public Developpeur(String nom, String prenom, String email) {
		this();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Developpeur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}

}
