package Model;

/**
 * TDiaRecord entity. @author MyEclipse Persistence Tools
 */

public class TDiaRecord implements java.io.Serializable {

	// Fields

	private Integer diaRecordId;
	private Integer problemId;
	private Integer answerId;
	private String remarks;

	// Constructors

	/** default constructor */
	public TDiaRecord() {
	}

	/** full constructor */
	public TDiaRecord(Integer problemId, Integer answerId, String remarks) {
		this.problemId = problemId;
		this.answerId = answerId;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getDiaRecordId() {
		return this.diaRecordId;
	}

	public void setDiaRecordId(Integer diaRecordId) {
		this.diaRecordId = diaRecordId;
	}

	public Integer getProblemId() {
		return this.problemId;
	}

	public void setProblemId(Integer problemId) {
		this.problemId = problemId;
	}

	public Integer getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}