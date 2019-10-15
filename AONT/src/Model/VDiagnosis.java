package Model;
 

/**
 * VDiagnosis entity. @author MyEclipse Persistence Tools
 */

public class VDiagnosis implements java.io.Serializable {

	// Fields

		private Integer diaId;
		private String diaResult;
		private String stuId;
		private Integer patientId;
		private Integer diaRecordId;
		private String stuName;
		private Integer classId;
		private String stuAgende;
		private String stuNation;
		private Integer problemId;
		private Integer answerId;
		private String diaRemarks;
		private String proCon;
		private String proTime;
		private String anCon;
		private String anTime;
		private String patName;
		private String profession;
		private String patAgende;
		private Integer age;
		private String origin;
		private String marriageStatus;
		private String patNaton;
		private String beHospitalizedTime;
		private String degreeOfEducation;
		private String address;
		private String religiousBelief;
		private Boolean state;
		private String patRemarks;
		private Integer depId;

		// Constructors

		/** default constructor */
		public VDiagnosis() {
		}

		/** minimal constructor */
		public VDiagnosis(Integer diaId, String diaResult, String stuId,
				Integer patientId, Integer diaRecordId, String stuName,
				Integer classId, String stuAgende, String stuNation,
				Integer problemId, Integer answerId, String diaRemarks,
				String proCon, String proTime, String anCon, String anTime,
				String patName, String profession, String patAgende, Integer age,
				String origin, String marriageStatus, String patNaton,
				String beHospitalizedTime, String degreeOfEducation,
				String address, String religiousBelief, Boolean state, Integer depId) {
			this.diaId = diaId;
			this.diaResult = diaResult;
			this.stuId = stuId;
			this.patientId = patientId;
			this.diaRecordId = diaRecordId;
			this.stuName = stuName;
			this.classId = classId;
			this.stuAgende = stuAgende;
			this.stuNation = stuNation;
			this.problemId = problemId;
			this.answerId = answerId;
			this.diaRemarks = diaRemarks;
			this.proCon = proCon;
			this.proTime = proTime;
			this.anCon = anCon;
			this.anTime = anTime;
			this.patName = patName;
			this.profession = profession;
			this.patAgende = patAgende;
			this.age = age;
			this.origin = origin;
			this.marriageStatus = marriageStatus;
			this.patNaton = patNaton;
			this.beHospitalizedTime = beHospitalizedTime;
			this.degreeOfEducation = degreeOfEducation;
			this.address = address;
			this.religiousBelief = religiousBelief;
			this.state = state;
			this.depId = depId;
		}

		/** full constructor */
		public VDiagnosis(Integer diaId, String diaResult, String stuId,
				Integer patientId, Integer diaRecordId, String stuName,
				Integer classId, String stuAgende, String stuNation,
				Integer problemId, Integer answerId, String diaRemarks,
				String proCon, String proTime, String anCon, String anTime,
				String patName, String profession, String patAgende, Integer age,
				String origin, String marriageStatus, String patNaton,
				String beHospitalizedTime, String degreeOfEducation,
				String address, String religiousBelief, Boolean state,
				String patRemarks, Integer depId) {
			this.diaId = diaId;
			this.diaResult = diaResult;
			this.stuId = stuId;
			this.patientId = patientId;
			this.diaRecordId = diaRecordId;
			this.stuName = stuName;
			this.classId = classId;
			this.stuAgende = stuAgende;
			this.stuNation = stuNation;
			this.problemId = problemId;
			this.answerId = answerId;
			this.diaRemarks = diaRemarks;
			this.proCon = proCon;
			this.proTime = proTime;
			this.anCon = anCon;
			this.anTime = anTime;
			this.patName = patName;
			this.profession = profession;
			this.patAgende = patAgende;
			this.age = age;
			this.origin = origin;
			this.marriageStatus = marriageStatus;
			this.patNaton = patNaton;
			this.beHospitalizedTime = beHospitalizedTime;
			this.degreeOfEducation = degreeOfEducation;
			this.address = address;
			this.religiousBelief = religiousBelief;
			this.state = state;
			this.patRemarks = patRemarks;
			this.depId = depId;
		}

		// Property accessors

		public Integer getDiaId() {
			return this.diaId;
		}

		public void setDiaId(Integer diaId) {
			this.diaId = diaId;
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

		public Integer getProblemId() {
			return this.problemId;
		}

		public void setProblemId(Integer problemId) {
			this.problemId = problemId;
		}

		public Integer getAnswerId() {
			return this.answerId;
		}

		public void setAnswerId(Integer answerId) {
			this.answerId = answerId;
		}

		public String getDiaRemarks() {
			return this.diaRemarks;
		}

		public void setDiaRemarks(String diaRemarks) {
			this.diaRemarks = diaRemarks;
		}

		public String getProCon() {
			return this.proCon;
		}

		public void setProCon(String proCon) {
			this.proCon = proCon;
		}

		public String getProTime() {
			return this.proTime;
		}

		public void setProTime(String proTime) {
			this.proTime = proTime;
		}

		public String getAnCon() {
			return this.anCon;
		}

		public void setAnCon(String anCon) {
			this.anCon = anCon;
		}

		public String getAnTime() {
			return this.anTime;
		}

		public void setAnTime(String anTime) {
			this.anTime = anTime;
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

		public String getPatAgende() {
			return this.patAgende;
		}

		public void setPatAgende(String patAgende) {
			this.patAgende = patAgende;
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

		public String getPatNaton() {
			return this.patNaton;
		}

		public void setPatNaton(String patNaton) {
			this.patNaton = patNaton;
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

		public String getPatRemarks() {
			return this.patRemarks;
		}

		public void setPatRemarks(String patRemarks) {
			this.patRemarks = patRemarks;
		}

		public Integer getDepId() {
			return this.depId;
		}

		public void setDepId(Integer depId) {
			this.depId = depId;
		}


}