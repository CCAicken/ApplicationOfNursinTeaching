package Model;

 

/**
 * VTeacher entity. @author MyEclipse Persistence Tools
 */

public class VTeacher implements java.io.Serializable {

	// Fields

	private String teaId;
	private String teaName;
	private String teaPhoto;
	private String agend;
	private String jobTitle;
	private String teapwd;
	private String createTime;
	private Integer userType;
	private String nation;
	private String typeName;

	// Constructors

	/** default constructor */
	public VTeacher() {
	}

	/** minimal constructor */
	public VTeacher(String teaId, String teaName, String agend,
			String jobTitle, String teapwd, String createTime,
			Integer userType, String nation, String typeName) {
		this.teaId = teaId;
		this.teaName = teaName;
		this.agend = agend;
		this.jobTitle = jobTitle;
		this.teapwd = teapwd;
		this.createTime = createTime;
		this.userType = userType;
		this.nation = nation;
		this.typeName = typeName;
	}

	/** full constructor */
	public VTeacher(String teaId, String teaName, String teaPhoto,
			String agend, String jobTitle, String teapwd, String createTime,
			Integer userType, String nation, String typeName) {
		this.teaId = teaId;
		this.teaName = teaName;
		this.teaPhoto = teaPhoto;
		this.agend = agend;
		this.jobTitle = jobTitle;
		this.teapwd = teapwd;
		this.createTime = createTime;
		this.userType = userType;
		this.nation = nation;
		this.typeName = typeName;
	}

	// Property accessors

	public String getTeaId() {
		return this.teaId;
	}

	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}

	public String getTeaName() {
		return this.teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public String getTeaPhoto() {
		return this.teaPhoto;
	}

	public void setTeaPhoto(String teaPhoto) {
		this.teaPhoto = teaPhoto;
	}

	public String getAgend() {
		return this.agend;
	}

	public void setAgend(String agend) {
		this.agend = agend;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getTeapwd() {
		return this.teapwd;
	}

	public void setTeapwd(String teapwd) {
		this.teapwd = teapwd;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


}