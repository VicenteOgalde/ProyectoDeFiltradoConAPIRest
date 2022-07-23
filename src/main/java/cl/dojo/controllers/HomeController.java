package cl.dojo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.dojo.services.CursoServiceImpl;
import cl.dojo.services.EstudianteCursoServiceImpl;
import cl.dojo.services.RegionServiceImpl;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	EstudianteCursoServiceImpl estudianteCursoServiceImpl;
	@Autowired
	RegionServiceImpl regionServiceImpl;
	@Autowired
	CursoServiceImpl cursoServiceImpl;

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("estudianteCurso", estudianteCursoServiceImpl.findAll());
		model.addAttribute("regiones", regionServiceImpl.findAll());
		model.addAttribute("cursos", cursoServiceImpl.findAll());
		return "home";
	}

	@PostMapping("/home")
	public String homeBuscar(@RequestParam("region") int regionId, @RequestParam("curso") String cursoId, Model model) {

		logger.info(regionId + " " + cursoId);

		model.addAttribute("regiones", regionServiceImpl.findAll());
		model.addAttribute("cursos", cursoServiceImpl.findAll());
		model.addAttribute("estudianteCurso", estudianteCursoServiceImpl.findByRegionAndCurso(regionId, cursoId));

		return "home";
	}

}
