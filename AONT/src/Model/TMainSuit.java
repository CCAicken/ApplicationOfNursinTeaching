package Model;

/**
 * TMainSuit entity. @author MyEclipse Persistence Tools
 */

public class TMainSuit implements java.io.Serializable {

	// Fields

	private Integer mainSuitId;
	private String symptom;
	private String nature;
	private String lengthOfTime;
	private String degree;
	private Integer patId;

	// Constructors

	/** default constructor */
	public TMainSuit() {
	}

	/** full constructor */
	public TMainSuit(String symptom, String nature, String lengthOfTime,
			String degree, Integer patId) {
		this.symptom = symptom;
		this.nature = nature;
		this.lengthOfTime = lengthOfTime;
		this.degree = degree;
		this.patId = patId;
	}

	// Property accessors

	public Integer getMainSuitId() {
		return this.mainSuitId;
	}

	public void setMainSuitId(Integer mainSuitId) {
		this.mainSuitId = mainSuitId;
	}

	public String getSymptom() {
		return this.symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getLengthOfTime() {
		return this.lengthOfTime;
	}

	public void setLengthOfTime(String lengthOfTime) {
		this.lengthOfTime = lengthOfTime;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getPatId() {
		return this.patId;
	}

	public void setPatId(Integer patId) {
		this.patId = patId;
	}

}