package Model;

import java.sql.Timestamp;

/**
 * VAchievementId entity. @author MyEclipse Persistence Tools
 */

public class VAchievementId implements java.io.Serializable {

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
	private Timestamp startTime;
	private Timestamp endTime;
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
	public VAchievementId() {
	}

	/** full constructor */
	public VAchievementId(Integer achId, Integer diagnosisId,
			Double inquiryScore, Double chechScore, Double mdScore,
			Double ndScore, Double allScore, Integer examId, String examName,
			Timestamp startTime, Timestamp endTime, String teaId,
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

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VAchievementId))
			return false;
		VAchievementId castOther = (VAchievementId) other;

		return ((this.getAchId() == castOther.getAchId()) || (this.getAchId() != null
				&& castOther.getAchId() != null && this.getAchId().equals(
				castOther.getAchId())))
				&& ((this.getDiagnosisId() == castOther.getDiagnosisId()) || (this
						.getDiagnosisId() != null
						&& castOther.getDiagnosisId() != null && this
						.getDiagnosisId().equals(castOther.getDiagnosisId())))
				&& ((this.getInquiryScore() == castOther.getInquiryScore()) || (this
						.getInquiryScore() != null
						&& castOther.getInquiryScore() != null && this
						.getInquiryScore().equals(castOther.getInquiryScore())))
				&& ((this.getChechScore() == castOther.getChechScore()) || (this
						.getChechScore() != null
						&& castOther.getChechScore() != null && this
						.getChechScore().equals(castOther.getChechScore())))
				&& ((this.getMdScore() == castOther.getMdScore()) || (this
						.getMdScore() != null && castOther.getMdScore() != null && this
						.getMdScore().equals(castOther.getMdScore())))
				&& ((this.getNdScore() == castOther.getNdScore()) || (this
						.getNdScore() != null && castOther.getNdScore() != null && this
						.getNdScore().equals(castOther.getNdScore())))
				&& ((this.getAllScore() == castOther.getAllScore()) || (this
						.getAllScore() != null
						&& castOther.getAllScore() != null && this
						.getAllScore().equals(castOther.getAllScore())))
				&& ((this.getExamId() == castOther.getExamId()) || (this
						.getExamId() != null && castOther.getExamId() != null && this
						.getExamId().equals(castOther.getExamId())))
				&& ((this.getExamName() == castOther.getExamName()) || (this
						.getExamName() != null
						&& castOther.getExamName() != null && this
						.getExamName().equals(castOther.getExamName())))
				&& ((this.getStartTime() == castOther.getStartTime()) || (this
						.getStartTime() != null
						&& castOther.getStartTime() != null && this
						.getStartTime().equals(castOther.getStartTime())))
				&& ((this.getEndTime() == castOther.getEndTime()) || (this
						.getEndTime() != null && castOther.getEndTime() != null && this
						.getEndTime().equals(castOther.getEndTime())))
				&& ((this.getTeaId() == castOther.getTeaId()) || (this
						.getTeaId() != null && castOther.getTeaId() != null && this
						.getTeaId().equals(castOther.getTeaId())))
				&& ((this.getDiaResult() == castOther.getDiaResult()) || (this
						.getDiaResult() != null
						&& castOther.getDiaResult() != null && this
						.getDiaResult().equals(castOther.getDiaResult())))
				&& ((this.getStuId() == castOther.getStuId()) || (this
						.getStuId() != null && castOther.getStuId() != null && this
						.getStuId().equals(castOther.getStuId())))
				&& ((this.getPatientId() == castOther.getPatientId()) || (this
						.getPatientId() != null
						&& castOther.getPatientId() != null && this
						.getPatientId().equals(castOther.getPatientId())))
				&& ((this.getDiaRecordId() == castOther.getDiaRecordId()) || (this
						.getDiaRecordId() != null
						&& castOther.getDiaRecordId() != null && this
						.getDiaRecordId().equals(castOther.getDiaRecordId())))
				&& ((this.getStuName() == castOther.getStuName()) || (this
						.getStuName() != null && castOther.getStuName() != null && this
						.getStuName().equals(castOther.getStuName())))
				&& ((this.getClassId() == castOther.getClassId()) || (this
						.getClassId() != null && castOther.getClassId() != null && this
						.getClassId().equals(castOther.getClassId())))
				&& ((this.getStuAgende() == castOther.getStuAgende()) || (this
						.getStuAgende() != null
						&& castOther.getStuAgende() != null && this
						.getStuAgende().equals(castOther.getStuAgende())))
				&& ((this.getStuNation() == castOther.getStuNation()) || (this
						.getStuNation() != null
						&& castOther.getStuNation() != null && this
						.getStuNation().equals(castOther.getStuNation())))
				&& ((this.getTeaName() == castOther.getTeaName()) || (this
						.getTeaName() != null && castOther.getTeaName() != null && this
						.getTeaName().equals(castOther.getTeaName())))
				&& ((this.getTeaAgende() == castOther.getTeaAgende()) || (this
						.getTeaAgende() != null
						&& castOther.getTeaAgende() != null && this
						.getTeaAgende().equals(castOther.getTeaAgende())))
				&& ((this.getJobTitle() == castOther.getJobTitle()) || (this
						.getJobTitle() != null
						&& castOther.getJobTitle() != null && this
						.getJobTitle().equals(castOther.getJobTitle())))
				&& ((this.getUserType() == castOther.getUserType()) || (this
						.getUserType() != null
						&& castOther.getUserType() != null && this
						.getUserType().equals(castOther.getUserType())))
				&& ((this.getTeaNation() == castOther.getTeaNation()) || (this
						.getTeaNation() != null
						&& castOther.getTeaNation() != null && this
						.getTeaNation().equals(castOther.getTeaNation())))
				&& ((this.getTypeName() == castOther.getTypeName()) || (this
						.getTypeName() != null
						&& castOther.getTypeName() != null && this
						.getTypeName().equals(castOther.getTypeName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAchId() == null ? 0 : this.getAchId().hashCode());
		result = 37
				* result
				+ (getDiagnosisId() == null ? 0 : this.getDiagnosisId()
						.hashCode());
		result = 37
				* result
				+ (getInquiryScore() == null ? 0 : this.getInquiryScore()
						.hashCode());
		result = 37
				* result
				+ (getChechScore() == null ? 0 : this.getChechScore()
						.hashCode());
		result = 37 * result
				+ (getMdScore() == null ? 0 : this.getMdScore().hashCode());
		result = 37 * result
				+ (getNdScore() == null ? 0 : this.getNdScore().hashCode());
		result = 37 * result
				+ (getAllScore() == null ? 0 : this.getAllScore().hashCode());
		result = 37 * result
				+ (getExamId() == null ? 0 : this.getExamId().hashCode());
		result = 37 * result
				+ (getExamName() == null ? 0 : this.getExamName().hashCode());
		result = 37 * result
				+ (getStartTime() == null ? 0 : this.getStartTime().hashCode());
		result = 37 * result
				+ (getEndTime() == null ? 0 : this.getEndTime().hashCode());
		result = 37 * result
				+ (getTeaId() == null ? 0 : this.getTeaId().hashCode());
		result = 37 * result
				+ (getDiaResult() == null ? 0 : this.getDiaResult().hashCode());
		result = 37 * result
				+ (getStuId() == null ? 0 : this.getStuId().hashCode());
		result = 37 * result
				+ (getPatientId() == null ? 0 : this.getPatientId().hashCode());
		result = 37
				* result
				+ (getDiaRecordId() == null ? 0 : this.getDiaRecordId()
						.hashCode());
		result = 37 * result
				+ (getStuName() == null ? 0 : this.getStuName().hashCode());
		result = 37 * result
				+ (getClassId() == null ? 0 : this.getClassId().hashCode());
		result = 37 * result
				+ (getStuAgende() == null ? 0 : this.getStuAgende().hashCode());
		result = 37 * result
				+ (getStuNation() == null ? 0 : this.getStuNation().hashCode());
		result = 37 * result
				+ (getTeaName() == null ? 0 : this.getTeaName().hashCode());
		result = 37 * result
				+ (getTeaAgende() == null ? 0 : this.getTeaAgende().hashCode());
		result = 37 * result
				+ (getJobTitle() == null ? 0 : this.getJobTitle().hashCode());
		result = 37 * result
				+ (getUserType() == null ? 0 : this.getUserType().hashCode());
		result = 37 * result
				+ (getTeaNation() == null ? 0 : this.getTeaNation().hashCode());
		result = 37 * result
				+ (getTypeName() == null ? 0 : this.getTypeName().hashCode());
		return result;
	}

}