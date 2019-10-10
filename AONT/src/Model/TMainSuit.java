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

	// Constructors

	/** default constructor */
	public TMainSuit() {
	}

	/** full constructor */
	public TMainSuit(String symptom, String nature, String lengthOfTime,
			String degree) {
		this.symptom = symptom;
		this.nature = nature;
		this.lengthOfTime = lengthOfTime;
		this.degree = degree;
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

}