package model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Plan {
	@Id @GeneratedValue
	private Long id;
    private Timestamp systemStartDate;
    private Timestamp systemEndDate;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Territory territory;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Documents> documents;
    private String budget;
    
    public Plan(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getSystemStartDate() {
		return systemStartDate;
	}

	public void setSystemStartDate(Timestamp systemStartDate) {
		this.systemStartDate = systemStartDate;
	}

	public Timestamp getSystemEndDate() {
		return systemEndDate;
	}

	public void setSystemEndDate(Timestamp systemEndDate) {
		this.systemEndDate = systemEndDate;
	}

	public Territory getTerritory() {
		return territory;
	}

	public void setTerritory(Territory territory) {
		this.territory = territory;
	}

	public List<Documents> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	
}
