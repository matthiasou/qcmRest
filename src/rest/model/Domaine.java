package rest.model;

public class Domaine {
	private Integer id;
	private String libelle;
	
	@Override
	public String toString() {
		return "Domaine [id=" + id + ", libelle=" + libelle + "]";
	}
	public Domaine() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
