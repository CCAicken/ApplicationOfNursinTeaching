package Model; 

/**
 * VCheck entity. @author MyEclipse Persistence Tools
 */

public class VCheck implements java.io.Serializable {

	// Fields

		private Integer checkId;
		private String checkItem;
		private String checkTheResult;
		private Integer patientId;
		private String patName;
		private String profession;
		private String agend;
		private Integer age;
		private String origin;
		private String marriageStatus;
		private String nation;
		private String degreeOfEducation;
		private String beHospitalizedTime;
		private String religiousBelief;
		private String address;
		private Boolean state;
		private String remarks;
		private Integer depId;
		private String depName;

		// Constructors

		/** default constructor */
		public VCheck() {
		}

		/** minimal constructor */
		public VCheck(Integer checkId, String checkItem, String checkTheResult,
				Integer patientId, String patName, String profession, String agend,
				Integer age, String origin, String marriageStatus, String nation,
				String degreeOfEducation, String beHospitalizedTime,
				String religiousBelief, String address, Boolean state,
				Integer depId, String depName) {
			this.checkId = checkId;
			this.checkItem = checkItem;
			this.checkTheResult = checkTheResult;
			this.patientId = patientId;
			this.patName = patName;
			this.profession = profession;
			this.agend = agend;
			this.age = age;
			this.origin = origin;
			this.marriageStatus = marriageStatus;
			this.nation = nation;
			this.degreeOfEducation = degreeOfEducation;
			this.beHospitalizedTime = beHospitalizedTime;
			this.religiousBelief = religiousBelief;
			this.address = address;
			this.state = state;
			this.depId = depId;
			this.depName = depName;
		}

		/** full constructor */
		public VCheck(Integer checkId, String checkItem, String checkTheResult,
				Integer patientId, String patName, String profession, String agend,
				Integer age, String origin, String marriageStatus, String nation,
				String degreeOfEducation, String beHospitalizedTime,
				String religiousBelief, String address, Boolean state,
				String remarks, Integer depId, String depName) {
			this.checkId = checkId;
			this.checkItem = checkItem;
			this.checkTheResult = checkTheResult;
			this.patientId = patientId;
			this.patName = patName;
			this.profession = profession;
			this.agend = agend;
			this.age = age;
			this.origin = origin;
			this.marriageStatus = marriageStatus;
			this.nation = nation;
			this.degreeOfEducation = degreeOfEducation;
			this.beHospitalizedTime = beHospitalizedTime;
			this.religiousBelief = religiousBelief;
			this.address = address;
			this.state = state;
			this.remarks = remarks;
			this.depId = depId;
			this.depName = depName;
		}

		// Property accessors

		public Integer getCheckId() {
			return this.checkId;
		}

		public void setCheckId(Integer checkId) {
			this.checkId = checkId;
		}

		public String getCheckItem() {
			return this.checkItem;
		}

		public void setCheckItem(String checkItem) {
			this.checkItem = checkItem;
		}

		public String getCheckTheResult() {
			return this.checkTheResult;
		}

		public void setCheckTheResult(String checkTheResult) {
			this.checkTheResult = checkTheResult;
		}

		public Integer getPatientId() {
			return this.patientId;
		}

		public void setPatientId(Integer patientId) {
			this.patientId = patientId;
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

		public String getDegreeOfEducation() {
			return this.degreeOfEducation;
		}

		public void setDegreeOfEducation(String degreeOfEducation) {
			this.degreeOfEducation = degreeOfEducation;
		}

		public String getBeHospitalizedTime() {
			return this.beHospitalizedTime;
		}

		public void setBeHospitalizedTime(String beHospitalizedTime) {
			this.beHospitalizedTime = beHospitalizedTime;
		}

		public String getReligiousBelief() {
			return this.religiousBelief;
		}

		public void setReligiousBelief(String religiousBelief) {
			this.religiousBelief = religiousBelief;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
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

		public String getDepName() {
			return this.depName;
		}

		public void setDepName(String depName) {
			this.depName = depName;
		}


}