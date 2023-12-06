package drie.nieuw.relatiesindrie.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drie.nieuw.relatiesindrie.model.Pagina;

/*IVO ADDED THIS FILE*/
@Service
public class PaginaService {
	@Autowired
	PaginaRepository pr;
	// ------------------------------------------------
	public Iterable<Pagina> getAllPages() {
		return pr.findAll();
	}
	// -------------------------------------------------
	public Optional<Pagina> readPage(Long id) {
		return pr.findById(id);
	}
	// ------------------------------------------------
	public Pagina savePage(Pagina page) {
		return pr.save(page);
	}
	// -------------------------------------------------
	public void deletePage(Long id) {
		System.out.println("deletePage Endpoint: "+id);
		pr.deleteById(id);	
	}
	// -------------------------------------------------
}