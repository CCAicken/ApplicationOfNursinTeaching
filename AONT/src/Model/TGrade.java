package Model;

/**
 * TGrade entity. @author MyEclipse Persistence Tools
 */

public class TGrade implements java.io.Serializable {

	// Fields

	private Integer gradeId;
	private String gradeName;

	// Constructors

	/** default constructor */
	public TGrade() {
	}

	/** full constructor */
	public TGrade(String gradeName) {
		this.gradeName = gradeName;
	}

	// Property accessors

	public Integer getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return this.gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

}