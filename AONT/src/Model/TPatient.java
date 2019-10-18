package Model;


/**
 * TPatient entity. @author MyEclipse Persistence Tools
 */

public class TPatient implements java.io.Serializable {

	// Fields

	private Integer patId;
	private String patName;
	private String profession;
	private String agend;
	private Integer age;
	private String origin;
	private String marriageStatus;
	private String nation;
	private String beHospitalizedTime;
	private String degreeOfEducation;
	private String address;
	private String religiousBelief;
	private Boolean state;
	private String remarks;
	private Integer depId;

	// Constructors

	/** default constructor */
	public TPatient() {
	}

	/** minimal constructor */
	public TPatient(String patName, String profession, String agend,
			Integer age, String origin, String marriageStatus, String nation,
			String beHospitalizedTime, String degreeOfEducation,
			String address, String religiousBelief, Boolean state, Integer depId) {
		this.patName = patName;
		this.profession = profession;
		this.agend = agend;
		this.age = age;
		this.origin = origin;
		this.marriageStatus = marriageStatus;
		this.nation = nation;
		this.beHospitalizedTime = beHospitalizedTime;
		this.degreeOfEducation = degreeOfEducation;
		this.address = address;
		this.religiousBelief = religiousBelief;
		this.state = state;
		this.depId = depId;
	}

	/** full constructor */
	public TPatient(String patName, String profession, String agend,
			Integer age, String origin, String marriageStatus, String nation,
			String beHospitalizedTime, String degreeOfEducation,
			String address, String religiousBelief, Boolean state,
			String remarks, Integer depId) {
		this.patName = patName;
		this.profession = profession;
		this.agend = agend;
		this.age = age;
		this.origin = origin;
		this.marriageStatus = marriageStatus;
		this.nation = nation;
		this.beHospitalizedTime = beHospitalizedTime;
		this.degreeOfEducation = degreeOfEducation;
		this.address = address;
		this.religiousBelief = religiousBelief;
		this.state = state;
		this.remarks = remarks;
		this.depId = depId;
	}

	// Property accessors

	public Integer getPatId() {
		return this.patId;
	}

	public void setPatId(Integer patId) {
		this.patId = patId;
	}

	public String getPatName() {
		return this.patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAgend() {
		return this.agend;
	}

	public void setAgend(String agend) {
		this.agend = agend;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getMarriageStatus() {
		return this.marriageStatus;
	}

	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getBeHospitalizedTime() {
		return this.beHospitalizedTime;
	}

	public void setBeHospitalizedTime(String beHospitalizedTime) {
		this.beHospitalizedTime = beHospitalizedTime;
	}

	public String getDegreeOfEducation() {
		return this.degreeOfEducation;
	}

	public void setDegreeOfEducation(String degreeOfEducation) {
		this.degreeOfEducation = degreeOfEducation;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReligiousBelief() {
		return this.religiousBelief;
	}

	public void setReligiousBelief(String religiousBelief) {
		this.religiousBelief = religiousBelief;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getDepId() {
		return this.depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

}