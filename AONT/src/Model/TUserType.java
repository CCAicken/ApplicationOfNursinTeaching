package Model;



/**
 * TUserType entity. @author MyEclipse Persistence Tools
 */

public class TUserType implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer typeId;
	private String typeName;
	private String createTime;

	// Constructors

	/** default constructor */
	public TUserType() {
	}

	/** full constructor */
	public TUserType(Integer typeId, String typeName, String createTime) {
		this.typeId = typeId;
		this.typeName = typeName;
		this.createTime = createTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}