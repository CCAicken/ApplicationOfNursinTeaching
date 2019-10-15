package Model;

/**
 * TKeyword entity. @author MyEclipse Persistence Tools
 */

public class TKeyword implements java.io.Serializable {

	// Fields

	private Integer keyWordId;
	private String keyWord;
	private String keyWordType;

	// Constructors

	/** default constructor */
	public TKeyword() {
	}

	/** full constructor */
	public TKeyword(String keyWord, String keyWordType) {
		this.keyWord = keyWord;
		this.keyWordType = keyWordType;
	}

	// Property accessors

	public Integer getKeyWordId() {
		return this.keyWordId;
	}

	public void setKeyWordId(Integer keyWordId) {
		this.keyWordId = keyWordId;
	}

	public String getKeyWord() {
		return this.keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getKeyWordType() {
		return this.keyWordType;
	}

	public void setKeyWordType(String keyWordType) {
		this.keyWordType = keyWordType;
	}

}