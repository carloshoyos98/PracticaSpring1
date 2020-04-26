package org.formacio.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServeiAlumnat {
	
	@Autowired
	RepositoriAlumnesMemoria repositori;
	
	@PostConstruct
	public void init() {
		repositori.altaAlumne(1, "Antonia");
		repositori.altaAlumne(2, "Joan");
	}
	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb 
	 * el corresponent codi.
	 * Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */
	public boolean matricula (int id, String alumne) {
		if(alumne != null) {
			repositori.altaAlumne(id, alumne);
			return true;
		} else {
			return false;
		}
		
	}
	
	public int nombreAlumnes() {
		return repositori.llistaAlumnes().size();
	}
	
}
