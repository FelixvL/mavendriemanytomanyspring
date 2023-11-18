package drie.nieuw.relatiesindrie.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import drie.nieuw.relatiesindrie.model.Lijst;
import drie.nieuw.relatiesindrie.model.Pagina;
import drie.nieuw.relatiesindrie.model.PaginaPerLijst;
import drie.nieuw.relatiesindrie.persistence.LijstService;
import drie.nieuw.relatiesindrie.persistence.PaginaPerLijstService;

@RestController
public class PaginaPerLijstEndpoint {
	@Autowired
	PaginaPerLijstService ppls;
	LijstService ls;

	// -------------------------------------------------
	@GetMapping("allepaginasperlijst")
	public Iterable<PaginaPerLijst> allPagesPerList() {

		return ppls.getAllePaginasPerLijst();
	}

	// -------------------------------------------------
	// @GetMapping("/list/{id}/pages")
	@GetMapping("getpaginasvanlijst/{lijstid}")
	public Iterable<Pagina> getPaginasVanLijst(@PathVariable int lijstid) {
		System.out.println("TO DO: getpaginasvanlijst/" + lijstid);//DEZE FUNCTIE GAAT NIET GOED...
		
		// hoe geef ik een array van PAGES uit de pagina_per_lijst tabel terug waar lijst_id = lijstid is?
		// SELECT * FROM pagina_per_lijst WHERE lijst_id = lijstid
				
		return null;
	}
	// -------------------------------------------------
	// POST method
	@PostMapping("updatepaginaperlijst")
	public PaginaPerLijst updatePaginaPerLijst(@RequestBody PaginaPerLijst ppl) {
		System.out.println("slaPaginaPerLijstOp " + ppl + " id = " + ppl.getId());

		return ppls.savePaginaPerLijst(ppl);
	}
	// -------------------------------------------------
}
