package kanbanDawid.fr.hb.kanban.dawid.service;

import java.util.List;

import kanbanDawid.fr.hb.kanban.dawid.business.Colonne;
import kanbanDawid.fr.hb.kanban.dawid.business.Tache;

public interface ColonneService {

	Colonne addColonne(String nom, List<Tache> taches);

}
