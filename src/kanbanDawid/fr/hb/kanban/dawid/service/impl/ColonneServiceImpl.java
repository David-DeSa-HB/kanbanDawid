package kanbanDawid.fr.hb.kanban.dawid.service.impl;

import java.util.List;

import kanbanDawid.fr.hb.kanban.dawid.business.Colonne;
import kanbanDawid.fr.hb.kanban.dawid.business.Tache;
import kanbanDawid.fr.hb.kanban.dawid.service.ColonneService;

public class ColonneServiceImpl implements ColonneService{
	
	public Colonne addColonne(String nom, List<Tache> taches) {
		return new Colonne(nom, taches);
	}
}
