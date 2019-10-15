package Model;

/**
 * TAchievement entity. @author MyEclipse Persistence Tools
 */

public class TAchievement implements java.io.Serializable {

	// Fields

	private Integer achId;
	private Integer diagnosisId;
	private Double inquiryScore;
	private Double chechScore;
	private Double mdScore;
	private Double ndScore;
	private Double allScore;
	private Integer examId;

	// Constructors

	/** default constructor */
	public TAchievement() {
	}

	/** full constructor */
	public TAchievement(Integer diagnosisId, Double inquiryScore,
			Double chechScore, Double mdScore, Double ndScore, Double allScore,
			Integer examId) {
		this.diagnosisId = diagnosisId;
		this.inquiryScore = inquiryScore;
		this.chechScore = chechScore;
		this.mdScore = mdScore;
		this.ndScore = ndScore;
		this.allScore = allScore;
		this.examId = examId;
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

}