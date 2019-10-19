package Model;

/**
 * VMainSuitId entity. @author MyEclipse Persistence Tools
 */

public class VMainSuit implements java.io.Serializable {

	// Fields

	private Integer mainSuitId;
	private String symptom;
	private String nature;
	private String lengthOfTime;
	private String degree;
	private Integer patId;
	private String patName;
	private String profession;
	private String agend;
	private Integer age;
	private String origin;
	private String marriageStatus;
	private String nation;
	private String beHospitalizedTime;
	private String address;
	private String religiousBelief;
	private Boolean state;
	private String remarks;
	private String depName;
	private Integer hpiid;
	private String onsetCondition;
	private String pathogeny;
	private String mainSymptoms;
	private String accompaniedSymptoms;
	private String developmentOfIllness;
	private String treatmentAndNursing;
	private Integer dailyId;
	private String dietAndNutritionType;
	private String eliminationPatternType;
	private String restAndSleepType;
	private String dailyActivities;
	private String selfCare;
	private String personaHobbies;
	private String degreeOfEducation;

	// Constructors

	/** default constructor */
	public VMainSuit() {
	}

	/** minimal constructor */
	public VMainSuit(Integer mainSuitId, String symptom, String nature,
			String lengthOfTime, String degree, Integer patId, String patName,
			String profession, String agend, Integer age, String origin,
			String nation, String beHospitalizedTime, String address,
			String religiousBelief, Boolean state, String depName,
			Integer hpiid, String onsetCondition, String pathogeny,
			String mainSymptoms, String accompaniedSymptoms,
			String developmentOfIllness, String treatmentAndNursing,
			Integer dailyId, String dietAndNutritionType,
			String eliminationPatternType, String restAndSleepType,
			String dailyActivities, String degreeOfEducation) {
		this.mainSuitId = mainSuitId;
		this.symptom = symptom;
		this.nature = nature;
		this.lengthOfTime = lengthOfTime;
		this.degree = degree;
		this.patId = patId;
		this.patName = patName;
		this.profession = profession;
		this.agend = agend;
		this.age = age;
		this.origin = origin;
		this.nation = nation;
		this.beHospitalizedTime = beHospitalizedTime;
		this.address = address;
		this.religiousBelief = religiousBelief;
		this.state = state;
		this.depName = depName;
		this.hpiid = hpiid;
		this.onsetCondition = onsetCondition;
		this.pathogeny = pathogeny;
		this.mainSymptoms = mainSymptoms;
		this.accompaniedSymptoms = accompaniedSymptoms;
		this.developmentOfIllness = developmentOfIllness;
		this.treatmentAndNursing = treatmentAndNursing;
		this.dailyId = dailyId;
		this.dietAndNutritionType = dietAndNutritionType;
		this.eliminationPatternType = eliminationPatternType;
		this.restAndSleepType = restAndSleepType;
		this.dailyActivities = dailyActivities;
		this.degreeOfEducation = degreeOfEducation;
	}

	/** full constructor */
	public VMainSuit(Integer mainSuitId, String symptom, String nature,
			String lengthOfTime, String degree, Integer patId, String patName,
			String profession, String agend, Integer age, String origin,
			String marriageStatus, String nation, String beHospitalizedTime,
			String address, String religiousBelief, Boolean state,
			String remarks, String depName, Integer hpiid,
			String onsetCondition, String pathogeny, String mainSymptoms,
			String accompaniedSymptoms, String developmentOfIllness,
			String treatmentAndNursing, Integer dailyId,
			String dietAndNutritionType, String eliminationPatternType,
			String restAndSleepType, String dailyActivities, String selfCare,
			String personaHobbies, String degreeOfEducation) {
		this.mainSuitId = mainSuitId;
		this.symptom = symptom;
		this.nature = nature;
		this.lengthOfTime = lengthOfTime;
		this.degree = degree;
		this.patId = patId;
		this.patName = patName;
		this.profession = profession;
		this.agend = agend;
		this.age = age;
		this.origin = origin;
		this.marriageStatus = marriageStatus;
		this.nation = nation;
		this.beHospitalizedTime = beHospitalizedTime;
		this.address = address;
		this.religiousBelief = religiousBelief;
		this.state = state;
		this.remarks = remarks;
		this.depName = depName;
		this.hpiid = hpiid;
		this.onsetCondition = onsetCondition;
		this.pathogeny = pathogeny;
		this.mainSymptoms = mainSymptoms;
		this.accompaniedSymptoms = accompaniedSymptoms;
		this.developmentOfIllness = developmentOfIllness;
		this.treatmentAndNursing = treatmentAndNursing;
		this.dailyId = dailyId;
		this.dietAndNutritionType = dietAndNutritionType;
		this.eliminationPatternType = eliminationPatternType;
		this.restAndSleepType = restAndSleepType;
		this.dailyActivities = dailyActivities;
		this.selfCare = selfCare;
		this.personaHobbies = personaHobbies;
		this.degreeOfEducation = degreeOfEducation;
	}

