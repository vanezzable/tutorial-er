package id.objectmethod.relazioni.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="padre")
public class Padre {

	@GeneratedValue
	@Id
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="eta")
	private Integer eta;
	
	@JoinColumn(name="padre_id")
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Figlio> figli;
	
	@ManyToMany
	@JoinTable(name = "padri_auto", joinColumns = @JoinColumn(name = "padre_id", referencedColumnName = "id")
	, inverseJoinColumns = @JoinColumn(name = "auto_id", referencedColumnName = "id"))
	private List<Automobile> automobili;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public List<Figlio> getFigli() {
		return figli;
	}

	public void setFigli(List<Figlio> figli) {
		this.figli = figli;
	}

	public List<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(List<Automobile> automobili) {
		this.automobili = automobili;
	}

}
