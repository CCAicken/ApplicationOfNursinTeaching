package Model;

/**
 * TProportion entity. @author MyEclipse Persistence Tools
 */

public class TProportion implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private String proportion;

	// Constructors

	/** default constructor */
	public TProportion() {
	}

	/** full constructor */
	public TProportion(String pname, String proportion) {
		this.pname = pname;
		this.proportion = proportion;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getProportion() {
		return this.proportion;
	}

	public void setProportion(String proportion) {
		this.proportion = proportion;
	}

}