package drie.nieuw.relatiesindrie.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drie.nieuw.relatiesindrie.model.Lijst;
import drie.nieuw.relatiesindrie.model.Pagina;
import drie.nieuw.relatiesindrie.model.PaginaPerLijst;

@Service
public class PaginaPerLijstService {
	@Autowired
	LijstRepository lijstrepository;
	@Autowired
	PaginaRepository pagerepository;
	@Autowired
	PaginaPerLijstRepository pageperlistrepository;

	// -------------------------------------------------
	public Iterable<PaginaPerLijst> getAllePaginasPerLijst() {
		System.out.println("getAllePaginasPerLijst called");
		
		return pageperlistrepository.findAll();
	}
	// -------------------------------------------------
	public Iterable<PaginaPerLijst> getPaginasVanLijst(int lijst_id) {//dit gaat niet goed...

		System.out.println("getPaginasVanLijst called / "+lijst_id);
		// To Do: "SELECT * from pagina_per_lijst WHERE lijst-id = "+id;
		//pageperlistrepository.findAllById(id);
		return pageperlistrepository.findPaginasByLijst_idOrderByVolgordeAsc(lijst_id);
	}
	//-------------------------------------------------	
	public void removePaginaFromLijst(int lijst_id, int pagina_id){
		pageperlistrepository.removePaginaFromLijst(lijst_id, pagina_id);
	}
	//-------------------------------------------------	
	public Lijst addPageToLijst(Lijst l, Pagina p, int volgorde) {
		System.out.println("addPageToLijst");
		System.out.println("idlijst = " + l.getId());
		System.out.println("idpage = " + p.getId());	
		PaginaPerLijst ppl = new PaginaPerLijst();
		ppl.setLijst(l);
		ppl.setPagina(p);
		ppl.setVolgorde(volgorde);
		return null;
	}
	//-------------------------------------------------	
	public PaginaPerLijst savePaginaPerLijst(PaginaPerLijst ppl ) {
		System.out.println("PPL.id > " + ppl.getId());

		/*
		Lijst l = ppl.getLijst();
		System.out.println("savePaginaPerLijst : lijst.name=" + l.getName());
		//l.setName(l.getName());

		List<PaginaPerLijst> p = l.getPaginas();
		System.out.println("savePaginaPerLijst : paginalijst="+p. );
		*/
				
		pageperlistrepository.save(ppl);
		return ppl;
	}
	//-------------------------------------------------
	public void deleteByLijst_id(int lijstid) {
		System.out.println("PaginaPerLIjstService::deleteByLijst_id > " +lijstid);

		// TODO Auto-generated method stub
		pageperlistrepository.deletePaginasByLijst_id(lijstid);
	}
}
