package Model;

/**
 * THPI entity. @author MyEclipse Persistence Tools
 */

public class THPI implements java.io.Serializable {

	// Fields

	private Integer hpiid;
	private String onsetCondition;
	private String pathogeny;
	private String mainSymptoms;
	private String accompaniedSymptoms;
	private String developmentOfIllness;
	private String treatmentAndNursing;
	private Integer patId;

	// Constructors

	/** default constructor */
	public THPI() {
	}

	/** full constructor */
	public THPI(String onsetCondition, String pathogeny, String mainSymptoms,
			String accompaniedSymptoms, String developmentOfIllness,
			String treatmentAndNursing, Integer patId) {
		this.onsetCondition = onsetCondition;
		this.pathogeny = pathogeny;
		this.mainSymptoms = mainSymptoms;
		this.accompaniedSymptoms = accompaniedSymptoms;
		this.developmentOfIllness = developmentOfIllness;
		this.treatmentAndNursing = treatmentAndNursing;
		this.patId = patId;
	}

	// Property accessors

	public Integer getHpiid() {
		return this.hpiid;
	}

	public void setHpiid(Integer hpiid) {
		this.hpiid = hpiid;
	}

	public String getOnsetCondition() {
		return this.onsetCondition;
	}

	public void setOnsetCondition(String onsetCondition) {
		this.onsetCondition = onsetCondition;
	}

	public String getPathogeny() {
		return this.pathogeny;
	}

	public void setPathogeny(String pathogeny) {
		this.pathogeny = pathogeny;
	}

	public String getMainSymptoms() {
		return this.mainSymptoms;
	}

	public void setMainSymptoms(String mainSymptoms) {
		this.mainSymptoms = mainSymptoms;
	}

	public String getAccompaniedSymptoms() {
		return this.accompaniedSymptoms;
	}

	public void setAccompaniedSymptoms(String accompaniedSymptoms) {
		this.accompaniedSymptoms = accompaniedSymptoms;
	}

	public String getDevelopmentOfIllness() {
		return this.developmentOfIllness;
	}

	public void setDevelopmentOfIllness(String developmentOfIllness) {
		this.developmentOfIllness = developmentOfIllness;
	}

	public String getTreatmentAndNursing() {
		return this.treatmentAndNursing;
	}

	public void setTreatmentAndNursing(String treatmentAndNursing) {
		this.treatmentAndNursing = treatmentAndNursing;
	}

	public Integer getPatId() {
		return this.patId;
	}

	public void setPatId(Integer patId) {
		this.patId = patId;
	}

}