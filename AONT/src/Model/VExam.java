package Model;
 

/**
 * VExam entity. @author MyEclipse Persistence Tools
 */

public class VExam implements java.io.Serializable {

	private Integer examId;
	private String examName;
	private String startTime;
	private String endTime;
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
	public VExam() {
	}

	/** minimal constructor */
	public VExam(Integer examId, String examName, String startTime,
			String endTime, String teaId, String teaName, String agend,
			String jobTitle, String teapwd, String createTime,
			Integer userType, String nation, String typeName) {
		this.examId = examId;
		this.examName = examName;
		this.startTime = startTime;
		this.endTime = endTime;
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
	public VExam(Integer examId, String examName, String startTime,
			String endTime, String teaId, String teaName, String teaPhoto,
			String agend, String jobTitle, String teapwd, String createTime,
			Integer userType, String nation, String typeName) {
		this.examId = examId;
		this.examName = examName;
		this.startTime = startTime;
		this.endTime = endTime;
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

	public Integer getExamId() {
		return this.examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return this.examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

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