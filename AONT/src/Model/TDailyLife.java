package Model;

/**
 * TDailyLife entity. @author MyEclipse Persistence Tools
 */

public class TDailyLife implements java.io.Serializable {

	// Fields

	private Integer dailyId;
	private String dietAndNutritionType;
	private String eliminationPatternType;
	private String restAndSleepType;
	private String dailyActivities;
	private String selfCare;
	private String personaHobbies;
	private Integer patId;

	// Constructors

	/** default constructor */
	public TDailyLife() {
	}

	/** minimal constructor */
	public TDailyLife(String dietAndNutritionType,
			String eliminationPatternType, String restAndSleepType,
			String dailyActivities, Integer patId) {
		this.dietAndNutritionType = dietAndNutritionType;
		this.eliminationPatternType = eliminationPatternType;
		this.restAndSleepType = restAndSleepType;
		this.dailyActivities = dailyActivities;
		this.patId = patId;
	}

	/** full constructor */
	public TDailyLife(String dietAndNutritionType,
			String eliminationPatternType, String restAndSleepType,
			String dailyActivities, String selfCare, String personaHobbies,
			Integer patId) {
		this.dietAndNutritionType = dietAndNutritionType;
		this.eliminationPatternType = eliminationPatternType;
		this.restAndSleepType = restAndSleepType;
		this.dailyActivities = dailyActivities;
		this.selfCare = selfCare;
		this.personaHobbies = personaHobbies;
		this.patId = patId;
	}

	// Property accessors

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

	public Integer getPatId() {
		return this.patId;
	}

	public void setPatId(Integer patId) {
		this.patId = patId;
	}

}