package business.DAO;

import java.util.List;

import Model.TMainSuit;

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
	public List<TMainSuit> getAllMs();

}
