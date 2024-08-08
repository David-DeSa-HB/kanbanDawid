package kanbanDawid.fr.hb.kanban.dawid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kanbanDawid.fr.hb.kanban.dawid.business.Colonne;
import kanbanDawid.fr.hb.kanban.dawid.business.Developpeur;
import kanbanDawid.fr.hb.kanban.dawid.business.TypeTache;
import kanbanDawid.fr.hb.kanban.dawid.service.ColonneService;
import kanbanDawid.fr.hb.kanban.dawid.service.DeveloppeurService;
import kanbanDawid.fr.hb.kanban.dawid.service.TacheService;
import kanbanDawid.fr.hb.kanban.dawid.service.TypeTacheService;
import kanbanDawid.fr.hb.kanban.dawid.service.impl.ColonneServiceImpl;
import kanbanDawid.fr.hb.kanban.dawid.service.impl.DeveloppeurServiceImpl;
import kanbanDawid.fr.hb.kanban.dawid.service.impl.TacheServiceImpl;
import kanbanDawid.fr.hb.kanban.dawid.service.impl.TypeTacheServiceImpl;


public class Main {
	
	private static ColonneService colonneService = new ColonneServiceImpl();
	private static DeveloppeurService developpeurService = new DeveloppeurServiceImpl();
	private static TacheService tacheService = new TacheServiceImpl();
	private static TypeTacheService typeTacheService = new TypeTacheServiceImpl();
	
	static Scanner scanner = new Scanner(System.in);
	
	static List<Developpeur> developpeurs = new ArrayList<Developpeur>();
	
	static TypeTache fonctionalite = typeTacheService.addTypeTache("Fonctionalités", "bleu");
	static TypeTache bug = typeTacheService.addTypeTache("Bugs", "rouge");
	static TypeTache amelioration = typeTacheService.addTypeTache("Améliorations", "vert");
	static TypeTache spike = typeTacheService.addTypeTache("Spikes & Tâches d'exploration", "magenta");
	
	static Colonne aFaire = colonneService.addColonne("A faire", null);
	static Colonne enCours = colonneService.addColonne("En cours", null);
	static Colonne termine = colonneService.addColonne("Terminé", null);
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		developpeurs = developpeurService.importerDeveloppeurs("developpeurs.csv");
		
		lancerProgramme(true);
		
		

	}
	
	public static void lancerProgramme(boolean b) {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1: Ajouter une tâche");
		System.out.println("2: Voir le Tableau");
		System.out.println("3: Voir toutes les tâches (triées sur le nombre d'heures estimées)");
		System.out.println("4: Quitter");
		System.out.println("\nEntrez votre choix :");
		
		int choice = Integer.parseInt(scanner.nextLine());
		switch (choice) {
        case 1 -> tacheService.ajouterTache(scanner, developpeurs, aFaire);
        
        case 2 -> choice = 2;

        case 3 -> choice = 3;
        
        case 4 -> choice = 4;
        
    }
		
	}

}
