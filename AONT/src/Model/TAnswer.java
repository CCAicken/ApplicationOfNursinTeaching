package Model;



/**
 * TAnswer entity. @author MyEclipse Persistence Tools
 */

public class TAnswer implements java.io.Serializable {

	// Fields

	private Integer answerId;
	private Integer patientId;
	private String content;
	private String createTime;

	// Constructors

	/** default constructor */
	public TAnswer() {
	}

	/** full constructor */
	public TAnswer(Integer patientId, String content, String createTime) {
		this.patientId = patientId;
		this.content = content;
		this.createTime = createTime;
	}

	// Property accessors

	public Integer getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}