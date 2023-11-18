package drie.nieuw.relatiesindrie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PaginaPerLijst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	private int volgorde;
	@ManyToOne
	private Pagina pagina;

	@ManyToOne
	private Lijst lijst;

	// -------------------------------------------------

	public Pagina getPagina() {
		return pagina;
	}
	// -------------------------------------------------

	public void setPagina(Pagina pagina) {
		this.pagina = pagina;
	}
	// -------------------------------------------------

	public Lijst getLijst() {
		return lijst;
	}
	// -------------------------------------------------

	public void setLijst(Lijst lijst) {
		this.lijst = lijst;
	}

	// -------------------------------------------------
	public long getId() {
		return id;
	}

	// -------------------------------------------------
	public void setId(long id) {
		this.id = id;
	}

	// -------------------------------------------------
	public int getVolgorde() {
		return volgorde;
	}

	// -------------------------------------------------
	public void setVolgorde(int volgorde) {
		this.volgorde = volgorde;
	}
	// -------------------------------------------------
}
