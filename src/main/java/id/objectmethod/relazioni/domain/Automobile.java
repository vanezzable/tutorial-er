package id.objectmethod.relazioni.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "automobile")
public class Automobile {

	@GeneratedValue
	@Id
	public Long id;
	
	@Column(name="marca")
	public String marca;
	
	@Column(name="modello")
	public String modello;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "padri_auto", joinColumns = @JoinColumn(name = "auto_id", referencedColumnName = "id")
	, inverseJoinColumns = @JoinColumn(name = "padre_id", referencedColumnName = "id"))
	private List<Padre> padri;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public List<Padre> getPadri() {
		return padri;
	}

	public void setPadri(List<Padre> padri) {
		this.padri = padri;
	}	
	
}
