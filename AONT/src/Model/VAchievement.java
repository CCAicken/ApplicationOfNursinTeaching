package Model;
 
/**
 * VAchievement entity. @author MyEclipse Persistence Tools
 */

public class VAchievement implements java.io.Serializable {

	// Fields

	private Integer achId;
	private Integer diagnosisId;
	private Double inquiryScore;
	private Double chechScore;
	private Double mdScore;
	private Double ndScore;
	private Double allScore;
	private Integer examId;
	private String examName;
	private String startTime;
	private String endTime;
	private String teaId;
	private String diaResult;
	private String stuId;
	private Integer patientId;
	private Integer diaRecordId;
	private String stuName;
	private Integer classId;
	private String stuAgende;
	private String stuNation;
	private String teaName;
	private String teaAgende;
	private String jobTitle;
	private Integer userType;
	private String teaNation;
	private String typeName;

	// Constructors

	/** default constructor */
	public VAchievement() {
	}

	/** full constructor */
	public VAchievement(Integer achId, Integer diagnosisId,
			Double inquiryScore, Double chechScore, Double mdScore,
			Double ndScore, Double allScore, Integer examId, String examName,
			String startTime, String endTime, String teaId,
			String diaResult, String stuId, Integer patientId,
			Integer diaRecordId, String stuName, Integer classId,
			String stuAgende, String stuNation, String teaName,
			String teaAgende, String jobTitle, Integer userType,
			String teaNation, String typeName) {
		this.achId = achId;
		this.diagnosisId = diagnosisId;
		this.inquiryScore = inquiryScore;
		this.chechScore = chechScore;
		this.mdScore = mdScore;
		this.ndScore = ndScore;
		this.allScore = allScore;
		this.examId = examId;
		this.examName = examName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.teaId = teaId;
		this.diaResult = diaResult;
		this.stuId = stuId;
		this.patientId = patientId;
		this.diaRecordId = diaRecordId;
		this.stuName = stuName;
		this.classId = classId;
		this.stuAgende = stuAgende;
		this.stuNation = stuNation;
		this.teaName = teaName;
		this.teaAgende = teaAgende;
		this.jobTitle = jobTitle;
		this.userType = userType;
		this.teaNation = teaNation;
		this.typeName = typeName;
	}

	// Property accessors

	public Integer getAchId() {
		return this.achId;
	}

	public void setAchId(Integer achId) {
		this.achId = achId;
	}

	public Integer getDiagnosisId() {
		return this.diagnosisId;
	}

	public void setDiagnosisId(Integer diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public Double getInquiryScore() {
		return this.inquiryScore;
	}

	public void setInquiryScore(Double inquiryScore) {
		this.inquiryScore = inquiryScore;
	}

	public Double getChechScore() {
		return this.chechScore;
	}

	public void setChechScore(Double chechScore) {
		this.chechScore = chechScore;
	}

	public Double getMdScore() {
		return this.mdScore;
	}

	public void setMdScore(Double mdScore) {
		this.mdScore = mdScore;
	}

	public Double getNdScore() {
		return this.ndScore;
	}

	public void setNdScore(Double ndScore) {
		this.ndScore = ndScore;
	}

	public Double getAllScore() {
		return this.allScore;
	}

	public void setAllScore(Double allScore) {
		this.allScore = allScore;
	}

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

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getStuAgende() {
		return this.stuAgende;
	}

	public void setStuAgende(String stuAgende) {
		this.stuAgende = stuAgende;
	}

	public String getStuNation() {
		return this.stuNation;
	}

	public void setStuNation(String stuNation) {
		this.stuNation = stuNation;
	}

	public String getTeaName() {
		return this.teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public String getTeaAgende() {
		return this.teaAgende;
	}

	public void setTeaAgende(String teaAgende) {
		this.teaAgende = teaAgende;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getTeaNation() {
		return this.teaNation;
	}

	public void setTeaNation(String teaNation) {
		this.teaNation = teaNation;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


}