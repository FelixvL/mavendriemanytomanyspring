package drie.nieuw.relatiesindrie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
		System.out.println("alle_paginas_per_lijst");
		return ppls.getAllePaginasPerLijst();
	}
	// -------------------------------------------------
	@GetMapping("removepaginavanlijst/{lijstid}/{pagina_id}")
	void removePaginaFromLijst(@PathVariable int lijstid, @PathVariable int pagina_id){
		System.out.println("L= "+lijstid+", P="+pagina_id);
		ppls.removePaginaFromLijst(lijstid, pagina_id);
	}
	// -------------------------------------------------
	@GetMapping("deletefrompagina_per_lijst/{lijstid}")	
	public void deleteFromPaginaPerLijst(@PathVariable int lijstid) {
		System.out.println("deletefrompagina_per_lijst "+lijstid);
		ppls.deleteByLijst_id(lijstid);
	}
	// -------------------------------------------------
	// @GetMapping("/list/{id}/pages")
	@GetMapping("getpaginasvanlijst/{lijstid}")
	public Iterable<PaginaPerLijst> getPaginasVanLijst(@PathVariable int lijstid) {
		System.out.println("getpaginasvanlijst/" + lijstid);
		return ppls.getPaginasVanLijst(lijstid);
	}
	// -------------------------------------------------
	// POST method
	@PostMapping("updatepaginaperlijst")
	public PaginaPerLijst updatePaginaPerLijst(@RequestBody PaginaPerLijst ppl) {
		System.out.println("L.id > " + ppl.getLijst().getId() + ", P.id = " + ppl.getPagina().getId());
		return ppls.savePaginaPerLijst(ppl);
	}
	// -------------------------------------------------
}
