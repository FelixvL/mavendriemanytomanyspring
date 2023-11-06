package drie.nieuw.relatiesindrie.model;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Lijst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String lijstNaam;
	private String categorie;
	@OneToMany(mappedBy = "lijst")
	private Set<PaginaPerLijst> paginas;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLijstNaam() {
		return lijstNaam;
	}
	public void setLijstNaam(String lijstNaam) {
		this.lijstNaam = lijstNaam;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Set<PaginaPerLijst> getPaginas() {
		return paginas;
	}
	public void setPaginas(Set<PaginaPerLijst> paginas) {
		this.paginas = paginas;
	}
	
	

}
