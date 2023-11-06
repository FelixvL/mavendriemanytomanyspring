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
public class Pagina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String deTitel;
	private String schrijver;
	private String inhoud;
	
	@OneToMany(mappedBy = "pagina")
	private Set<PaginaPerLijst> lijsten;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDeTitel() {
		return deTitel;
	}
	public void setDeTitel(String deTitel) {
		this.deTitel = deTitel;
	}
	public String getSchrijver() {
		return schrijver;
	}
	public void setSchrijver(String schrijver) {
		this.schrijver = schrijver;
	}
	public String getInhoud() {
		return inhoud;
	}
	public void setInhoud(String inhoud) {
		this.inhoud = inhoud;
	}
	
	public Set<PaginaPerLijst> getLijsten() {
		return lijsten;
	}
	public void setLijsten(Set<PaginaPerLijst> lijsten) {
		this.lijsten = lijsten;
	}
	
	
	
}
