package Model;
 

/**
 * VMainSuit entity. @author MyEclipse Persistence Tools
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
		private String degreeOfEducation;
		private Boolean state;
		private String religiousBelief;
		private String address;
		private String onsetCondition;
		private String pathogeny;
		private String mainSymptoms;
		private String accompaniedSymptoms;
		private String developmentOfIllness;
		private String treatmentAndNursing;
		private String dietAndNutritionType;
		private String eliminationPatternType;
		private String restAndSleepType;
		private String dailyActivities;
		private String selfCare;
		private String personaHobbies;
		private String depName;

		// Constructors

		/** default constructor */
		public VMainSuit() {
		}

		/** minimal constructor */
		public VMainSuit(Integer mainSuitId, String symptom, String nature,
				String lengthOfTime, String degree, Integer patId, String patName,
				String profession, String agend, Integer age, String origin,
				String marriageStatus, String nation, String beHospitalizedTime,
				String degreeOfEducation, Boolean state, String religiousBelief,
				String address, String onsetCondition, String pathogeny,
				String mainSymptoms, String accompaniedSymptoms,
				String developmentOfIllness, String treatmentAndNursing,
				String dietAndNutritionType, String eliminationPatternType,
				String restAndSleepType, String dailyActivities, String depName) {
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
			this.degreeOfEducation = degreeOfEducation;
			this.state = state;
			this.religiousBelief = religiousBelief;
			this.address = address;
			this.onsetCondition = onsetCondition;
			this.pathogeny = pathogeny;
			this.mainSymptoms = mainSymptoms;
			this.accompaniedSymptoms = accompaniedSymptoms;
			this.developmentOfIllness = developmentOfIllness;
			this.treatmentAndNursing = treatmentAndNursing;
			this.dietAndNutritionType = dietAndNutritionType;
			this.eliminationPatternType = eliminationPatternType;
			this.restAndSleepType = restAndSleepType;
			this.dailyActivities = dailyActivities;
			this.depName = depName;
		}

		/** full constructor */
		public VMainSuit(Integer mainSuitId, String symptom, String nature,
				String lengthOfTime, String degree, Integer patId, String patName,
				String profession, String agend, Integer age, String origin,
				String marriageStatus, String nation, String beHospitalizedTime,
				String degreeOfEducation, Boolean state, String religiousBelief,
				String address, String onsetCondition, String pathogeny,
				String mainSymptoms, String accompaniedSymptoms,
				String developmentOfIllness, String treatmentAndNursing,
				String dietAndNutritionType, String eliminationPatternType,
				String restAndSleepType, String dailyActivities, String selfCare,
				String personaHobbies, String depName) {
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
			this.degreeOfEducation = degreeOfEducation;
			this.state = state;
			this.religiousBelief = religiousBelief;
			this.address = address;
			this.onsetCondition = onsetCondition;
			this.pathogeny = pathogeny;
			this.mainSymptoms = mainSymptoms;
			this.accompaniedSymptoms = accompaniedSymptoms;
			this.developmentOfIllness = developmentOfIllness;
			this.treatmentAndNursing = treatmentAndNursing;
			this.dietAndNutritionType = dietAndNutritionType;
			this.eliminationPatternType = eliminationPatternType;
			this.restAndSleepType = restAndSleepType;
			this.dailyActivities = dailyActivities;
			this.selfCare = selfCare;
			this.personaHobbies = personaHobbies;
			this.depName = depName;
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

		public String getDegreeOfEducation() {
			return this.degreeOfEducation;
		}

		public void setDegreeOfEducation(String degreeOfEducation) {
			this.degreeOfEducation = degreeOfEducation;
		}

		public Boolean getState() {
			return this.state;
		}

		public void setState(Boolean state) {
			this.state = state;
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

		public String getDepName() {
			return this.depName;
		}

		public void setDepName(String depName) {
			this.depName = depName;
		}
}