package model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Territory {
	@Id @GeneratedValue
    private Long id;
    private Timestamp systemStartDate;
    private Timestamp systemEndDate;
    private int urisId;
    private String type;
    private String name;
    private String territoryLevel;
    private String polygon;
    private List<String> observations;
 
    
    public Territory(){}

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

	public int getUrisId() {
		return urisId;
	}

	public void setUrisId(int urisId) {
		this.urisId = urisId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTerritoryLevel() {
		return territoryLevel;
	}

	public void setTerritoryLevel(String territoryLevel) {
		this.territoryLevel = territoryLevel;
	}

	public String getPolygon() {
		return polygon;
	}

	public void setPolygon(String polygon) {
		this.polygon = polygon;
	}

	public List<String> getObservations() {
		return observations;
	}

	public void setObservations(List<String> observations) {
		this.observations = observations;
	}


    
    
}
