package kanbanDawid.fr.hb.kanban.dawid.service.impl;

import java.util.List;
import java.util.Scanner;

import kanbanDawid.fr.hb.kanban.dawid.business.Tache;
import kanbanDawid.fr.hb.kanban.dawid.service.TacheService;
import kanbanDawid.fr.hb.kanban.dawid.business.Colonne;
import kanbanDawid.fr.hb.kanban.dawid.business.Developpeur;

public class TacheServiceImpl implements TacheService {
	
	DeveloppeurServiceImpl developpeurServiceImpl = new DeveloppeurServiceImpl();
	
	public void ajouterTache(Scanner scanner, List<Developpeur> developpeurs, Colonne colonne) {
		Tache tache = new Tache();
		tache.setColonne(null);
		System.out.println("\nAJOUTER UNE TACHE");
		System.out.println("\nEntrez le nom de la tache :");
		tache.setIntitule(scanner.nextLine());
		System.out.println("\nSelectionner le type");
		System.out.println("1: Fonctionalité");
		System.out.println("2: Bug");
		System.out.println("3: Amélioration");
		System.out.println("4: Spike");
		System.out.println("\nEntrez votre choix :");
		ajouterTypeTache(Integer.parseInt(scanner.nextLine()), tache);
		System.out.println("Selectionner le developpeur");
		developpeurServiceImpl.afficherDeveloppeur(developpeurs);
		System.out.println("\nEntrez votre choix :");
		ajouterDeveloppeur(Integer.parseInt(scanner.nextLine()), tache);
		System.out.println("\nEntrez le nombre d'heures estimées");
		tache.setNbHeuresEstime(Float.parseFloat(scanner.nextLine()));
		System.out.println("\nLa tâche " + tache.getIntitule() + " a bien été enregistrée " ); ////+ tache.getColonne().getNom()
		System.out.println("elle porte l'id " + tache.getId());
//		System.out.println("Il s'agit d'une " + tache.getTypeTache().getNom());
//		System.out.println("Assignée à " + tache.getDeveloppeur().getNom() + " " + tache.getDeveloppeur().getPrenom());
		System.out.println("Sa durée estimée est de " + tache.getNbHeuresEstime());
	}

	private void ajouterDeveloppeur(int choix, Tache tache) {
		tache.setDeveloppeur(null);
	}

	public void ajouterTypeTache(int choix, Tache tache) {
		switch (choix) {
		case 1 -> tache.setTypeTache(null);
		case 2 -> tache.setTypeTache(null);
		case 3 -> tache.setTypeTache(null);
		case 4 -> tache.setTypeTache(null);
		}

	}
}
