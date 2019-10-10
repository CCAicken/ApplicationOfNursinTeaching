package Model;


/**
 * TProblem entity. @author MyEclipse Persistence Tools
 */

public class TProblem implements java.io.Serializable {

	// Fields

	private Integer proId;
	private Integer userId;
	private String content;
	private String createTime;

	// Constructors

	/** default constructor */
	public TProblem() {
	}

	/** full constructor */
	public TProblem(Integer userId, String content, String createTime) {
		this.userId = userId;
		this.content = content;
		this.createTime = createTime;
	}

	// Property accessors

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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