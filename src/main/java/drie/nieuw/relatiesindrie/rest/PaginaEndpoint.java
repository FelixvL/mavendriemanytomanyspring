package drie.nieuw.relatiesindrie.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import drie.nieuw.relatiesindrie.model.Pagina;
import drie.nieuw.relatiesindrie.persistence.PaginaService;


@RestController
public class PaginaEndpoint {
	@Autowired
	PaginaService ps;
	//-------------------------------------------------
	@GetMapping("allepaginas")
	public Iterable<Pagina> allPages() {
		return ps.getAllPages();
	}
	//-------------------------------------------------
	// GET method
	@GetMapping("getpagina/{id}")
	public Optional<Pagina> readSong(@PathVariable("id") Long id ) {
		return ps.readPage(id);
	}
	//-------------------------------------------------
	// POST method
	@PostMapping("updatepagina")
	public Pagina updatepage(@RequestBody Pagina page) { 	
		return ps.savePage(page);
	}
	//-------------------------------------------------
	// GET method
	@GetMapping("deletepagina/{id}")
	public void deletepage(@PathVariable Long id) { 
		System.out.println("deletepagina"+id);
		ps.deletePage(id);
	}
	//-------------------------------------------------
}
