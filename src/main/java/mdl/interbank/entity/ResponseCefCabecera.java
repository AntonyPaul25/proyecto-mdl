package mdl.interbank.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseCefCabecera {

	@JsonProperty("Table")
	private List<EstadoFinanciero> table;

	public List<EstadoFinanciero> getTable() {
		return table;
	}

	public void setTable(List<EstadoFinanciero> table) {
		this.table = table;
	}

}
