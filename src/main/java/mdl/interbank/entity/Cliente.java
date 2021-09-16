package mdl.interbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLIENTES")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "COD_UNICO")
	private String codigounico;

	@Column(name = "TIP_DOCUMENTO")
	private int tipodocumento;

	@Column(name = "NUM_DOCUMENTO")
	private String numerodocumento;

	@Column(name = "RAZ_SOCIAL")
	private String razonsocial;
	
	@Column(name = "FEC_CREACION")
	private String fechacreacion;
	
	@Column(name = "USR_CREACION")
	private String usuariocreacion;
	
	
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

	public int getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getUsuariocreacion() {
		return usuariocreacion;
	}

	public void setUsuariocreacion(String usuariocreacion) {
		this.usuariocreacion = usuariocreacion;
	}

}
