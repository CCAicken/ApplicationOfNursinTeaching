package Model;



/**
 * TStudent entity. @author MyEclipse Persistence Tools
 */

public class TStudent implements java.io.Serializable {

	// Fields

	private String stuId;
	private String stuName;
	private String stuPhoto;
	private String stupwd;
	private Integer classId;
	private String createTime;
	private String agend;
	private String nation;

	// Constructors

	/** default constructor */
	public TStudent() {
	}

	/** minimal constructor */
	public TStudent(String stuId, String stuName, String stupwd,
			Integer classId, String createTime, String agend, String nation) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stupwd = stupwd;
		this.classId = classId;
		this.createTime = createTime;
		this.agend = agend;
		this.nation = nation;
	}

	/** full constructor */
	public TStudent(String stuId, String stuName, String stuPhoto,
			String stupwd, Integer classId, String createTime, String agend,
			String nation) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuPhoto = stuPhoto;
		this.stupwd = stupwd;
		this.classId = classId;
		this.createTime = createTime;
		this.agend = agend;
		this.nation = nation;
	}

	// Property accessors

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuPhoto() {
		return this.stuPhoto;
	}

	public void setStuPhoto(String stuPhoto) {
		this.stuPhoto = stuPhoto;
	}

	public String getStupwd() {
		return this.stupwd;
	}

	public void setStupwd(String stupwd) {
		this.stupwd = stupwd;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAgend() {
		return this.agend;
	}

	public void setAgend(String agend) {
		this.agend = agend;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

}