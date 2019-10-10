package Model;



/**
 * TExam entity. @author MyEclipse Persistence Tools
 */

public class TExam implements java.io.Serializable {

	// Fields

	private Integer examId;
	private String examName;
	private String startTime;
	private String endTime;
	private String teaId;

	// Constructors

	/** default constructor */
	public TExam() {
	}

	/** full constructor */
	public TExam(String examName, String startTime, String endTime,
			String teaId) {
		this.examName = examName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.teaId = teaId;
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

}