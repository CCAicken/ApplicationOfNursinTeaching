package Model;

/**
 * VHPIId entity. @author MyEclipse Persistence Tools
 */

public class VHPI implements java.io.Serializable {

	// Fields

	private Integer hpiid;
	private String onsetCondition;
	private String pathogeny;
	private String mainSymptoms;
	private String accompaniedSymptoms;
	private String developmentOfIllness;
	private String treatmentAndNursing;
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
	public VHPI() {
	}

	/** minimal constructor */
	public VHPI(Integer hpiid, String onsetCondition, String pathogeny,
			String mainSymptoms, String accompaniedSymptoms,
			String developmentOfIllness, String treatmentAndNursing,
			Integer patId, String patName, String profession, String agend,
			Integer age, String origin, String nation,
			String beHospitalizedTime, String degreeOfEducation,
			String address, String religiousBelief, Boolean state, Integer depId) {
		this.hpiid = hpiid;
		this.onsetCondition = onsetCondition;
		this.pathogeny = pathogeny;
		this.mainSymptoms = mainSymptoms;
		this.accompaniedSymptoms = accompaniedSymptoms;
		this.developmentOfIllness = developmentOfIllness;
		this.treatmentAndNursing = treatmentAndNursing;
		this.patId = patId;
		this.patName = patName;
		this.profession = profession;
		this.agend = agend;
		this.age = age;
		this.origin = origin;
		this.nation = nation;
		this.beHospitalizedTime = beHospitalizedTime;
		this.degreeOfEducation = degreeOfEducation;
		this.address = address;
		this.religiousBelief = religiousBelief;
		this.state = state;
		this.depId = depId;
	}

