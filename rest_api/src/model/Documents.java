package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Documents {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String documentType;
	private String asdisCode;

	
	public Documents(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getAsdisCode() {
		return asdisCode;
	}

	public void setAsdisCode(String asdisCode) {
		this.asdisCode = asdisCode;
	}


	
}
