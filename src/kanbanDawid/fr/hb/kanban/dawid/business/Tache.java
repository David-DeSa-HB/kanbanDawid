package kanbanDawid.fr.hb.kanban.dawid.business;

import java.time.LocalDateTime;

public class Tache {
	
	private long id;
	private String intitule;
	private LocalDateTime dateHeureCreation = LocalDateTime.now();
	private float nbHeuresEstime;
	private static long compteur = 0;
	
	private Developpeur developpeur;
	private Colonne colonne;
	private TypeTache typeTache;
	
	public Tache() {
		this.id = ++compteur;
	}

	public Tache(String intitule, float nbHeuresEstime) {
		this();
		this.intitule = intitule;
		this.nbHeuresEstime = nbHeuresEstime;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public float getNbHeuresEstime() {
		return nbHeuresEstime;
	}

	public void setNbHeuresEstime(float nbHeuresEstime) {
		this.nbHeuresEstime = nbHeuresEstime;
	}

	public Developpeur getDeveloppeur() {
		return developpeur;
	}

	public void setDeveloppeur(Developpeur developpeur) {
		this.developpeur = developpeur;
	}

	public Colonne getColonne() {
		return colonne;
	}

	public void setColonne(Colonne colonne) {
		this.colonne = colonne;
	}

	public TypeTache getTypeTache() {
		return typeTache;
	}

	public void setTypeTache(TypeTache typeTache) {
		this.typeTache = typeTache;
	}

	public long getId() {
		return id;
	}

	public LocalDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	@Override
	public String toString() {
		return "Tache [id=" + id + ", intitule=" + intitule + ", dateHeureCreation=" + dateHeureCreation
				+ ", nbHeuresEstime=" + nbHeuresEstime + ", developpeur=" + developpeur + ", typeTache=" + typeTache
				+ "]";
	}

	
}

