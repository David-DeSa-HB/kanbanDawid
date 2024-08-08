package kanbanDawid.fr.hb.kanban.dawid.business;


public class TypeTache {
	
	private long id;
	private String nom;
	private String couleurRGB;
	private static long compteur = 0;
	
	public TypeTache() {
		this.id = ++compteur;
	}

	public TypeTache(String nom, String couleurRGB) {
		this();
		this.nom = nom;
		this.couleurRGB = couleurRGB;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleurRGB() {
		return couleurRGB;
	}

	public void setCouleurRGB(String couleurRGB) {
		this.couleurRGB = couleurRGB;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "TypeTache [id=" + id + ", nom=" + nom + ", couleurRGB=" + couleurRGB + "]";
	}
	
}

