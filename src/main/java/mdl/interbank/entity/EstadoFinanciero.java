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
@Table(name = "T_ESTADOS_FINANCIEROS")
public class EstadoFinanciero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;

	@Column(name = "CodUnico")
	@JsonProperty("codeID")
	private String codigounico;

	@Column(name = "CodTipoEEFF")
	@JsonProperty("codeTypeEEFF")
	private int codtipoef;

	@Column(name = "TipoEEFF")
	@JsonProperty("typeEEFF")
	private String tipoef;

	@Column(name = "FechaEEFF")
	@JsonProperty("dateEEFF")
	private String fechaef;

	@Column(name = "CodMoneda")
	@JsonProperty("currencyCode")
	private int codigomoneda;

	@Column(name = "Moneda")
	@JsonProperty("currency")
	private String moneda;

	@Column(name = "VentasNetas")
	@JsonProperty("netSales")
	private double ventasnetas;

	@Column(name = "EBITDA")
	@JsonProperty("EBITDA")
	private double ebitda;

	@Column(name = "Patrimonio")
	@JsonProperty("heritage")
	private double patrimonio;

	@Column(name = "ActivoCorriente")
	@JsonProperty("currentAssets")
	private double activocorriente;

	@Column(name = "PasivoCorriente")
	@JsonProperty("currentPasives")
	private double pasivocorriente;

	@Column(name = "GastosVentas")
	@JsonProperty("salesExpenses")
	private double gastosventas;

	@Column(name = "GastosAdministrativos")
	@JsonProperty("admExpenses")
	private double gastosadministrativos;

	@Column(name = "GastosFinanciero")
	@JsonProperty("financialExpenses")
	private double gastosfinancieros;

	@Column(name = "Depreciación")
	@JsonProperty("depreciation")
	private double depreciacion;

	@Column(name = "Amortización")
	@JsonProperty("amortization")
	private double amortizacion;

	@Column(name = "CajaBancos")
	@JsonProperty("banksCashier")
	private double cajabancos;

	@Column(name = "SobregiroDeudaBancaria")
	@JsonProperty("bankDebtOverdraft")
	private double sobregirodeudabancaria;

	@Column(name = "ParteCteDeudaLP")
	@JsonProperty("partCteLongTermDebt")
	private double partectedeudalp;

	@Column(name = "ActivoIntangible")
	@JsonProperty("intangibleAsset")
	private double activointangible;

	@Column(name = "UtilidadNeta")
	@JsonProperty("netProfit")
	private double utilidadneta;

	@Column(name = "TotalActivo")
	@JsonProperty("totalAssets")
	private double totalactivo;

	@Column(name = "TotalPasivoCorriente")
	@JsonProperty("totalCurrentLiabilities")
	private double totalpasivocorriente;

	@Column(name = "CapitalTrabajo")
	@JsonProperty("workingCapital")
	private double capitaltrabajo;

	@Column(name = "ActivoTotal")
	@JsonProperty("totalActive")
	private double activototal;

	@Column(name = "TotalPasivo")
	@JsonProperty("totalLiabilities")
	private double totalpasivo;

	@Column(name = "OtrosIngresosOperacionales")
	@JsonProperty("otherOperatingIncome")
	private double otrosingresos;

	@Column(name = "CostoVentas")
	@JsonProperty("costOfSales")
	private double costoventas;

	@Column(name = "TotalPasivoNoCorriente")
	@JsonProperty("totalNonCurrentLiabilities")
	private double totalpasivonocorriente;

	@Column(name = "DeudaBancariaLP")
	@JsonProperty("longTermBankDebt")
	private double deudabancaria;

	@Column(name = "DeudaFinancieraLP")
	@JsonProperty("longTermFinancialDebt")
	private double deudafinanciera;

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

	public int getCodtipoef() {
		return codtipoef;
	}

	public void setCodtipoef(int codtipoef) {
		this.codtipoef = codtipoef;
	}

	public String getTipoef() {
		return tipoef;
	}

	public void setTipoef(String tipoef) {
		this.tipoef = tipoef;
	}

	public String getFechaef() {
		return fechaef;
	}

	public void setFechaef(String fechaef) {
		this.fechaef = fechaef;
	}

	public int getCodigomoneda() {
		return codigomoneda;
	}

	public void setCodigomoneda(int codigomoneda) {
		this.codigomoneda = codigomoneda;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public double getVentasnetas() {
		return ventasnetas;
	}

	public void setVentasnetas(double ventasnetas) {
		this.ventasnetas = ventasnetas;
	}

	public double getEbitda() {
		return ebitda;
	}

	public void setEbitda(double ebitda) {
		this.ebitda = ebitda;
	}

	public double getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}

	public double getActivocorriente() {
		return activocorriente;
	}

	public void setActivocorriente(double activocorriente) {
		this.activocorriente = activocorriente;
	}

	public double getPasivocorriente() {
		return pasivocorriente;
	}

	public void setPasivocorriente(double pasivocorriente) {
		this.pasivocorriente = pasivocorriente;
	}

	public double getGastosventas() {
		return gastosventas;
	}

	public void setGastosventas(double gastosventas) {
		this.gastosventas = gastosventas;
	}

	public double getGastosadministrativos() {
		return gastosadministrativos;
	}

	public void setGastosadministrativos(double gastosadministrativos) {
		this.gastosadministrativos = gastosadministrativos;
	}

	public double getGastosfinancieros() {
		return gastosfinancieros;
	}

	public void setGastosfinancieros(double gastosfinancieros) {
		this.gastosfinancieros = gastosfinancieros;
	}

	public double getDepreciacion() {
		return depreciacion;
	}

	public void setDepreciacion(double depreciacion) {
		this.depreciacion = depreciacion;
	}

	public double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public double getCajabancos() {
		return cajabancos;
	}

	public void setCajabancos(double cajabancos) {
		this.cajabancos = cajabancos;
	}

	public double getSobregirodeudabancaria() {
		return sobregirodeudabancaria;
	}

	public void setSobregirodeudabancaria(double sobregirodeudabancaria) {
		this.sobregirodeudabancaria = sobregirodeudabancaria;
	}

	public double getPartectedeudalp() {
		return partectedeudalp;
	}

	public void setPartectedeudalp(double partectedeudalp) {
		this.partectedeudalp = partectedeudalp;
	}

	public double getActivointangible() {
		return activointangible;
	}

	public void setActivointangible(double activointangible) {
		this.activointangible = activointangible;
	}

	public double getUtilidadneta() {
		return utilidadneta;
	}

	public void setUtilidadneta(double utilidadneta) {
		this.utilidadneta = utilidadneta;
	}

	public double getTotalactivo() {
		return totalactivo;
	}

	public void setTotalactivo(double totalactivo) {
		this.totalactivo = totalactivo;
	}

	public double getTotalpasivocorriente() {
		return totalpasivocorriente;
	}

	public void setTotalpasivocorriente(double totalpasivocorriente) {
		this.totalpasivocorriente = totalpasivocorriente;
	}

	public double getCapitaltrabajo() {
		return capitaltrabajo;
	}

	public void setCapitaltrabajo(double capitaltrabajo) {
		this.capitaltrabajo = capitaltrabajo;
	}

	public double getActivototal() {
		return activototal;
	}

	public void setActivototal(double activototal) {
		this.activototal = activototal;
	}

	public double getTotalpasivo() {
		return totalpasivo;
	}

	public void setTotalpasivo(double totalpasivo) {
		this.totalpasivo = totalpasivo;
	}

	public double getOtrosingresos() {
		return otrosingresos;
	}

	public void setOtrosingresos(double otrosingresos) {
		this.otrosingresos = otrosingresos;
	}

	public double getCostoventas() {
		return costoventas;
	}

	public void setCostoventas(double costoventas) {
		this.costoventas = costoventas;
	}

	public double getTotalpasivonocorriente() {
		return totalpasivonocorriente;
	}

	public void setTotalpasivonocorriente(double totalpasivonocorriente) {
		this.totalpasivonocorriente = totalpasivonocorriente;
	}

	public double getDeudabancaria() {
		return deudabancaria;
	}

	public void setDeudabancaria(double deudabancaria) {
		this.deudabancaria = deudabancaria;
	}

	public double getDeudafinanciera() {
		return deudafinanciera;
	}

	public void setDeudafinanciera(double deudafinanciera) {
		this.deudafinanciera = deudafinanciera;
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
