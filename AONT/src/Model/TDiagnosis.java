package Model;

/**
 * TDiagnosis entity. @author MyEclipse Persistence Tools
 */

public class TDiagnosis implements java.io.Serializable {

	// Fields

	private Integer diaId;
	private String diaResult;
	private String stuId;
	private Integer patientId;
	private Integer diaRecordId;

	// Constructors

	/** default constructor */
	public TDiagnosis() {
	}

	/** full constructor */
	public TDiagnosis(String diaResult, String stuId, Integer patientId,
			Integer diaRecordId) {
		this.diaResult = diaResult;
		this.stuId = stuId;
		this.patientId = patientId;
		this.diaRecordId = diaRecordId;
	}

	// Property accessors

	public Integer getDiaId() {
		return this.diaId;
	}

	public void setDiaId(Integer diaId) {
		this.diaId = diaId;
	}

	public String getDiaResult() {
		return this.diaResult;
	}

	public void setDiaResult(String diaResult) {
		this.diaResult = diaResult;
	}

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getDiaRecordId() {
		return this.diaRecordId;
	}

	public void setDiaRecordId(Integer diaRecordId) {
		this.diaRecordId = diaRecordId;
	}

}