package mdl.interbank.entity;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteRequest {

	@NotEmpty
	@JsonProperty("numsolicitud")
	private String numsolicitud;

	@NotEmpty
	@JsonProperty("codeID")
	private String codeId;

	@NotEmpty
	@JsonProperty("documentIdType")
	private String documentIdType;

	@NotEmpty
	@JsonProperty("documentIdNumber")
	private String documentIdNumber;

	public String getNumsolicitud() {
		return numsolicitud;
	}

	public void setNumsolicitud(String numsolicitud) {
		this.numsolicitud = numsolicitud;
	}

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getDocumentIdType() {
		return documentIdType;
	}

	public void setDocumentIdType(String documentIdType) {
		this.documentIdType = documentIdType;
	}

	public String getDocumentIdNumber() {
		return documentIdNumber;
	}

	public void setDocumentIdNumber(String documentIdNumber) {
		this.documentIdNumber = documentIdNumber;
	}

}
