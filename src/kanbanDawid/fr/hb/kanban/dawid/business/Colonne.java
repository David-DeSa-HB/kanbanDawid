package kanbanDawid.fr.hb.kanban.dawid.business;

import java.util.List;

public class Colonne {

	private long id;
	private String nom;
	private static long compteur = 0;
	
	List<Tache> taches; 
	
	public Colonne() {
		this.id = ++compteur;
	}

	public Colonne(String nom, List<Tache> taches) {
		this();
		this.nom = nom;
		this.taches = taches;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Colonne [id=" + id + ", nom=" + nom + ", taches=" + taches + "]";
	}
	
	
}