	/** full constructor */
	public VHPI(Integer hpiid, String onsetCondition, String pathogeny,
			String mainSymptoms, String accompaniedSymptoms,
			String developmentOfIllness, String treatmentAndNursing,
			Integer patId, String patName, String profession, String agend,
			Integer age, String origin, String marriageStatus, String nation,
			String beHospitalizedTime, String degreeOfEducation,
			String address, String religiousBelief, Boolean state,
			String remarks, Integer depId) {
		this.hpiid = hpiid;
		this.onsetCondition = onsetCondition;
		this.pathogeny = pathogeny;
		this.mainSymptoms = mainSymptoms;
		this.accompaniedSymptoms = accompaniedSymptoms;
		this.developmentOfIllness = developmentOfIllness;
		this.treatmentAndNursing = treatmentAndNursing;
		this.patId = patId;
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

	public Integer getHpiid() {
		return this.hpiid;
	}

	public void setHpiid(Integer hpiid) {
		this.hpiid = hpiid;
	}

	public String getOnsetCondition() {
		return this.onsetCondition;
	}

	public void setOnsetCondition(String onsetCondition) {
		this.onsetCondition = onsetCondition;
	}

	public String getPathogeny() {
		return this.pathogeny;
	}

	public void setPathogeny(String pathogeny) {
		this.pathogeny = pathogeny;
	}

	public String getMainSymptoms() {
		return this.mainSymptoms;
	}

	public void setMainSymptoms(String mainSymptoms) {
		this.mainSymptoms = mainSymptoms;
	}

	public String getAccompaniedSymptoms() {
		return this.accompaniedSymptoms;
	}

	public void setAccompaniedSymptoms(String accompaniedSymptoms) {
		this.accompaniedSymptoms = accompaniedSymptoms;
	}

	public String getDevelopmentOfIllness() {
		return this.developmentOfIllness;
	}

	public void setDevelopmentOfIllness(String developmentOfIllness) {
		this.developmentOfIllness = developmentOfIllness;
	}

	public String getTreatmentAndNursing() {
		return this.treatmentAndNursing;
	}

	public void setTreatmentAndNursing(String treatmentAndNursing) {
		this.treatmentAndNursing = treatmentAndNursing;
	}

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VHPI))
			return false;
		VHPI castOther = (VHPI) other;

		return ((this.getHpiid() == castOther.getHpiid()) || (this.getHpiid() != null
				&& castOther.getHpiid() != null && this.getHpiid().equals(
				castOther.getHpiid())))
				&& ((this.getOnsetCondition() == castOther.getOnsetCondition()) || (this
						.getOnsetCondition() != null
						&& castOther.getOnsetCondition() != null && this
						.getOnsetCondition().equals(
								castOther.getOnsetCondition())))
				&& ((this.getPathogeny() == castOther.getPathogeny()) || (this
						.getPathogeny() != null
						&& castOther.getPathogeny() != null && this
						.getPathogeny().equals(castOther.getPathogeny())))
				&& ((this.getMainSymptoms() == castOther.getMainSymptoms()) || (this
						.getMainSymptoms() != null
						&& castOther.getMainSymptoms() != null && this
						.getMainSymptoms().equals(castOther.getMainSymptoms())))
				&& ((this.getAccompaniedSymptoms() == castOther
						.getAccompaniedSymptoms()) || (this
						.getAccompaniedSymptoms() != null
						&& castOther.getAccompaniedSymptoms() != null && this
						.getAccompaniedSymptoms().equals(
								castOther.getAccompaniedSymptoms())))
				&& ((this.getDevelopmentOfIllness() == castOther
						.getDevelopmentOfIllness()) || (this
						.getDevelopmentOfIllness() != null
						&& castOther.getDevelopmentOfIllness() != null && this
						.getDevelopmentOfIllness().equals(
								castOther.getDevelopmentOfIllness())))
				&& ((this.getTreatmentAndNursing() == castOther
						.getTreatmentAndNursing()) || (this
						.getTreatmentAndNursing() != null
						&& castOther.getTreatmentAndNursing() != null && this
						.getTreatmentAndNursing().equals(
								castOther.getTreatmentAndNursing())))
				&& ((this.getPatId() == castOther.getPatId()) || (this
						.getPatId() != null && castOther.getPatId() != null && this
						.getPatId().equals(castOther.getPatId())))
				&& ((this.getPatName() == castOther.getPatName()) || (this
						.getPatName() != null && castOther.getPatName() != null && this
						.getPatName().equals(castOther.getPatName())))
				&& ((this.getProfession() == castOther.getProfession()) || (this
						.getProfession() != null
						&& castOther.getProfession() != null && this
						.getProfession().equals(castOther.getProfession())))
				&& ((this.getAgend() == castOther.getAgend()) || (this
						.getAgend() != null && castOther.getAgend() != null && this
						.getAgend().equals(castOther.getAgend())))
				&& ((this.getAge() == castOther.getAge()) || (this.getAge() != null
						&& castOther.getAge() != null && this.getAge().equals(
						castOther.getAge())))
				&& ((this.getOrigin() == castOther.getOrigin()) || (this
						.getOrigin() != null && castOther.getOrigin() != null && this
						.getOrigin().equals(castOther.getOrigin())))
				&& ((this.getMarriageStatus() == castOther.getMarriageStatus()) || (this
						.getMarriageStatus() != null
						&& castOther.getMarriageStatus() != null && this
						.getMarriageStatus().equals(
								castOther.getMarriageStatus())))
				&& ((this.getNation() == castOther.getNation()) || (this
						.getNation() != null && castOther.getNation() != null && this
						.getNation().equals(castOther.getNation())))
				&& ((this.getBeHospitalizedTime() == castOther
						.getBeHospitalizedTime()) || (this
						.getBeHospitalizedTime() != null
						&& castOther.getBeHospitalizedTime() != null && this
						.getBeHospitalizedTime().equals(
								castOther.getBeHospitalizedTime())))
				&& ((this.getDegreeOfEducation() == castOther
						.getDegreeOfEducation()) || (this
						.getDegreeOfEducation() != null
						&& castOther.getDegreeOfEducation() != null && this
						.getDegreeOfEducation().equals(
								castOther.getDegreeOfEducation())))
				&& ((this.getAddress() == castOther.getAddress()) || (this
						.getAddress() != null && castOther.getAddress() != null && this
						.getAddress().equals(castOther.getAddress())))
				&& ((this.getReligiousBelief() == castOther
						.getReligiousBelief()) || (this.getReligiousBelief() != null
						&& castOther.getReligiousBelief() != null && this
						.getReligiousBelief().equals(
								castOther.getReligiousBelief())))
				&& ((this.getState() == castOther.getState()) || (this
						.getState() != null && castOther.getState() != null && this
						.getState().equals(castOther.getState())))
				&& ((this.getRemarks() == castOther.getRemarks()) || (this
						.getRemarks() != null && castOther.getRemarks() != null && this
						.getRemarks().equals(castOther.getRemarks())))
				&& ((this.getDepId() == castOther.getDepId()) || (this
						.getDepId() != null && castOther.getDepId() != null && this
						.getDepId().equals(castOther.getDepId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getHpiid() == null ? 0 : this.getHpiid().hashCode());
		result = 37
				* result
				+ (getOnsetCondition() == null ? 0 : this.getOnsetCondition()
						.hashCode());
		result = 37 * result
				+ (getPathogeny() == null ? 0 : this.getPathogeny().hashCode());
		result = 37
				* result
				+ (getMainSymptoms() == null ? 0 : this.getMainSymptoms()
						.hashCode());
		result = 37
				* result
				+ (getAccompaniedSymptoms() == null ? 0 : this
						.getAccompaniedSymptoms().hashCode());
		result = 37
				* result
				+ (getDevelopmentOfIllness() == null ? 0 : this
						.getDevelopmentOfIllness().hashCode());
		result = 37
				* result
				+ (getTreatmentAndNursing() == null ? 0 : this
						.getTreatmentAndNursing().hashCode());
		result = 37 * result
				+ (getPatId() == null ? 0 : this.getPatId().hashCode());
		result = 37 * result
				+ (getPatName() == null ? 0 : this.getPatName().hashCode());
		result = 37
				* result
				+ (getProfession() == null ? 0 : this.getProfession()
						.hashCode());
		result = 37 * result
				+ (getAgend() == null ? 0 : this.getAgend().hashCode());
		result = 37 * result
				+ (getAge() == null ? 0 : this.getAge().hashCode());
		result = 37 * result
				+ (getOrigin() == null ? 0 : this.getOrigin().hashCode());
		result = 37
				* result
				+ (getMarriageStatus() == null ? 0 : this.getMarriageStatus()
						.hashCode());
		result = 37 * result
				+ (getNation() == null ? 0 : this.getNation().hashCode());
		result = 37
				* result
				+ (getBeHospitalizedTime() == null ? 0 : this
						.getBeHospitalizedTime().hashCode());
		result = 37
				* result
				+ (getDegreeOfEducation() == null ? 0 : this
						.getDegreeOfEducation().hashCode());
		result = 37 * result
				+ (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37
				* result
				+ (getReligiousBelief() == null ? 0 : this.getReligiousBelief()
						.hashCode());
		result = 37 * result
				+ (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result
				+ (getRemarks() == null ? 0 : this.getRemarks().hashCode());
		result = 37 * result
				+ (getDepId() == null ? 0 : this.getDepId().hashCode());
		return result;
	}

}