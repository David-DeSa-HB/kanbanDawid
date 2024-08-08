package kanbanDawid.fr.hb.kanban.dawid.service;

import java.util.List;
import java.util.Scanner;

import kanbanDawid.fr.hb.kanban.dawid.business.Colonne;
import kanbanDawid.fr.hb.kanban.dawid.business.Developpeur;

public interface TacheService {

	void ajouterTache(Scanner scanner, List<Developpeur> developpeurs, Colonne colonne);

}
