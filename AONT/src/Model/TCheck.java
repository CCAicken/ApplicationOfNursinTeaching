package Model;

/**
 * TCheck entity. @author MyEclipse Persistence Tools
 */

public class TCheck implements java.io.Serializable {

	// Fields

	private Integer checkId;
	private String checkItem;
	private String checkTheResult;
	private Integer patientId;

	// Constructors

	/** default constructor */
	public TCheck() {
	}

	/** full constructor */
	public TCheck(String checkItem, String checkTheResult, Integer patientId) {
		this.checkItem = checkItem;
		this.checkTheResult = checkTheResult;
		this.patientId = patientId;
	}

	// Property accessors

	public Integer getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}

	public String getCheckItem() {
		return this.checkItem;
	}

	public void setCheckItem(String checkItem) {
		this.checkItem = checkItem;
	}

	public String getCheckTheResult() {
		return this.checkTheResult;
	}

	public void setCheckTheResult(String checkTheResult) {
		this.checkTheResult = checkTheResult;
	}

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

}