package mdl.interbank.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "T_RATING")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;

	@Column(name = "codigounico")
	@JsonIgnore
	private String codigounico;

	@JsonProperty("scaleWithoutException")
	private String escalasinexcepcion;

	@JsonProperty("scaleWithException")
	private String escalaconexcepcion;

	@JsonProperty("SEICode")
	private String codigosei;

	@JsonProperty("SEI")
	private String sei;

	@JsonProperty("financialStatusPeriod")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecperiodo;

	@JsonProperty("updateDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecactualizacion;

	@Column(name = "fechacreacion")
	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;

	@Column(name = "numsolicitud")
	@JsonIgnore
	private String numsolicitud; 
	
	@PrePersist
	private void prePersist() {
		this.fechacreacion = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigounico() {
		return codigounico;
	}

	public void setCodigounico(String codigounico) {
		this.codigounico = codigounico;
	}

	public String getEscalasinexcepcion() {
		return escalasinexcepcion;
	}

	public void setEscalasinexcepcion(String escalasinexcepcion) {
		this.escalasinexcepcion = escalasinexcepcion;
	}

	public String getEscalaconexcepcion() {
		return escalaconexcepcion;
	}

	public void setEscalaconexcepcion(String escalaconexcepcion) {
		this.escalaconexcepcion = escalaconexcepcion;
	}

	public String getCodigosei() {
		return codigosei;
	}

	public void setCodigosei(String codigosei) {
		this.codigosei = codigosei;
	}

	public String getSei() {
		return sei;
	}

	public void setSei(String sei) {
		this.sei = sei;
	}

	public Date getFecperiodo() {
		return fecperiodo;
	}

	public void setFecperiodo(String fecperiodo) throws ParseException {
		System.out.println("fecperiodo => " + fecperiodo);
		// this.fecperiodo = fecperiodo;
		this.fecperiodo = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").parse(fecperiodo);
	}

	public Date getFecactualizacion() {
		return fecactualizacion;
	}

	public void setFecactualizacion(String fecactualizacion) throws ParseException {
		// this.fecactualizacion = fecactualizacion;
		System.out.println("fecactualizacion => " + fecactualizacion);
		this.fecactualizacion = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").parse(fecactualizacion);
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getNumsolicitud() {
		return numsolicitud;
	}

	public void setNumsolicitud(String numsolicitud) {
		this.numsolicitud = numsolicitud;
	}
	
	

}
