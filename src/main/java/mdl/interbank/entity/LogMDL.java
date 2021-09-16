package mdl.interbank.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tblog")
public class LogMDL {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty("descripcion")
	private String descripcion;

	@JsonProperty("fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;

	@PrePersist
	public void prePersis() {
		this.fechacreacion = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LogMDL() {
		super();
	}

	public LogMDL(@NotEmpty String descripcion) {
		super();
		this.descripcion = descripcion;
	}

}
