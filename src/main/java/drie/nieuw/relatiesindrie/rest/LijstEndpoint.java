package drie.nieuw.relatiesindrie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import drie.nieuw.relatiesindrie.model.Lijst;
import drie.nieuw.relatiesindrie.model.Pagina;
import drie.nieuw.relatiesindrie.persistence.LijstService;

@RestController
public class LijstEndpoint {
	@Autowired
	LijstService ls;

	// -------------------------------------------------
	@GetMapping("allelijsten")
	public Iterable<Lijst> getAllLists() {
		return ls.getAllLists();
	}
	// -------------------------------------------------
	/*
	@GetMapping("getpaginasvanlijst/{id}")
	public Iterable<Pagina> getPaginasVanLijst(@PathVariable Long id) {
		System.out.println("TO DO: getpaginasvanlijst/" + id);

		return null;
	}
	*/
	// -------------------------------------------------
	// POST method
	@PostMapping("savelijst")
	public Lijst saveList(@RequestBody Lijst lijst) {
		System.out.println("SB::saveList " + lijst.getName() + " id = " + lijst.getId());
		return ls.saveList(lijst);
	}

	// -------------------------------------------------
	// GET method
	@GetMapping("deletelijst/{id}")
	public void deletelist(@PathVariable Long id) {
		ls.deleteList(id);
	}
	// -------------------------------------------------
}
