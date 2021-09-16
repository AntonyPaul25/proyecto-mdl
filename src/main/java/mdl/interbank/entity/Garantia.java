package mdl.interbank.entity;

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
@Table(name = "T_GARANTIAS")
public class Garantia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
	@JsonProperty("codeID")
	private String codeid;

	@JsonProperty("documentIdType")
	private String documentddtype;

	@JsonProperty("documentIdNumber")
	private String documentidnumber;

	@JsonProperty("warrantyNumber")
	private String warrantynumber;

	@JsonProperty("documentCode")
	private String documentcode;

	@JsonProperty("documentName")
	private String documentname;

	@JsonProperty("coverageTypeCode")
	private String coveragetypecode;

	@JsonProperty("typeCoverage")
	private String typecoverage;

	@JsonProperty("currencyCode")
	private String currencycode;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("status")
	private String status;

	@JsonProperty("realizationValue")
	private String realizationvalue;

	@JsonProperty("commercialValue")
	private String commercialvalue;

	@JsonProperty("taxValue")
	private String taxvalue;
	
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

	public String getCodeid() {
		return codeid;
	}

	public void setCodeid(String codeid) {
		this.codeid = codeid;
	}

	public String getDocumentddtype() {
		return documentddtype;
	}

	public void setDocumentddtype(String documentddtype) {
		this.documentddtype = documentddtype;
	}

	public String getDocumentidnumber() {
		return documentidnumber;
	}

	public void setDocumentidnumber(String documentidnumber) {
		this.documentidnumber = documentidnumber;
	}

	public String getWarrantynumber() {
		return warrantynumber;
	}

	public void setWarrantynumber(String warrantynumber) {
		this.warrantynumber = warrantynumber;
	}

	public String getDocumentcode() {
		return documentcode;
	}

	public void setDocumentcode(String documentcode) {
		this.documentcode = documentcode;
	}

	public String getDocumentname() {
		return documentname;
	}

	public void setDocumentname(String documentname) {
		this.documentname = documentname;
	}

	public String getCoveragetypecode() {
		return coveragetypecode;
	}

	public void setCoveragetypecode(String coveragetypecode) {
		this.coveragetypecode = coveragetypecode;
	}

	public String getTypecoverage() {
		return typecoverage;
	}

	public void setTypecoverage(String typecoverage) {
		this.typecoverage = typecoverage;
	}

	public String getCurrencycode() {
		return currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRealizationvalue() {
		return realizationvalue;
	}

	public void setRealizationvalue(String realizationvalue) {
		this.realizationvalue = realizationvalue;
	}

	public String getCommercialvalue() {
		return commercialvalue;
	}

	public void setCommercialvalue(String commercialvalue) {
		this.commercialvalue = commercialvalue;
	}

	public String getTaxvalue() {
		return taxvalue;
	}

	public void setTaxvalue(String taxvalue) {
		this.taxvalue = taxvalue;
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
