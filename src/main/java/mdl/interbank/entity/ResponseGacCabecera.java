package mdl.interbank.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseGacCabecera {

	@JsonProperty("Datos")
	private List<Garantia> datos;

	public List<Garantia> getDatos() {
		return datos;
	}

	public void setDatos(List<Garantia> datos) {
		this.datos = datos;
	}

}
