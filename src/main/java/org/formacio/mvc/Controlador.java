package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {
	
	@Autowired
	ServeiAlumnat servei;
	
	@RequestMapping("/alumnes")
	@ResponseBody
	public int nombreAlumnes() {
		return servei.nombreAlumnes();
	}

}
