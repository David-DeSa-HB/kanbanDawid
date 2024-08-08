package kanbanDawid.fr.hb.kanban.dawid.service.impl;


import kanbanDawid.fr.hb.kanban.dawid.business.TypeTache;
import kanbanDawid.fr.hb.kanban.dawid.service.TypeTacheService;

public class TypeTacheServiceImpl implements TypeTacheService{

	
	public TypeTache addTypeTache(String nom, String couleurRGB) {
			return new TypeTache(nom, couleurRGB);
	}
}
