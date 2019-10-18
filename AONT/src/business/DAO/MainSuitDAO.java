package business.DAO;

import java.util.List;

import Model.TMainSuit;
import Model.VMainSuit;

/***
 * 主要症状模块接口
 * 
 * @author Aicken
 *
 */
public interface MainSuitDAO {
	/**
	 * 添加主诉
	 * 
	 * @param ms
	 * @return
	 */
	public int addMainSuit(TMainSuit ms);

	/**
	 * 编辑主诉
	 * 
	 * @param ms
	 * @return
	 */
	public boolean editMainSuit(TMainSuit ms);

	/**
	 * 删除主诉信息
	 * 
	 * @param msId
	 * @return
	 */
	public boolean delMainSuit(int msId);

	/**
	 * 获取所有主诉及病人信息
	 * 
	 * @return
	 */
	public List<VMainSuit> getAllMs();

	/**
	 * 根据主诉Id获取主诉对应基本信息
	 * 
	 * @param msId
	 * @return
	 */
	public VMainSuit getMsByMsId(int msId);

	/**
	 * 获取主诉数量
	 * 
	 * @param strwhere
	 * @return
	 */
	public int getMsCoun(String strwhere);

	/**
	 * 分页获取主诉信息
	 * 
	 * @param strwhere
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<VMainSuit> selMsByPage(String strwhere, int page, int limit);
}
