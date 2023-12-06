package drie.nieuw.relatiesindrie.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
	private String title;
	private String subtitle;
	private String author;
	@Column(length=20000) // Q:het heeft GEEN effect op de varchar size in de database, 
	// het wordt een text-veld -> ik begrijp het verschil niet met song.java uit SONGBOOK
	// bovendien heb ik het veld handmatig goed gezet in phpMyAdmin... dat moet beter!
	String codetext;	
	@OneToMany(mappedBy = "pagina", cascade = CascadeType.REMOVE)
	private List<PaginaPerLijst> lijsten;
	//-------------------------------------------------
	public String getAuthor() {
		return author;
	}
	//-------------------------------------------------
	public void setAuthor(String author) {
		this.author = author;
	}
	//-------------------------------------------------	
	public String getCodetext() {
		return codetext;
	}
	//-------------------------------------------------
	public void setCodetext(String codetext) {
		this.codetext = codetext;
	}
	//------------------------------------------------
	public String getSubtitle() {
		return subtitle;
	}
	//-------------------------------------------------
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	//-------------------------------------------------
	public long getId() {
		return id;
	}
	//-------------------------------------------------
	public void setId(long id) {
		this.id = id;
	}
	//-------------------------------------------------
	public String getTitle() {
		return title;
	}
	//-------------------------------------------------
	public void setTitle(String title) {
		this.title = title;
	}
	//-------------------------------------------------
	@JsonIgnore
	public List<PaginaPerLijst> getLijsten() {
		return lijsten;
	}
	//-------------------------------------------------
	@JsonIgnore
	public void setLijsten(List<PaginaPerLijst> lijsten) {
		this.lijsten = lijsten;
	}
	//-------------------------------------------------
}
