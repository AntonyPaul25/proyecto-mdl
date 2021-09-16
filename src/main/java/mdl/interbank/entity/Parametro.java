package mdl.interbank.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "t_parametros")
public class Parametro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;

	@JsonIgnore
	@Column(name = "orden", insertable = false, updatable = false)
	private Long orden;

	@Column(name = "codigo", insertable = false, updatable = false)
	private String codigo;

	@JsonIgnore
	@Column(name = "agrupador", insertable = false, updatable = false)
	private String agrupador;

	@Column(name = "descripcion", insertable = false, updatable = false)
	private String descripcion;

	@JsonIgnore
	@Column(name = "auxiliar1", insertable = false, updatable = false)
	private String auxiliar1;

	@JsonIgnore
	@Column(name = "auxiliar2", insertable = false, updatable = false)
	private String auxiliar2;

	@JsonIgnore
	@Column(name = "estado", insertable = false, updatable = false)
	private boolean estado;

	@JsonIgnore
	@Column(name = "fechacreacion", insertable = false, updatable = false)
	private Date fechacreacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getOrden() {
		return orden;
	}

	public void setOrden(Long orden) {
		this.orden = orden;
	}

	public String getAgrupador() {
		return agrupador;
	}

	public void setAgrupador(String agrupador) {
		this.agrupador = agrupador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAuxiliar1() {
		return auxiliar1;
	}

	public void setAuxiliar1(String auxiliar1) {
		this.auxiliar1 = auxiliar1;
	}

	public String getAuxiliar2() {
		return auxiliar2;
	}

	public void setAuxiliar2(String auxiliar2) {
		this.auxiliar2 = auxiliar2;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

}
