package drie.nieuw.relatiesindrie.persistence;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drie.nieuw.relatiesindrie.model.Lijst;
import drie.nieuw.relatiesindrie.model.Pagina;
import drie.nieuw.relatiesindrie.model.PaginaPerLijst;

@Service
public class LijstService {
	@Autowired
	LijstRepository lijstrepository;
	@Autowired
	PaginaRepository pagerepository;

	// -------------------------------------------------
	public Lijst saveList(Lijst list) {
		return lijstrepository.save(list);
	}

	// -------------------------------------------------
	public void deleteList(Long id) {
		lijstrepository.deleteById(id);
	}

	// -------------------------------------------------
	public Iterable<Lijst> getAllLists() {
		return lijstrepository.findAll();
	}

	// -------------------------------------------------
	public Optional<Lijst> getList(Long id) {
		return lijstrepository.findById(id);
	}
	// -------------------------------------------------
	public Lijst addPageToLijst(Long idlijst, Long idpage) {
		/*
		System.out.println("addPageToLijst");
		System.out.println("idlijst = " + idlijst);
		System.out.println("idpage = " + idpage);

		Optional<Lijst> l = lijstrepository.findById(idlijst);
		Optional<Pagina> p = pagerepository.findById(idpage);

		if (l.isPresent() && p.isPresent()) {
			System.out.println("Both lijst and page exist");

			Lijst lijst = l.get();
			Pagina page = p.get();

			// call method to add a page to the list in Lijst class
			lijst.voegPaginaToeAanLijst(page);

			// tell the repo to save the updated list to the database
			listrepository.save(lijst);
			return lijst;
		} else {
			System.out.println("Lijst " + idlijst + " or page " + idpage + " not found");
			return null;
		}
		*/
		return null;
	}

	// -------------------------------------------------
	public Lijst removePageFromLijst(Long idlijst, Long idpage) {
		/*
		System.out.println("removePageFromLijst");
		System.out.println("idlijst = " + idlijst);
		System.out.println("idpage = " + idpage);

		Optional<Lijst> l = lijstrepository.findById(idlijst);
		Optional<Pagina> p = pagerepository.findById(idpage);

		if (l.isPresent() && p.isPresent()) {
			System.out.println("Both lijst and page exist");

			Lijst lijst = l.get();
			Pagina page = p.get();

			// Call the method to remove page to the list in your Lijst class
			lijst.removePageFromLijst(page);

			// Save the updated list to the database (assuming you're using JPA)
			lijstrepository.save(lijst);
			return lijst;
		} else {
			System.out.println("Lijst " + idlijst + " or page " + idpage + " not found");
			return null;
		}
		*/
		return null;
	}
	// -------------------------------------------------

}
