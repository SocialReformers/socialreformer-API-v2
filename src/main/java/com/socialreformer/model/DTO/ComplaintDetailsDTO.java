package com.socialreformer.model.DTO;

public class ComplaintDetailsDTO {
	private Integer id;	
	private String type;
	private String description;
	private String locality;	
	private Integer socialId;
	private String tomailId;

	private String causeId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public Integer getSocialId() {
		return socialId;
	}
	public void setSocialId(Integer socialId) {
		this.socialId = socialId;
	}
	public String getTomailId() {
		return tomailId;
	}
	public void setTomailId(String tomailId) {
		this.tomailId = tomailId;
	}

	public String getCauseId() {
		return causeId;
	}
	public void setCauseId(String causeId) {
		this.causeId = causeId;
	}
	
	
}
