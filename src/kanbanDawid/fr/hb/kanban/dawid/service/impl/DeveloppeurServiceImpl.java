package kanbanDawid.fr.hb.kanban.dawid.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kanbanDawid.fr.hb.kanban.dawid.business.Developpeur;
import kanbanDawid.fr.hb.kanban.dawid.service.DeveloppeurService;

public class DeveloppeurServiceImpl implements DeveloppeurService{


	public List<Developpeur> importerDeveloppeurs(String fileName) {
	List<Developpeur> developpeurs = new ArrayList<Developpeur>();

		try {
			Scanner sc = new Scanner(new File(fileName));
			sc.useDelimiter(";");
			while (sc.hasNext()) {
				String str = sc.nextLine().replace("\"", "");
				String[] line = str.split(",");

				Developpeur developpeur = new Developpeur();
				
				developpeur.setNom(line[0]);
				developpeur.setPrenom(line[1]);
				developpeur.setEmail(line[2]);
				developpeurs.add(developpeur);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return null;
		}
		return developpeurs;
	}
	
	public void afficherDeveloppeur(List<Developpeur> developpeurs) {
		int nbr = 0;
		for (Developpeur developpeur : developpeurs) {
			++nbr;
			System.out.println(nbr + ": " +developpeur.getPrenom() +" "+developpeur.getNom());
		}

	}
}
