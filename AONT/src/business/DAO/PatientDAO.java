package business.DAO;

import java.util.List;

import Model.TPatient;
import Model.VMainSuit;
import Model.VPatient;

/***
 * 
 * @author Aicken 病人模块接口设计
 */
public interface PatientDAO {
	/**
	 * 添加病人
	 * 
	 * @param patient
	 * @return
	 */
	public int addPat(TPatient patient);

	/**
	 * 编辑病人信息
	 * 
	 * @param patient
	 * @return
	 */
	public boolean editPat(TPatient patient);

	/**
	 * 根据病人Id删除病人信息
	 * 
	 * @param patId
	 * @return
	 */
	public boolean delPat(int patId);

	// /**
	// * 获取所有病人信息
	// *
	// * @return
	// */
	// public List<TPatient> getAllPat();

	// /**
	// * 根据病人Id获取病人信息
	// *
	// * @param patId
	// * @return
	// */
	// public TPatient getPatById(int patId);
	/**
	 * 根据病人Id获取病人基本信息
	 * 
	 * @param pId
	 * @return
	 */
	public VPatient getPatByPId(int pId);

	/**
	 * 获取所有病人基本信息
	 * 
	 * @return
	 */
	public List<VPatient> getAllPat();

	/**
	 * 获取病人数量
	 * 
	 * @param strwhere
	 * @return
	 */
	public int getPatCount(String strwhere);

	/**
	 * 
	 * @param strwhere
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<VMainSuit> getPatByPage(String strwhere, int page, int limit);

	public int getPatCountForV(String strwhere);

	/**
	 * 
	 * @param strwhere
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<VPatient> getPatByPageForV(String strwhere, int page, int limit);
}
