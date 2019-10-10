package Model;

/**
 * TDepartment entity. @author MyEclipse Persistence Tools
 */

public class TDepartment implements java.io.Serializable {

	// Fields

	private Integer depId;
	private String depName;

	// Constructors

	/** default constructor */
	public TDepartment() {
	}

	/** full constructor */
	public TDepartment(String depName) {
		this.depName = depName;
	}

	// Property accessors

	public Integer getDepId() {
		return this.depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

}