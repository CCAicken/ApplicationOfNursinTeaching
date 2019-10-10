package Model;



/**
 * TClass entity. @author MyEclipse Persistence Tools
 */

public class TClass implements java.io.Serializable {

	// Fields

	private Integer classId;
	private String className;
	private String createTime;
	private String teaId;
	private Integer gradeId;

	// Constructors

	/** default constructor */
	public TClass() {
	}

	/** full constructor */
	public TClass(String className, String createTime, String teaId,
			Integer gradeId) {
		this.className = className;
		this.createTime = createTime;
		this.teaId = teaId;
		this.gradeId = gradeId;
	}

	// Property accessors

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getTeaId() {
		return this.teaId;
	}

	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}

	public Integer getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

}