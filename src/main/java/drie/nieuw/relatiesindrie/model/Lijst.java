package drie.nieuw.relatiesindrie.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
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
	private String name;
	@OneToMany(mappedBy = "lijst",cascade = CascadeType.ALL)
	private List<PaginaPerLijst> paginas;
	//-------------------------------------------------	
	public long getId() {
		return id;
	}
	//-------------------------------------------------
	public void setId(long id) {
		this.id = id;
	}
	//-------------------------------------------------
	public String getName() {
		return name;
	}
	//-------------------------------------------------
	public void setName(String name) {
		this.name = name;
	}
	//-------------------------------------------------
	@JsonIgnore
	public List<PaginaPerLijst> getPaginas() {
		System.out.println("Lijst.java::getPaginas functie called"+this.id);
		return paginas;
	}
	//-------------------------------------------------
	@JsonIgnore
	public void setPaginas(List<PaginaPerLijst> paginas) {
		this.paginas = paginas;
	}
	//-------------------------------------------------
}
