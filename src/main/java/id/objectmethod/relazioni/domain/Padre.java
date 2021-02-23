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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "padre")
public class Padre {

	@GeneratedValue
	@Id
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cognome")
	private String cognome;

	@Column(name = "eta")
	private Integer eta;

	@JoinColumn(name = "padre_id") // indichiamo che nella tabella figlio la colonna padre_id fa riferimento all'id
									// di questa entita
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL) // OneToMany è il tipo di relazione
	private List<Figlio> figli;
	// Fetch indica quando vengono estratti da DB le entita collegate
	// LAZY le estrae solo quando chiamiamo il relativo metodo GET
	// EAGER le estrae subito nel momento in cui estraiamo il padre
	// Cascade indica se un operazione di modifica/eliminazione fatta nel padre si
	// deve ripercuotere anche sulle entita collegate

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "birichinate", joinColumns = @JoinColumn(name = "padre_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "amante_id", referencedColumnName = "id"))
	private List<Amante> amanti;
	// padri_auto tabella di correlazione tra padre e automobile, nelle joinColumns
	// indichiamo che padre_id (della tabella padri_auto) fa riferimo a id (della
	// tabella padre)
	// mentre in inverseJoinColumns indichiamo che auto_id (della tabella
	// padri_auto) fa riferimento a id (della tabella automobile).

	public List<Amante> getAmanti() {
		return amanti;
	}

	public void setAmanti(List<Amante> amanti) {
		this.amanti = amanti;
	}

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

}
