package Model;
 

/**
 * VClass entity. @author MyEclipse Persistence Tools
 */

public class VClass implements java.io.Serializable {

	// Fields

		private Integer classId;
		private String className;
		private String createTime;
		private String teaId;
		private Integer gradeId;
		private String gradeName;
		private String teaName;
		private String agend;
		private String jobTitle;
		private Integer userType;
		private String typeName;

		// Constructors

		/** default constructor */
		public VClass() {
		}

		/** full constructor */
		public VClass(Integer classId, String className, String createTime,
				String teaId, Integer gradeId, String gradeName, String teaName,
				String agend, String jobTitle, Integer userType, String typeName) {
			this.classId = classId;
			this.className = className;
			this.createTime = createTime;
			this.teaId = teaId;
			this.gradeId = gradeId;
			this.gradeName = gradeName;
			this.teaName = teaName;
			this.agend = agend;
			this.jobTitle = jobTitle;
			this.userType = userType;
			this.typeName = typeName;
		}

		// Property accessors

		public Integer getClassId() {
			return this.classId;
		}

		public void setClassId(Integer classId) {
			this.classId = classId;
		}

		public String getClassName() {
			return this.className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTeaId() {
			return this.teaId;
		}

		public void setTeaId(String teaId) {
			this.teaId = teaId;
		}

		public Integer getGradeId() {
			return this.gradeId;
		}

		public void setGradeId(Integer gradeId) {
			this.gradeId = gradeId;
		}

		public String getGradeName() {
			return this.gradeName;
		}

		public void setGradeName(String gradeName) {
			this.gradeName = gradeName;
		}

		public String getTeaName() {
			return this.teaName;
		}

		public void setTeaName(String teaName) {
			this.teaName = teaName;
		}

		public String getAgend() {
			return this.agend;
		}

		public void setAgend(String agend) {
			this.agend = agend;
		}

		public String getJobTitle() {
			return this.jobTitle;
		}

		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		public Integer getUserType() {
			return this.userType;
		}

		public void setUserType(Integer userType) {
			this.userType = userType;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}


}