	// Property accessors

	public Integer getMainSuitId() {
		return this.mainSuitId;
	}

	public void setMainSuitId(Integer mainSuitId) {
		this.mainSuitId = mainSuitId;
	}

	public String getSymptom() {
		return this.symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getLengthOfTime() {
		return this.lengthOfTime;
	}

	public void setLengthOfTime(String lengthOfTime) {
		this.lengthOfTime = lengthOfTime;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
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

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

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

	public Integer getDailyId() {
		return this.dailyId;
	}

	public void setDailyId(Integer dailyId) {
		this.dailyId = dailyId;
	}

	public String getDietAndNutritionType() {
		return this.dietAndNutritionType;
	}

	public void setDietAndNutritionType(String dietAndNutritionType) {
		this.dietAndNutritionType = dietAndNutritionType;
	}

	public String getEliminationPatternType() {
		return this.eliminationPatternType;
	}

	public void setEliminationPatternType(String eliminationPatternType) {
		this.eliminationPatternType = eliminationPatternType;
	}

	public String getRestAndSleepType() {
		return this.restAndSleepType;
	}

	public void setRestAndSleepType(String restAndSleepType) {
		this.restAndSleepType = restAndSleepType;
	}

	public String getDailyActivities() {
		return this.dailyActivities;
	}

	public void setDailyActivities(String dailyActivities) {
		this.dailyActivities = dailyActivities;
	}

	public String getSelfCare() {
		return this.selfCare;
	}

	public void setSelfCare(String selfCare) {
		this.selfCare = selfCare;
	}

	public String getPersonaHobbies() {
		return this.personaHobbies;
	}

	public void setPersonaHobbies(String personaHobbies) {
		this.personaHobbies = personaHobbies;
	}

	public String getDegreeOfEducation() {
		return this.degreeOfEducation;
	}

	public void setDegreeOfEducation(String degreeOfEducation) {
		this.degreeOfEducation = degreeOfEducation;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VMainSuit))
			return false;
		VMainSuit castOther = (VMainSuit) other;

		return ((this.getMainSuitId() == castOther.getMainSuitId()) || (this
				.getMainSuitId() != null && castOther.getMainSuitId() != null && this
				.getMainSuitId().equals(castOther.getMainSuitId())))
				&& ((this.getSymptom() == castOther.getSymptom()) || (this
						.getSymptom() != null && castOther.getSymptom() != null && this
						.getSymptom().equals(castOther.getSymptom())))
				&& ((this.getNature() == castOther.getNature()) || (this
						.getNature() != null && castOther.getNature() != null && this
						.getNature().equals(castOther.getNature())))
				&& ((this.getLengthOfTime() == castOther.getLengthOfTime()) || (this
						.getLengthOfTime() != null
						&& castOther.getLengthOfTime() != null && this
						.getLengthOfTime().equals(castOther.getLengthOfTime())))
				&& ((this.getDegree() == castOther.getDegree()) || (this
						.getDegree() != null && castOther.getDegree() != null && this
						.getDegree().equals(castOther.getDegree())))
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
				&& ((this.getDepName() == castOther.getDepName()) || (this
						.getDepName() != null && castOther.getDepName() != null && this
						.getDepName().equals(castOther.getDepName())))
				&& ((this.getHpiid() == castOther.getHpiid()) || (this
						.getHpiid() != null && castOther.getHpiid() != null && this
						.getHpiid().equals(castOther.getHpiid())))
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
				&& ((this.getDailyId() == castOther.getDailyId()) || (this
						.getDailyId() != null && castOther.getDailyId() != null && this
						.getDailyId().equals(castOther.getDailyId())))
				&& ((this.getDietAndNutritionType() == castOther
						.getDietAndNutritionType()) || (this
						.getDietAndNutritionType() != null
						&& castOther.getDietAndNutritionType() != null && this
						.getDietAndNutritionType().equals(
								castOther.getDietAndNutritionType())))
				&& ((this.getEliminationPatternType() == castOther
						.getEliminationPatternType()) || (this
						.getEliminationPatternType() != null
						&& castOther.getEliminationPatternType() != null && this
						.getEliminationPatternType().equals(
								castOther.getEliminationPatternType())))
				&& ((this.getRestAndSleepType() == castOther
						.getRestAndSleepType()) || (this.getRestAndSleepType() != null
						&& castOther.getRestAndSleepType() != null && this
						.getRestAndSleepType().equals(
								castOther.getRestAndSleepType())))
				&& ((this.getDailyActivities() == castOther
						.getDailyActivities()) || (this.getDailyActivities() != null
						&& castOther.getDailyActivities() != null && this
						.getDailyActivities().equals(
								castOther.getDailyActivities())))
				&& ((this.getSelfCare() == castOther.getSelfCare()) || (this
						.getSelfCare() != null
						&& castOther.getSelfCare() != null && this
						.getSelfCare().equals(castOther.getSelfCare())))
				&& ((this.getPersonaHobbies() == castOther.getPersonaHobbies()) || (this
						.getPersonaHobbies() != null
						&& castOther.getPersonaHobbies() != null && this
						.getPersonaHobbies().equals(
								castOther.getPersonaHobbies())))
				&& ((this.getDegreeOfEducation() == castOther
						.getDegreeOfEducation()) || (this
						.getDegreeOfEducation() != null
						&& castOther.getDegreeOfEducation() != null && this
						.getDegreeOfEducation().equals(
								castOther.getDegreeOfEducation())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getMainSuitId() == null ? 0 : this.getMainSuitId()
						.hashCode());
		result = 37 * result
				+ (getSymptom() == null ? 0 : this.getSymptom().hashCode());
		result = 37 * result
				+ (getNature() == null ? 0 : this.getNature().hashCode());
		result = 37
				* result
				+ (getLengthOfTime() == null ? 0 : this.getLengthOfTime()
						.hashCode());
		result = 37 * result
				+ (getDegree() == null ? 0 : this.getDegree().hashCode());
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
				+ (getDepName() == null ? 0 : this.getDepName().hashCode());
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
				+ (getDailyId() == null ? 0 : this.getDailyId().hashCode());
		result = 37
				* result
				+ (getDietAndNutritionType() == null ? 0 : this
						.getDietAndNutritionType().hashCode());
		result = 37
				* result
				+ (getEliminationPatternType() == null ? 0 : this
						.getEliminationPatternType().hashCode());
		result = 37
				* result
				+ (getRestAndSleepType() == null ? 0 : this
						.getRestAndSleepType().hashCode());
		result = 37
				* result
				+ (getDailyActivities() == null ? 0 : this.getDailyActivities()
						.hashCode());
		result = 37 * result
				+ (getSelfCare() == null ? 0 : this.getSelfCare().hashCode());
		result = 37
				* result
				+ (getPersonaHobbies() == null ? 0 : this.getPersonaHobbies()
						.hashCode());
		result = 37
				* result
				+ (getDegreeOfEducation() == null ? 0 : this
						.getDegreeOfEducation().hashCode());
		return result;
	}

}