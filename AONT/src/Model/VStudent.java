package Model;
 

/**
 * VStudent entity. @author MyEclipse Persistence Tools
 */

public class VStudent implements java.io.Serializable {

	// Fields

		private String stuId;
		private String stuName;
		private String stuPhoto;
		private String stupwd;
		private Integer classId;
		private String createTime;
		private String stuAgende;
		private String stuNation;
		private String className;
		private String teaId;
		private Integer gradeId;
		private String gradeName;
		private String teaName;
		private String teaPhoto;
		private String teaAgende;
		private String jobTitle;
		private Integer userType;
		private String typeName;

		// Constructors

		/** default constructor */
		public VStudent() {
		}

		/** minimal constructor */
		public VStudent(String stuId, String stuName, String stupwd,
				Integer classId, String createTime, String stuAgende,
				String stuNation, String className, String teaId, Integer gradeId,
				String gradeName, String teaName, String teaAgende,
				String jobTitle, Integer userType, String typeName) {
			this.stuId = stuId;
			this.stuName = stuName;
			this.stupwd = stupwd;
			this.classId = classId;
			this.createTime = createTime;
			this.stuAgende = stuAgende;
			this.stuNation = stuNation;
			this.className = className;
			this.teaId = teaId;
			this.gradeId = gradeId;
			this.gradeName = gradeName;
			this.teaName = teaName;
			this.teaAgende = teaAgende;
			this.jobTitle = jobTitle;
			this.userType = userType;
			this.typeName = typeName;
		}

		/** full constructor */
		public VStudent(String stuId, String stuName, String stuPhoto,
				String stupwd, Integer classId, String createTime,
				String stuAgende, String stuNation, String className, String teaId,
				Integer gradeId, String gradeName, String teaName, String teaPhoto,
				String teaAgende, String jobTitle, Integer userType, String typeName) {
			this.stuId = stuId;
			this.stuName = stuName;
			this.stuPhoto = stuPhoto;
			this.stupwd = stupwd;
			this.classId = classId;
			this.createTime = createTime;
			this.stuAgende = stuAgende;
			this.stuNation = stuNation;
			this.className = className;
			this.teaId = teaId;
			this.gradeId = gradeId;
			this.gradeName = gradeName;
			this.teaName = teaName;
			this.teaPhoto = teaPhoto;
			this.teaAgende = teaAgende;
			this.jobTitle = jobTitle;
			this.userType = userType;
			this.typeName = typeName;
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

		public String getClassName() {
			return this.className;
		}

		public void setClassName(String className) {
			this.className = className;
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

		public String getTeaPhoto() {
			return this.teaPhoto;
		}

		public void setTeaPhoto(String teaPhoto) {
			this.teaPhoto = teaPhoto;
		}

		public String getTeaAgende() {
			return this.teaAgende;
		}

		public void setTeaAgende(String teaAgende) {
			this.teaAgende = teaAgende;
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