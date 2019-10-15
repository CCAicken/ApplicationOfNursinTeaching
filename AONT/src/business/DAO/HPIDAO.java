package business.DAO;

import java.util.List;

import Model.THPI;
import Model.VMainSuit;

/**
 * 现病史模块接口
 * 
 * @author Aicken
 *
 */
public interface HPIDAO {
	/**
	 * 添加现病史信息
	 * 
	 * @param hpi
	 * @return
	 */
	public int addHPI(THPI hpi);

	/**
	 * 
	 * 编辑现病史信息
	 * 
	 * @param hpi
	 * @return
	 */
	public boolean editHPI(THPI hpi);

	/**
	 * 删除现病史信息
	 * 
	 * @param hpiId
	 * @return
	 */
	public boolean delHPI(int hpiId);

	/**
	 * 根据现病史Id获取现病史信息
	 * 
	 * @param hpiId
	 * @return
	 */
	public THPI getByHPIId(int hpiId);

	/**
	 * 从现病史表获取所有现病史信息
	 * 
	 * @return
	 */
	public List<THPI> getAllFromTHPI();

	/**
	 * 从主诉视图中获取所有现病史信息
	 * 
	 * @return
	 */
	public List<VMainSuit> getAllFromVMS();

	/**
	 * 根据病人Id获取现病史信息
	 * 
	 * @param pid
	 * @return
	 */
	public VMainSuit getHPIBYPatId(int pid);
}
